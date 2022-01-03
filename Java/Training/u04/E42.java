package com.themisinc.u04;

public class E42 {

	public static void main(String[] args) {
		int reservationNumber = 130323;
        int seats             = validateSeats (12);
        int numberOfDays      = validateNumberOfDays (5);
        double dayRatePerSeat = 
            validateDayRatePerSeat (43.23);
 
        double roomAmount =
            seats * numberOfDays * dayRatePerSeat;
       
        printOneReservation (reservationNumber, seats,
            numberOfDays, roomAmount );
    }

    public static int validateSeats (int s) {
        switch (s) {
            case 8:  break;
            case 10: break;
            case 12: break;
            case 14: break;
            default: System.err.println ("Invalid seats "
                         + s + ", will be set to 12");
                     return 12;
        } 
        return s;
    }

    public static int validateNumberOfDays (int n) {
        if (n < 1 || n > 5) {
            System.err.println ("Invalid numberOfDays "
                + n + ", will be set to 5");
            return 5;
        }
        return n;
    }

    public static double validateDayRatePerSeat (double d) {
        if (d < 25.00 || d > 65.00) {
            System.err.println ("Invalid dayRatePerSeat "
                + d + ", will be set to 25.00");
            return 25.00;
        } 
        return d;
    }
 
    public static void printOneReservation (
    int reservationNumber, int seats, int numberOfDays,
    double roomAmount 
    ) {
        System.out.println (
           "Reservation: " + reservationNumber +
         "\nNumber of seats: " + seats +
         "\nNumber of days: " + numberOfDays +
         "\nRoom Amount: " + roomAmount );
    }

	}
