package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard  //开启断路器监控配置

public class AppHystrixDashboard {
    public static void main(String[] args) {
        SpringApplication.run(AppHystrixDashboard.class,args);
    }
}
