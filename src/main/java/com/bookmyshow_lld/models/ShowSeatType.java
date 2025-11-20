package com.bookmyshow_lld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private SeatType seatType;
    private int price;
}
/*
        ShowSeatType  --> Show
        ShowSeatType  <-- Show
          M   <-- 1
          1   --> 1
          ----------
            M : 1
      ====================
         ShowSeatType  --> seatType
         ShowSeatType  <-- seatType
          M   <-- 1
          1   --> 1
          ----------
            M : 1
 */