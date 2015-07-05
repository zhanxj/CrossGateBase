package cg.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import cg.base.log.Log;
import cg.base.util.Updatable;
import cg.base.util.Updater;

/**
 * 默认主线程
 * <p>
 * 游戏的主要线程，用来更新主要的逻辑。实现了 {@link Runnable} 接口，用来在线程中运行。<br>
 * 接口 {@link Updater} 的默认实现类。
 * </p>
 * @author 	hyfu
 */
class CMainThread implements Updater, Runnable {
	
	/**
	 * 更新集合
	 */
	private List<Updatable> updatables;
	
	private Queue<Updatable> waitRemove, waitAdd;
	
	private int sleepTime;
	
	private Log log;
	
	/**
	 * 构造<br>
	 * 完成时会有线程运行。
	 */
	public CMainThread(int sleepTime, Log log) {
		this.sleepTime = sleepTime;
		this.log = log;
		updatables = new ArrayList<Updatable>(); // 创建一个数组集合
		waitRemove = new LinkedList<Updatable>();
		waitAdd = new LinkedList<Updatable>();
		(new Thread(this, "CMainThread")).start(); // 开启线程运行
	}

	@Override
	public void run() {
		while (true) { // 无条件循环
			try {
				long time = System.currentTimeMillis(); // 获得更新前时间（毫秒）
				
				update(); // 更新
				
				time = System.currentTimeMillis() - time; // 计算更新耗时（毫秒）
				
				if (time < sleepTime) { // 更新耗时不足更新间隔时
					synchronized (this) {
						wait(sleepTime - time); // 当前循环等待，时间为补足更新间隔
					}
				} else { // 更新耗时达到或超过更新间隔时
					Thread.yield();
				}
			} catch (Exception e) {
				log.error("CMainThread::run() : ", e); // 输出异常
			}
		}
	}

	@Override
	public void add(Updatable updatable) {
		synchronized (waitAdd) { // 锁住更新集合，防止多线程操作出现异常
			waitAdd.add(updatable); // 添加更新对象
		}
	}

	@Override
	public void update() {
		for (Updatable updatable : updatables) { // 遍历更新集合
			long time = System.currentTimeMillis(); // 获得更新前时间（毫秒）
			
			if (!waitRemove.contains(updatable)) {
				updatable.update(); // 更新当前更新对象
			}
			
			time = System.currentTimeMillis() - time; // 计算更新耗时（毫秒）
			if (time >= sleepTime) { // 更新时间较长
				log.warning("CMainThread::update() too long : " + updatable.getClass().getName() + " ; time = " + time); // 输出更新信息
			}
		}
		synchronized (waitRemove) {
			while (!waitRemove.isEmpty()) {
				updatables.remove(waitRemove.poll());
			}
		}
		synchronized (waitAdd) {
			while (!waitAdd.isEmpty()) {
				updatables.add(waitAdd.poll());
			}
		}
	}

	@Override
	public void remove(Updatable updatable) {
		synchronized (waitRemove) {
			waitRemove.add(updatable);
		}
	}

}
