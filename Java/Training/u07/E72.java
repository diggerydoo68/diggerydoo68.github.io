package com.themisinc.u07;

public class E72 {

	public static void main(String[] args) {
		RoomReservation72 rr323 = new RoomReservation72 (130323, 12, 5, 25.00);
		rr323.printOneReservation ();
		
		RoomReservation72 rr444 = new RoomReservation72 (130444, 14, 3); //no dayRatePerSeat
		rr444.printOneReservation();

	}

}
