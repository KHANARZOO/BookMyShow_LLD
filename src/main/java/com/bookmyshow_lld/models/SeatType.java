package com.bookmyshow_lld.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeatType extends BaseModel{
    private String name;
}
/*
We can take SeatType as ENUM but that will be fixed
there might be possibility that seatType vary according to theater
eg -> 1 theater recliner seat named as "Platinum" and other theater named as "VIP"
 */