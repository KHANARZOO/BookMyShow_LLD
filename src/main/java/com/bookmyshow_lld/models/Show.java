package com.bookmyshow_lld.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "shows`")
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Screen screen;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;

}
/*
        Show  --> Movie
        Show  <-- Movie
          M   <-- 1
          1   --> 1
          ----------
            M : 1
         ================
        Show  --> Screen
        Show  <-- Screen
          M   <-- 1
          1   --> 1
          ----------
            M : 1
         ===============
        Show  --> Feature
        Show  <-- Feature
          M   <-- 1
          1   --> 1
          ----------
            M : 1
 */
