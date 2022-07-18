package com.t2009m1.t2009m1springsecurity.entity.dto;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountLoginDto {
    private String username;
    private String password;
}
