package com.zx.rest;

import com.zx.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallBackFactory implements DeptClientService {

    @Override
    public boolean add(Dept dept) {
        return false;
    }

    @Override
    public Dept get(Long id) {
        return new Dept().setDeptno(id)
                .setDeptName("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                .setDbSource("no this database in MySQL");
    }

    @Override
    public List<Dept> list() {
        return null;
    }
}

