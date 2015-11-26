package cg.base.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

/**
 * 日期工具
 * @author	fuhuiyuan
 */
public class DateUtil {
	
	public static final int DAY_HOURS = 24;
	
	public static final int HOUR_MINTUES = 60;
	
	public static final int MINTUE_SECONDS = 60;
	
	public static final int SECOND_MILLIS = 1000;
	
	public static final int DAY_SECONDS = DAY_HOURS * HOUR_MINTUES * MINTUE_SECONDS;
	
	public static final int DAY_SECOND = DAY_HOURS * HOUR_MINTUES * MINTUE_SECONDS;
	
	public static final int DAY_MILLIS = DAY_SECONDS * SECOND_MILLIS;
	/**格式化工具*/
	private static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd,hh:mm:ss");
	
	private static byte DAY_REFRESH_CLOCK = 3;
	
	public static String formatDate(Date date) {
		return dateFormat.format(date);
	}
	
	public static void main(String[] args) {
		System.out.println(formatDate(new Date()));
	}
	
	public static int getMilliSecondStartOfTheNextDay() {
		DateTime time = DateTime.now();
        return DAY_MILLIS - time.getMillisOfDay();
    }
	
	public static long getMilliSecondStartOfThisDay() {
		DateTime time = DateTime.now();
		return time.toDate().getTime() - time.getMillisOfDay();
	}
	
	public static int getMilliSecondStart(byte clock) {
		DateTime time = DateTime.now();
		int clockMills = clock * HOUR_MINTUES * MINTUE_SECONDS * SECOND_MILLIS;
		if (time.getHourOfDay() < clock) {
			return clockMills - time.getMillisOfDay();
		} else {
			return getMilliSecondStartOfTheNextDay() + clockMills;
		}
	}
	
	public static void setDayRefreshClock(byte clock) {
		DAY_REFRESH_CLOCK = clock;
	}
	
	public static int getMilliSecondStartOfDayRefresh() {
		return DateUtil.getMilliSecondStart(DAY_REFRESH_CLOCK);
	}
	
	public static int getSecondOfDayRefresh() {
		return DAY_REFRESH_CLOCK * HOUR_MINTUES * MINTUE_SECONDS;
	}
	
	public static int getDayOfWeek() {
		return getDayOfWeek(DateTime.now());
	}
	
	public static int getDayOfWeek(DateTime time) {
		return time.getDayOfWeek();
	}

}
