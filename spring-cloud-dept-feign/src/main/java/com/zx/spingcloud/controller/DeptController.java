package com.zx.spingcloud.controller;

import com.zx.entities.Dept;
import com.zx.rest.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/cdept")
public class DeptController {

    @Autowired(required = true)
    private DeptClientService deptClientService;

    @GetMapping("/get/list")
    public List<Dept> list(){
        System.out.println("**************************************"+deptClientService+"**************************************");
        return deptClientService.list();
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.get(id);
    }

    @PostMapping("/add")
    public boolean add(Dept dept){
        return deptClientService.add(dept);
    }



}
