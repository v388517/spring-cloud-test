package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppEureka8002 {

    public static void main(String[] args) {
        SpringApplication.run(AppEureka8002.class,args);
    }
}
