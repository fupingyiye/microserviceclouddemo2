package com.icss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_app {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_app.class,args);
    }
}
