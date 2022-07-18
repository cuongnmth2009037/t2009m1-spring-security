package com.t2009m1.t2009m1springsecurity.service;

import com.t2009m1.t2009m1springsecurity.T2009m1SpringSecurityApplication;
import com.t2009m1.t2009m1springsecurity.entity.Credential;
import com.t2009m1.t2009m1springsecurity.entity.dto.AccountLoginDto;
import com.t2009m1.t2009m1springsecurity.entity.dto.AccountRegisterDto;
import com.t2009m1.t2009m1springsecurity.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = T2009m1SpringSecurityApplication.class)
class AccountServiceTest {
    @Autowired
    AccountService accountService;

    @Test
    void register() {
        AccountRegisterDto accountRegisterDto = new AccountRegisterDto();
        accountRegisterDto.setUsername("nguyencuong");
        accountRegisterDto.setPassword("123456");
        accountRegisterDto.setRole(1);
        AccountRegisterDto afterCreate = accountService.register(accountRegisterDto);
        System.out.println(afterCreate);
    }

    @Test
    void login() {
        AccountLoginDto accountLoginDto = new AccountLoginDto();
        accountLoginDto.setUsername("nguyencuong");
        accountLoginDto.setPassword("123456");
        Credential credential = accountService.login(accountLoginDto);
        System.out.println(credential.toString());
    }
}