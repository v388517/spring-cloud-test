package com.example.controller;

import com.example.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findOne")
    public String findOne() {
        return userService.findOne();
    }


    @RequestMapping("/getInfo")
    public String hystrix() throws InterruptedException {
        Thread.sleep(2000);
        return userService.getInfo();
    }

    /* @RequestMapping("/hystrix")
    @HystrixCommand(fallbackMethod = "getInfo")
    public String hystrix() throws InterruptedException {
        Thread.sleep(2000);
        return "hystrix success";
    }
*/
   /* public String getInfo(){
        return "hystrix timeOut";
    }*/


}
