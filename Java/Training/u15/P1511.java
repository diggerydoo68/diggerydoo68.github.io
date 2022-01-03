package com.themsinc.u15;
import java.time.LocalTime;

public class P1511 {

	public static void main(String[] args) {
		
		LocalTime lt = LocalTime.now();
		System.out.println("1. "
				+ lt + ", "
				+ lt.getHour() + ", "
				+ lt.getMinute() + ", "
				+ lt.getSecond() + ", "
				+ lt.getNano());
		
		LocalTime lt2 = LocalTime.of(10, 20);
		LocalTime lt3 = LocalTime.of(13,  12, 29);
		System.out.println("2. " + lt2 + ", " + lt3);
		

	}

}
