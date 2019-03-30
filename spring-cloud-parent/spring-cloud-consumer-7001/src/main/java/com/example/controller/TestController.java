package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestController {
    private final static String PRE_HOST="http://APP-USER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/show")
    public String show() {

        return restTemplate.getForObject(PRE_HOST+"/user/findOne",String.class);
    }

    @RequestMapping("/hystrix")
    public String hystrix() {

        return restTemplate.getForObject(PRE_HOST+"/user/hystrix",String.class);
    }





}
