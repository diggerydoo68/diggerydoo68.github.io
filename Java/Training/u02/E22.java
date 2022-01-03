package com.themisinc.u02;

public class E22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reservationNumber = 130323;
		int seats = 12;
		int numberOfDays = 5;
		double dayRatePerSeat = 25.21;
		
		double roomAmount = seats * numberOfDays * dayRatePerSeat;
		
		System.out.println("Reservation: " + reservationNumber + "\nNumber of seats: " + seats + "\nNumber of days: " + numberOfDays + "\nRoom Amount: " + roomAmount);

	}

}
