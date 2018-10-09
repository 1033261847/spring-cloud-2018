package com.zx.springcloud.controller;


import com.zx.entities.Dept;
import com.zx.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    /**
     * 服务发现
     */
    @Autowired
    private DiscoveryClient client;

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }

    @GetMapping("/get/list")
    public List<Dept> list(){
        return deptService.list();
    }


    @GetMapping("/discovery")
    public Object discovery(){
        List<String> list=client.getServices();
        System.out.println(list);

        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-DEPT");
        instances.forEach(i->{
            System.out.println(i.getServiceId()+"\t"+i.getHost()+"\t"+i.getPort()+"\t"+i.getUri());
        });
        return  this.client;
    }

}
