package com.icss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient//本服务启动后会自动注册进eureka
//@EnableDiscoveryClient//服务发现
@EnableCircuitBreaker//对hystrix服务熔断的支持
public class DeptProvider8001 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001.class,args);
    }
}
