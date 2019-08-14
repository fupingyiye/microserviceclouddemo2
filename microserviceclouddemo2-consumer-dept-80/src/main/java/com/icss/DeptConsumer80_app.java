package com.icss;

import com.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@SpringBootApplication
//ribbon负载均衡添加的相应注解
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUDDEMO2-DEPT",configuration = MyRule.class)
public class DeptConsumer80_app {
    public static void main(String[] args) {
       SpringApplication.run(DeptConsumer80_app.class,args);

    }
}