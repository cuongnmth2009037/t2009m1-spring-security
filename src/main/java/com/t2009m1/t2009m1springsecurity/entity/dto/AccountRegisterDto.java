package com.t2009m1.t2009m1springsecurity.entity.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountRegisterDto {
    private long id;
    private String username;
    private String password;
    private String confirmPassword;
    private int role;
}
