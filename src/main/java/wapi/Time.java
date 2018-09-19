package wapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
	/** @deprecated use System.nanoTime() */
	public long getNsTimeOfVM(){
		return System.nanoTime();
	}

	/** @deprecated use System.currentTimeMillis() **/
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
