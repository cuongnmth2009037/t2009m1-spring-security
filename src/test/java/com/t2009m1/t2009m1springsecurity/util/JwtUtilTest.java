package com.t2009m1.t2009m1springsecurity.util;

import com.t2009m1.t2009m1springsecurity.entity.Account;
import org.junit.jupiter.api.Test;

import java.nio.channels.AcceptPendingException;

import static org.junit.jupiter.api.Assertions.*;

class JwtUtilTest {
    @Test
    public void testGenerateToken(){
        Account account = Account.builder()
                .id(System.currentTimeMillis())
                .role(1)
                .username("nguyencuong1")
                .passwordHash("asd")
                .build();
        String accessToken = JwtUtil.generateTokenByAccount(account, 15 * 24 * 60 * 60 * 1000);
        System.out.println(accessToken);
    }
}