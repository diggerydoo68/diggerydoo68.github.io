package com.themisinc.u08;

public class TC803 {
	//private means that your variable or method may be accessed only by other members of the same class
	//public means that your variable or method may be accessed by code in any other class in the same program
	//protected means that your variable or method may be accessed by code in another class in the same program IF that class is in the same package as your class.
	private static int numStudentsInHouse; // this is = 0. because static area is cleared to all zeros. total accumulator  
	private static int numScheduled;  //number generator
	private int myNumber;
	private String name; 
	private int seats;
	
	public TC803 (String name, int seats){
		this.name = name; //constructor is assigning in lieu of getters and setters
		setSeats (seats);
		numScheduled++;
		myNumber = numScheduled;
	}

	public static int getNumScheduled() {
		return numScheduled;
	}
	public static int getNumStudentsInHouse() {
		return numStudentsInHouse;
	}

	public void setSeats(int seats) {
		this.seats = seats;
		numStudentsInHouse = numStudentsInHouse + seats;
	}
	
	public String toString(){
		return "TC803:" + myNumber + "," + name + "," + seats;
	}

}
