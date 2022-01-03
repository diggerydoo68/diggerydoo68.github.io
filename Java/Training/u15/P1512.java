package com.themsinc.u15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class P1512 {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("1. " + ldt);
		
		ldt = LocalDateTime.of(2021, 7, 4, 20, 11, 12);
		System.out.println("2. " + ldt);
		
		ldt = LocalDateTime.parse("2021-07-04T17:15:10");
		System.out.println("3. " + ldt);
		
		LocalDate id = LocalDate.now();
		LocalTime lt = LocalTime.now();
		ldt = LocalDateTime.of (ld, lt);
		System.out.println("4. " + ldt + ", " ldt.getMonth() + ", " + ldt.getMonthValue());

	}

}
