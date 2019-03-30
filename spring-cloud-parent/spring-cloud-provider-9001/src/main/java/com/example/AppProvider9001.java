package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppProvider9001 {
    public static void main(String[] args) {
        SpringApplication.run(AppProvider9001.class,args);
    }
}
