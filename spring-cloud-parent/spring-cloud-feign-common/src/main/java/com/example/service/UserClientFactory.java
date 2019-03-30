package com.example.service;


import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;


/**
 * 服务融合段超时处理类
 */
@Component
public class UserClientFactory implements FallbackFactory<UserServcie> {

    @Override
    public UserServcie create(Throwable throwable) {
        return new UserServcie() {
            @Override
            public String findOne() {
                return null;
            }

            @Override
            public String getInfo() {
                return "服务出错，降级处理了....";
            }
        };
    }
}
