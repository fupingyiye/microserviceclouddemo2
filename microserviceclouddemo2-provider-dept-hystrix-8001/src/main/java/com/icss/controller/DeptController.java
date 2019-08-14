package com.icss.controller;


import com.icss.service.DeptService;
import com.icss.entities.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;
import  org.springframework.cloud.client.discovery.DiscoveryClient;


import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService service;


    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    //服务熔断注解，相当于spring中的前置通知等
    @HystrixCommand(fallbackMethod = "processHystrix_get")
    public Dept get(@PathVariable("id") Long id){
        Dept dept=service.get(id);
        if(null==dept){
            throw  new RuntimeException("该ID："+id+"没有对应的信息");
        }
        return dept ;
    }

    public  Dept processHystrix_get(@PathVariable("id") Long id){
        Dept dept =new Dept();
        dept.setDeptno(id);
        dept.setDname("该ID:"+id+"没有对应的信息---hystrixcommand");
        dept.setDb_source("no this database in mysql");
        return dept;
    }

}
