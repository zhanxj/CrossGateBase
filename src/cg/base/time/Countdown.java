package cg.base.time;

import java.util.Hashtable;
import java.util.Map;

import cg.base.util.Updatable;

public class Countdown implements Updatable {
	
	public enum NAME {
		
		food, 
		
	}
	
	private final Map<NAME, TimeInfo> timers;
	
	private final Time timer;
	
	public Countdown(Time timer) {
		this.timer = timer;
		timers = new Hashtable<NAME, TimeInfo>();
	}

	@Override
	public void update() {
		int time = timer.getTime();
		TimeInfo[] timeInfos = timers.values().toArray(new TimeInfo[timers.size()]);
		for (TimeInfo timeInfo : timeInfos) {
			if (time - timeInfo.startTime >= timeInfo.countdownTime) {
				timers.remove(timeInfo.name);
			}
		}
	}
	
	public void addTimer(NAME name, int countdownTime) {
		if (countdownTime > 0) {
			TimeInfo timeInfo = new TimeInfo();
			timeInfo.countdownTime = countdownTime;
			timeInfo.startTime = timer.getTime();
			timeInfo.name = name;
			timers.put(name, timeInfo);
		}
	}
	
	public boolean hasTimer(NAME name) {
		return timers.containsKey(name);
	}
	
	private static class TimeInfo {
		
		private int startTime, countdownTime;
		
		private NAME name;
		
	}

}
