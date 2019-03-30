package com.example.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringCloudConfig {
    /**
     * 引入ribbon负载均衡
     *
     * @return
     */
    @Bean
    @LoadBalanced  //引入ribbon负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * 自定义轮询算法
     * RetryRule 试探算法
     *
     * @return
     */
    @Bean
    public IRule getIRule() {
        return new RetryRule();
    }


}
