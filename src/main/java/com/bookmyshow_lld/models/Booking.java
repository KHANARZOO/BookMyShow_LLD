package com.bookmyshow_lld.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//Booking class -> Movie Ticket
@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    @ManyToOne
    private User user;
    @OneToMany
    private List<Payment> payment;
    @ManyToMany
    private List<ShowSeat> showSeats;
    private int amount; //20050 -> 200.50
}
/*
Cardinality
    Booking/Ticket  --> User =
    Booking/Ticket  <-- User
          M  <-- 1
          1  --> 1
          ----------
            M : 1

     ==============================
     Booking/Ticket  --> Payment
     Booking/Ticket  <-- Payment
          1  <-- 1
          1  --> M(Partial Payments)
          ----------
            1 : M

     ==============================
      Booking/Ticket  --> ShowSeat -> (Show - Seat - ShowSeatStatus)
      Booking/Ticket  <-- ShowSeat
          M  <-- 1
          1  --> M
          ----------
            M : M

 */