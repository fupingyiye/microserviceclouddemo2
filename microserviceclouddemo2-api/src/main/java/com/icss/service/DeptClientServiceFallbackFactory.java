package com.icss.service;

import com.icss.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component//不要忘记添加，统一处理熔断，实现业务逻辑和异常处理的解耦
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                Dept dept =new Dept();
                dept.setDeptno(id);
                dept.setDname("该ID:"+id+"没有对应的信息，consumer客户端提供的降级信息，此刻服务提供者已经关闭");
                dept.setDb_source("no this database in mysql");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
