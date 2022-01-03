package com.themisinc.u06;

public class RoomReservation62 { //business class
	//instance variables
	private int reservationNumber;
    private int seats;
    private int numberOfDays;
    private double dayRatePerSeat;

    private double roomAmount;
 
    public RoomReservation62 () { //constructor
    }

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
    public void setReservationNumber (int r) { //setters
        reservationNumber = r;
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
                     seats = 12;
        } 
        this.seats = seats; //designates the variable of the object
    }

    public int getNumberOfDays () {
        return numberOfDays;
    }
    public void setNumberOfDays (int numberOfDays) {
        if (numberOfDays < 1 || numberOfDays > 5) {
            System.err.println ("Invalid numberOfDays "
                + numberOfDays + ", will be set to 5");
            numberOfDays = 5;
        }
        this.numberOfDays = numberOfDays;
    }
  
    public double getDayRatePerSeat () {
        return dayRatePerSeat;
    }
    public void setDayRatePerSeat (double dayRatePerSeat){
        if (dayRatePerSeat<25.00 || dayRatePerSeat>65.00) {
            System.err.println ("Invalid dayRatePerSeat "
                + dayRatePerSeat + ", will be set to 25.00");
            dayRatePerSeat = 25.00;
        } 
        this.dayRatePerSeat = dayRatePerSeat;
    }

}
