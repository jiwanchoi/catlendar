package com.catlendar.app.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private String userId;
    private String name;
    private String email;
    private String password;
    private Date birthdate;
    private Date signupDate;
}