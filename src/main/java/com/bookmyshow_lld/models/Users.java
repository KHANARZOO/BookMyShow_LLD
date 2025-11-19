package com.bookmyshow_lld.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Users extends  BaseModel{
    private String name;
    private String email;
    private String password;
}
