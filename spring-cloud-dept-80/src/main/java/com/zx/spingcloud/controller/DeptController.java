package com.zx.spingcloud.controller;

import com.zx.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/cdept")
public class DeptController {

    //private static  final  String REST_URE_PREFIX="http://localhost:8001" ;
    //微服务名称
    private static  final  String REST_URE_PREFIX="http://SPRINGCLOUD-DEPT" ;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URE_PREFIX+"/dept/get/list",List.class);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URE_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @PostMapping("/add")
    public boolean add(Dept dept){
        //请求url  请求参数  响应类型
        return restTemplate.postForObject(REST_URE_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @GetMapping("/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URE_PREFIX + "/dept/discovery", Object.class);
    }

}
