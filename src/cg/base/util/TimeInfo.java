package cg.base.util;

public class TimeInfo {
	
	private int hour, mintue, second;
	
	public TimeInfo(String time) {
		this(time.split(":"));
	}
	
	public TimeInfo(String[] time) {
		int hour = Integer.parseInt(time[0]);
		int mintue = Integer.parseInt(time[1]);
		int second = Integer.parseInt(time[2]);
		init(hour, mintue, second);
	}
	
	public TimeInfo(int hour, int mintue, int second) {
		init(hour, mintue, second);
	}
	
	protected void init(int hour, int mintue, int second) {
		this.hour = hour;
		this.mintue = mintue;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMintue() {
		return mintue;
	}

	public int getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return getClass() + " [" + getHour() + ":" + getMintue() + ":" + getSecond() + "]";
	}

}
