package cg.base.time;

public class CTimer implements Time {
	
	protected static int SYSTEM_SLEEP_TIME = 50;
	
	protected long startTime;
	
	public CTimer() {
		startTime = System.currentTimeMillis();
	}

	@Override
	public int getTime() {
		return (int) (System.currentTimeMillis() - startTime);
	}

	@Override
	public int getSleepTime() {
		return SYSTEM_SLEEP_TIME;
	}

}
