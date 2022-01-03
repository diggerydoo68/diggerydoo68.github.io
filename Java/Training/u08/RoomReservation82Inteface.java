package com.themisinc.u08;

public interface RoomReservation82Interface {
    
    int DEFAULT_SEATS = 12;
    int DEFAULT_NUMBER_OF_DAYS = 5;
    double DEFAULT_DAY_RATE_PER_SEAT = 25.00;
    
    void printOneReservation();
    int getReservationNumber();
    void setReservationNumber(int reservationNumber);
    int getSeats();
    void setSeats(int seats);
    int getNumberOfDays();
    void setNumberOfDays(int numberOfDays);
    double getDayRatePerSeat();
    void setDayRatePerSeat(double dayRatePerSeat);
}
