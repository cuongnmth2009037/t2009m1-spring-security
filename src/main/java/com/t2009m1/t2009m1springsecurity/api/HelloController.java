package com.t2009m1.t2009m1springsecurity.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String say(){
        return "Hello";
    }
}
