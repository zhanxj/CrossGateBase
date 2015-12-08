package cg.base.time;

import java.util.List;

import cg.base.time.TimeOutCallback.TimeListener;

import com.google.common.collect.Lists;

public class CTimer implements Timer {
	
	protected static int SYSTEM_SLEEP_TIME = 50;
	
	protected long startTime;
	
	protected List<TimeListener> cellTimers;
	
	protected static class SingletonHolder {
		
		private static Timer instance = new CTimer();
		
	}
	
	public static Timer getInstance() {  
		return SingletonHolder.instance;
	}
	
	protected CTimer() {
		startTime = System.currentTimeMillis();
		cellTimers = Lists.newArrayList();
	}

	@Override
	public int getTime() {
		return (int) (System.currentTimeMillis() - startTime);
	}

	@Override
	public int getSleepTime() {
		return SYSTEM_SLEEP_TIME;
	}

	@Override
	public void run() {
		for (int i = cellTimers.size() - 1;i >=0;i--) {
			if (cellTimers.get(i).update(getTime())) {
				cellTimers.remove(i);
			}
		}
	}

	@Override
	public TimeListener addTimeOutCallbak(TimeOutCallback callback, int lastTime) {
		return addTimeOutCallbak(callback, new int[]{lastTime}, new int[]{0});
	}

	@Override
	public TimeListener addTimeOutCallbak(TimeOutCallback callback, int[] lastTimes, int[] keys) {
		CellTimer cellTimer = new CellTimer();
		cellTimer.startTime = getTime();
		cellTimer.callback = callback;
		cellTimer.lastTimes = lastTimes;
		cellTimer.keys = keys;
		cellTimer.timer = this;
		addTimeOutCallback(cellTimer);
		return cellTimer;
	}

	@Override
	public void addTimeOutCallback(TimeListener timeListener) {
		cellTimers.add(timeListener);
	}

}

class CellTimer implements TimeListener {
	
	int startTime;
	
	int[] lastTimes, keys;
	
	TimeOutCallback callback;
	
	boolean forceRemove;
	
	Timer timer;
	
	private int index;

	@Override
	public boolean update(int time) {
		if (forceRemove) {
			return true;
		} else if (lastTimes[index] <= time - startTime) {
			if (index < lastTimes.length - 1) {
				callback.timeOut(keys[index]);
				index++;
				startTime = time;
				return false;
			} else {
				callback.timeOut(keys[index]);
				return true;
			}
		} else {
			return false;
		}
	}

	@Override
	public void changLastTime(int lastTime) {
		lastTimes[index] = lastTime;
	}

	@Override
	public void remove() {
		forceRemove = true;
	}

	@Override
	public int getTime() {
		return timer.getTime() - startTime;
	}
	
}
