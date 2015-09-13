package cg.base.util;

import java.io.*;
import java.util.*;

/**
 * 监控文件改变的工具类。要监控文件的对象必须实现IFileModificationListener接口，调用watch方法监控一个文件。
 * 注意不用监控时必须调用unwatch取消监控。
 * @author lighthu
 */
public class FileWatcher extends Thread {
	
    private static HashMap<File, List<IFileModificationListener>> listeners = new HashMap<File, List<IFileModificationListener>>();
    
    private static HashMap<File, Long> lastModifyTimes = new HashMap<File, Long>(); 
    
    static {
        new FileWatcher().start();
    }
    
    /**
     * 监控一个文件。当文件改变时调用监听者的fileModified方法。
     * @param f 被监控文件 
     * @param listener 监听者
     */
    public static void watch(File f, IFileModificationListener listener) {
        synchronized (listeners) {
            List<IFileModificationListener> list = listeners.get(f);
            if (list == null) {
                list = new ArrayList<IFileModificationListener>();
                listeners.put(f, list);
                lastModifyTimes.put(f, f.lastModified());
            }
            for (IFileModificationListener l : list) {
                if (l == listener) {
                    return;
                }
            }
            list.add(listener);
        }
    }
    
    /**
     * 取消一个监听者对一个文件的监控。
     * @param f 被监控文件
     * @param listener 监听者
     */
    public static void unwatch(File f, IFileModificationListener listener) {
        synchronized (listeners) {
            List<IFileModificationListener> list = listeners.get(f);
            if (list == null) {
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == listener) {
                    list.remove(i);
                    if (list.size() == 0) {
                        listeners.remove(f);
                        lastModifyTimes.remove(f);
                    }
                    return;
                }
            }
        }
    }
    
    /**
     * 取消一个监听者的所有监听文件。
     * @param listener 监听者
     */
    public static void unwatch(IFileModificationListener listener) {
        synchronized (listeners) {
            Iterator<File> itor = listeners.keySet().iterator();
            while (itor.hasNext()) {
                File f = itor.next();
                List<IFileModificationListener> list = listeners.get(f);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == listener) {
                        list.remove(i);
                        if (list.size() == 0) {
                            itor.remove();
                            lastModifyTimes.remove(f);
                        }
                        break;
                    }
                }
            }
        }
    }
    
    /**
     * 轮询线程。
     */
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            
            List<IFileModificationListener> notifyListeners = new ArrayList<IFileModificationListener>();
            List<File> notifyFiles = new ArrayList<File>();
            
            // 扫描所有被监控文件的修改时间
            synchronized (listeners) {
                Iterator<File> itor = listeners.keySet().iterator();
                while (itor.hasNext()) {
                    File f = itor.next();
                    if (f.lastModified() != lastModifyTimes.get(f)) {
                        lastModifyTimes.put(f, f.lastModified());
                        List<IFileModificationListener> list = listeners.get(f);
                        for (IFileModificationListener listener : list) {
                            notifyListeners.add(listener);
                            notifyFiles.add(f);
                        }
                    }
                }
            }
            
            // 对于被修改的文件，通知所有监控这些文件的监听者
            for (int i = 0; i < notifyListeners.size(); i++) {
                try {
                    notifyListeners.get(i).fileModified(notifyFiles.get(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
