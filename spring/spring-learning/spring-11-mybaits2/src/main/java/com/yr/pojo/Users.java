package com.yr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private int id;
    private String name;
    private String password;
    private String email;
    private String birthday;
}
