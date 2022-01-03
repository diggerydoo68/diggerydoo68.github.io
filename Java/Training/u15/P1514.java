package com.themsinc.u15;

//import static to omit classname qualifier of static members
import static java.time.DayOfWeek.MONDAY; //enum
import static java.time.temporal.TemporalAdjusters.*;
import java.time.LocalDate;

public class P1514 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		
		LocalDate givenYear = now.withYear(2021);
		LocalDate givenMDay = now.withDayOfMonth(6);
		LocalDate lastMDay = now.with(lastDayOfMonth());
		LocalDate nextMonday = now.with(next(MONDAY));
		LocalDate inTwoMonths = now.plusMonths(2);
		LocalDate twoYearsAgo = now.minusYears(2);
		
		Object[] a = {
				now, givenYear, givenMDay, lastMDay, nextMonday, inTwoMonths, twoYearsAgo
		};
		for (int i=0; i<a.length; i++){
			System.out.println(i + ". " + a[i]);
		}

	}

}
