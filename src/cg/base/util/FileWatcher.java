package cg.base.util;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * ����ļ��ı�Ĺ����ࡣҪ����ļ��Ķ������ʵ��IFileModificationListener�ӿڣ�����watch�������һ���ļ���
 * ע�ⲻ�ü��ʱ�������unwatchȡ����ء�
 * @author lighthu
 */
public class FileWatcher extends Thread {
	
    private static ListMultimap<File, IFileModificationListener> listeners = ArrayListMultimap.create();
    
    private static Map<File, Long> lastModifyTimes = Maps.newHashMap(); 
    
    static {
        new FileWatcher().start();
    }
    
    /**
     * ���һ���ļ������ļ��ı�ʱ���ü����ߵ�fileModified������
     * @param f ������ļ� 
     * @param listener ������
     */
    public static void watch(File f, IFileModificationListener listener) {
        synchronized (listeners) {
            List<IFileModificationListener> list = listeners.get(f);
            if (list.size() == 0) {
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
     * ȡ��һ�������߶�һ���ļ��ļ�ء�
     * @param f ������ļ�
     * @param listener ������
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
                        lastModifyTimes.remove(f);
                    }
                    return;
                }
            }
        }
    }
    
    /**
     * ȡ��һ�������ߵ����м����ļ���
     * @param listener ������
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
     * ��ѯ�̡߳�
     */
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            
            List<IFileModificationListener> notifyListeners = Lists.newArrayList();
            List<File> notifyFiles = Lists.newArrayList();
            
            // ɨ�����б�����ļ����޸�ʱ��
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
            
            // ���ڱ��޸ĵ��ļ���֪ͨ���м����Щ�ļ��ļ�����
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
