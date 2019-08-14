package com.icss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
//开启熔断监控
@EnableHystrixDashboard
//@EnableTurbine
public class DeptConsumer_Dashboard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Dashboard_App .class,args);

    }
}
