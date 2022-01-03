package com.themisinc.u08;

public class P803 {

	public static void main(String[] args) {
		System.out.println("Number of courses today: " + TC803.getNumScheduled()); // because static area is cleared to all zeros.

		TC803 tc1 /* reference */ = new TC803("Java", 12);
		TC803 tc2 /* reference */ = new TC803("UNIX", 12);

		System.out.println("Number of courses today: " + TC803.getNumScheduled() + ": " + tc1 + " " + tc2 + "\n"
				+ "Number of students in training center: " + TC803.getNumStudentsInHouse());

	}

}
