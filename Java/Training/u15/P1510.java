package com.themsinc.u15;
import java.time.LocalDate;

public class P1510 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println("1. "
				+ ld + ", "
				+ ld.getYear() + ","
				+ ld.getMonth() + ","
				+ ld.getDayOfMonth() + ", "
				+ ld.getDayOfWeek() + ", "
				+ ld.getDayOfYear());
		
		LocalDate ld2 = LocalDate.of(2019, 8, 25);
		LocalDate ld3 = LocalDate.of(2012, 11, 6);
		System.out.println("2. " + ld2 + ", " + ld3);
		

	}

}
