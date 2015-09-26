package wapi.core;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
	public long getNsTimeOfVM(){
		return System.nanoTime();
	}
	public long getMsTimeFrom1970(){
		return System.currentTimeMillis();
	}
	public String getCurrentTime(){
		return LocalTime.now().toString();
	}
	public String getCurrentDate(){
		return LocalDate.now().toString();
	}
}
