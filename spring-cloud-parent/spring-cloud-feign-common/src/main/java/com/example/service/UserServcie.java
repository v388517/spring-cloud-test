package com.example.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name="APP-USER",fallbackFactory = UserClientFactory.class)
public interface UserServcie {
    /**
     * 跳转至服务名称为：APP-USER
     * url:/user/findOne
     * @return
     */
    @GetMapping("/user/findOne")
    String findOne();

    @GetMapping("/user/getInfo")
    String getInfo();

}
