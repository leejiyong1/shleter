package com.animal.shelter.vo;

import lombok.Data;

@Data
public class User {
    private Integer userID;

    private String name;
    private String email;
    private String password;
    private String contact;
}
