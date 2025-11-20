package com.bookmyshow_lld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name;
    @ManyToMany
    private List<Actor> actors;
}
/*
        Movie  --> Actor
        Movie  <-- Actor
          M  <-- 1
          1  --> M
          ----------
            M : M
 */