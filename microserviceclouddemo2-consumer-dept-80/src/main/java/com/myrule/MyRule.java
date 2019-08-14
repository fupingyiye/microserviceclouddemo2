package com.myrule;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//MyRule必须放在不在@componentScan注解下的包以及子 包下
@Configuration
public class MyRule  {
    @Bean
    public IRule getMySelfRule(){
        return new MySelfRule();
    }
}
