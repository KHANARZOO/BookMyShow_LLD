package com.bookmyshow_lld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theater extends BaseModel{
    private String name;
    @ManyToOne
    private City city;
    @OneToMany
    private List<Screen> screens;
}
/*
        Theater  --> City
        Theater  <-- City
          M   <-- 1
          1   --> 1
          ----------
            M : 1
        =========================
        Theater  --> Screen
        Theater  <-- Screen
          1   <-- 1
          1   --> M
          ----------
            1 : M
 */
