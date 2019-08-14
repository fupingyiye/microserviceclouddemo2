package com.icss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//ribbon负载均衡添加的相应注解
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.icss"})
//@ComponentScan("com.icss")
public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
       SpringApplication.run(DeptConsumer80_Feign_App.class,args);

    }
}