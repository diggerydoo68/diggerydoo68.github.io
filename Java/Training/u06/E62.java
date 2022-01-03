package com.themisinc.u06;

public class E62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RoomReservation62 rr1 = new RoomReservation62();
	        rr1.setReservationNumber (130323);
	        rr1.setSeats (12);
	        rr1.setNumberOfDays (5);
	        rr1.setDayRatePerSeat (25.00);
	        rr1.printOneReservation ();
	        
	        RoomReservation62 rr2 = new RoomReservation62();
	        rr2.setReservationNumber (130444);
	        rr2.setSeats (15); // this errors out 
	        rr2.setNumberOfDays (6); // this errors out 
	        rr2.setDayRatePerSeat (66.00); // this errors out 
	        rr2.printOneReservation ();
	    
	        RoomReservation62 rr3 = new RoomReservation62();
	        rr3.setReservationNumber (130505);
	        rr3.setSeats (7); // this errors out 
	        rr3.setNumberOfDays (0); // this errors out 
	        rr3.setDayRatePerSeat (24.00); // this errors out 
	        rr3.printOneReservation ();

	}

}
