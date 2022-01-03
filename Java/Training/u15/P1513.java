package com.themsinc.u15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month; //enum with month names

import static java.time.format.FormatStyle.*; //enum
import static java.time.format.DateTimeFormatter.*;

public class P1513 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2011, 8, 25);
		String ldF = ld.format(ofLocalizedDate(FULL));
		String ldL = ld.format(ofLocalizedDate(LONG));
		String ldM = ld.format(ofLocalizedDate(MEDIUM));
		String ldS = ld.format(ofLocalizedDate(SHORT));
		
		System.out.println("1. " + ld + "\n2. " + ldF + "\n3. " + ldL + "\n4. " + ldM + "\n5. " + ldS);
		
		LocalTime lt = LocalTime.of(9, 00, 01);
		
		System.out.println("\n6. " + lt + "\n7. " + lt.format(ofLocalizedTime(MEDIUM)) + "\n8. " + lt.format(ofLocalizedTime(SHORT)));
		
        LocalDateTime ldt = LocalDateTime.of(2012, 11, 6, 16, 11, 12);
		
		System.out.println("\n9. " + ldt + "\n10. " + ldt.format(ofLocalizedDateTime(MEDIUM)) + "\n11. " + ldt.format(ofLocalizedDateTime(SHORT)));
		

	}

}
