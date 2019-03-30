package com.example.service.impl;

import com.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String findOne() {
        return "enter Hystrix  userService  9004";
    }

    @Override
    public String getInfo() {
        return "enter userService 9004 getInfo";
    }
}
