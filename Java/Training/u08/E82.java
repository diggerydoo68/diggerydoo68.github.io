package com.themisinc.u08;

public class E82 {

	public static void main(String[] args) {
		RoomReservation82 rr1 = new RoomReservation82();
        rr1.setReservationNumber (130323);
        rr1.setSeats (12);
        rr1.setNumberOfDays (5);
        rr1.setDayRatePerSeat (25.00);
        rr1.printOneReservation ();

        RoomReservation82 rr2 = new RoomReservation82 (
            130444, 15, 6, 66.00);        
        rr2.printOneReservation ();

        RoomReservation82 rr3 = new RoomReservation82 (
            130505, 7, 0);                
        rr3.printOneReservation ();

	}

}
