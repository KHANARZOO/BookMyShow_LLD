package com.bookmyshow_lld.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel{
    private String name;
//    private List<Theater> theaters;
}
/*
        City  --> Theater
        City  <-- Theater
          1  <-- 1
          1  --> M
          ----------
            1 : M
 */