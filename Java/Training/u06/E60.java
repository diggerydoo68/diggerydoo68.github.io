package com.themisinc.u06;

public class E60 {

public static void main(String[] args) {
		
		Tcourse6 tc1; // creating a reference to the class Tcourse6
		tc1 = new Tcourse6("Java", 12); //creating a new object
		
		Tcourse6 tc2 = new Tcourse6("UNIX", 10); // one line to create a reference and an object
		
		System.out.println("1. "+ tc1 + ", " + tc2 + ", " + tc1.getName() + " has " + tc1.getSeats() + ", " + tc2.getName() + " has " + tc2.getSeats());
		
		tc2.setName("XML");
		tc2.setSeats(14);
		
		System.out.println("2. "+ tc1 + ", " + tc2 + ", " + tc1.getName() + " has " + tc1.getSeats() + ", " + tc2.getName() + " has " + tc2.getSeats());
		
		System.out.println("Hello World");

	}

}
