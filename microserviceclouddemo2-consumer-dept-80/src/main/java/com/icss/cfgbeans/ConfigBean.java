package com.icss.cfgbeans;
import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import  org.springframework.context.annotation.Bean;
import  org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
//configuration加configbean对象等同于applicationcontext.xml文件
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced//客户端开启ribbon负载均衡添加此注解，表示开启了ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule MyRule(){
        //默认轮询
        //return  new RoundRobinRule();
        //随机
        //return  new RandomRule();
        //先轮询，如果失败，在指定的时间内重试
        //return  new RetryRule();
        //按响应时间，越快的先被选中，开始用轮询，等统计量大了切换到这个
       // return  new WeightedResponseTimeRule();
        //先过滤掉跳闸状态的服务，然后选择一个并发量最小的服务
        //return new BestAvailableRule();
        //默认规则，复合判断server所在区域的性能和server的可用性选则服务器
        //return  new ZoneAvoidanceRule();
//    }
}
