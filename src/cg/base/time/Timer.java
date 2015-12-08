package cg.base.time;

import cg.base.time.TimeOutCallback.TimeListener;

public interface Timer extends Runnable {
	
	int getTime();
	
	int getSleepTime();
	
	TimeListener addTimeOutCallbak(TimeOutCallback callback, int lastTime);
	
	TimeListener addTimeOutCallbak(TimeOutCallback callback, int[] lastTimes, int[] keys);
	
	void addTimeOutCallback(TimeListener timeListener);

}
