package com.bookmyshow_lld.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

//Booking class -> Movie Ticket
@Getter
@Setter
public class Booking extends BaseModel{
    private BookingStatus bookingStatus;
    private Users user;
    private List<Payment> payment;
    private List<ShowSeat> showSeats;
    private int amount; //20050 -> 200.50
}
