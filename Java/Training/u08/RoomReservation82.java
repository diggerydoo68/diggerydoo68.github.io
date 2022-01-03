package com.themisinc.u08;

public class RoomReservation82 {
	//business class
	    // static values
	    public static final int DEFAULT_SEATS = 12;
	    public static final int DEFAULT_NUMBER_OF_DAYS = 5;
	    public static final double DEFAULT_DAY_RATE_PER_SEAT = 25.00;
		
	    //instance variables
		private int reservationNumber;
	    private int seats;
	    private int numberOfDays;
	    private double dayRatePerSeat;

	    private double roomAmount;
	 
	    public RoomReservation82 () { //constructor for object RoomReservation82 rr323
	    }
	    public RoomReservation82 (
	            int reservationNumber, int seats, int numberOfDays, double dayRatePerSeat 
	            ) {
	            setReservationNumber (reservationNumber);
	            setSeats(seats);
	            setNumberOfDays(numberOfDays);
	            setDayRatePerSeat(dayRatePerSeat);
	        } //2nd public constructor for RoomReservation72 rr444
	    //NOTE: is that if you get the duplicate method error on a specific constructor check the datatypes of the parameters and name of method to ensure they are not the same w
	    public RoomReservation82 (
	            int reservationNumber, int seats, int numberOfDays
	            ) {
	            this (reservationNumber, seats, numberOfDays,
	            		DEFAULT_DAY_RATE_PER_SEAT);
	        } //2nd public constructor for RoomReservation72 rr444

	    private void calculateAmount () {
	        roomAmount = seats * numberOfDays * dayRatePerSeat;
	    }
	 
	    public void printOneReservation () {
	        calculateAmount ();
	        System.out.println (
	           "Reservation: " + reservationNumber +
	         "\nNumber of seats: " + seats + 
	         "\nNumber of days: " + numberOfDays + 
	         "\nRoom amount: " + roomAmount + "\n");
	    }  

	    public int getReservationNumber () { //getters
	        return reservationNumber;
	    }
	    public void setReservationNumber (int reservationNumber) { //setters
	        this.reservationNumber = reservationNumber;
	    }  

	    public int getSeats () { //getters
	        return seats;
	    }
	    public void setSeats (int seats) { 
	        switch (seats) {
	            case 8:  break;
	            case 10: break;
	            case 12: break;
	            case 14: break;
	            default: System.err.println ("Invalid seats "
	                         + seats + ", will be set to 12");
	                     seats = DEFAULT_SEATS;
	        } 
	        this.seats = seats; //designates the variable of the object
	    }

	    public int getNumberOfDays () {
	        return numberOfDays;
	    }
	    public void setNumberOfDays (int numberOfDays) {
	        if (numberOfDays < 1 || numberOfDays > DEFAULT_NUMBER_OF_DAYS) {
	            System.err.println ("Invalid numberOfDays "
	                + numberOfDays + ", will be set to " + DEFAULT_NUMBER_OF_DAYS);
	            numberOfDays = DEFAULT_NUMBER_OF_DAYS;
	        }
	        this.numberOfDays = numberOfDays;
	    }
	  
	    public double getDayRatePerSeat () {
	        return dayRatePerSeat;
	    }
	    public void setDayRatePerSeat (double dayRatePerSeat){
	        if (dayRatePerSeat<DEFAULT_DAY_RATE_PER_SEAT || dayRatePerSeat>65.00) {
	            System.err.println ("Invalid dayRatePerSeat "
	                + dayRatePerSeat + ", will be set to " + DEFAULT_DAY_RATE_PER_SEAT);
	            dayRatePerSeat = DEFAULT_DAY_RATE_PER_SEAT;
	        } 
	        this.dayRatePerSeat = dayRatePerSeat;
	    }

}
