package com.themsinc.u15;
import java.util.Date;

public class P1507 {

	public static void main(String[] args) {
		
		Date now = new Date ();
		System.out.println("1. now is " + now);
		
		long nowMS = now.getTime();
		System.out.println("2. now in MS is " + nowMS);
		
		long oneDayMS = 1000 * 24 * 60 * 60;
		long tomorrowMS = nowMS + oneDayMS;
		
		Date tomorrow = new Date (tomorrowMS);
		System.out.println("3. tommorrow is " + tomorrow);
		
		boolean a = tomorrow.after(now);
		boolean b = now.before (tomorrow);
		boolean e = now.equals (tomorrow);
		System.out.println("4. " + a + ", " + b + ", " + e);
		
		now.setTime(now.getTime() - (2*oneDayMS));
		System.out.println("5. two days ago was " + now);

	}

}
