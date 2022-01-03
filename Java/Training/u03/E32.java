package com.themisinc.u03;

public class E32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int reservationNumber = 130323;
	        int seats = 2;                        //invalid value
	        int numberOfDays = 6;                 //invalid value
	        double dayRatePerSeat = 75.20;        //invalid value

	        switch (seats) {
	            case 8:  break;
	            case 10: break;
	            case 12: break;
	            case 14: break;
	            default: System.err.println ("Invalid seats "
	                         + seats + ", will be set to 12");
	                     seats = 12;
	        }

	        if (numberOfDays < 1 || numberOfDays > 5) {
	            System.err.println ("Invalid numberOfDays "
	                + numberOfDays + ", will be set to 5");
	            numberOfDays = 5;
	        }
	  
	        if (dayRatePerSeat<25.00 || dayRatePerSeat>65.00) {
	            System.err.println ("Invalid dayRatePerSeat "
	                + dayRatePerSeat + ", will be set to 25.00");
	            dayRatePerSeat = 25.00;
	        } 

	        double roomAmount =
	            seats * numberOfDays * dayRatePerSeat;

	        System.out.println (
	           "Reservation: " + reservationNumber +
	         "\nNumber of seats: " + seats +
	         "\nNumber of days: " + numberOfDays +
	         "\nRoom Amount: " + roomAmount );

	}

}
