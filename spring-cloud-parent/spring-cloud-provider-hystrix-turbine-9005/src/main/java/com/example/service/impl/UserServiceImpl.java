package com.example.service.impl;

import com.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String findOne() {
        return "enter Hystrix turbine  userService  9005";
    }

    @Override
    public String getInfo() {
        return "enter userService getInfo 9005";
    }
}
