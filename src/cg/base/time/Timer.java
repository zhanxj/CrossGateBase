package cg.base.time;

import cg.base.time.TimeOutCallback.TimeListener;
import cg.base.util.Updatable;

public interface Timer extends Updatable {
	
	int getTime();
	
	int getSleepTime();
	
	TimeListener addTimeOutCallbak(TimeOutCallback callback, int lastTime);
	
	TimeListener addTimeOutCallbak(TimeOutCallback callback, int[] lastTimes, int[] keys);
	
	void addTimeOutCallback(TimeListener timeListener);

}
