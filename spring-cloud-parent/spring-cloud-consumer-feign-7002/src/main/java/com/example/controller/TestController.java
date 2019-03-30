package com.example.controller;

import com.example.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestController {

    //注入feign
    @Autowired
    private UserServcie userServcie;

    @RequestMapping("/show")
    public String show() {
        return userServcie.findOne();
    }


    @RequestMapping("/getInfo")
    public String getInfo(){
        return userServcie.getInfo();
    }

}
