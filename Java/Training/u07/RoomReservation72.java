package com.themisinc.u07;

public class RoomReservation72 { //business class
	//instance variables
	private int reservationNumber;
    private int seats;
    private int numberOfDays;
    private double dayRatePerSeat;

    private double roomAmount;
 
    public RoomReservation72 (int reservationNumber, int seats, int numberOfDays, double dayRatePerSeat) { //constructor for object RoomReservation72 rr323. Must have same name as classtype and no return value. Void is also not permitted by Java. line 18 will lose its reference.
    }
    
    public RoomReservation72 (
            int reservationNumber, int seats, int numberOfDays // these are local parameters to the constructor ,even though they have to do with the instance variables above which are not local.
            ) {
            this (reservationNumber, seats, numberOfDays, //This keyword is a method name since parenthesis are follows. It means to call another constructor of this object while the new operator is constructing it. If followed by a dot its an object reference or a reference to an instance varname. One of the possile purposes is to overload the constructor on line 12 
                35.50); //35.50 is a constant
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
        this.seats = seats; //designates the variable of the object. Every object has to have a "this"
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
