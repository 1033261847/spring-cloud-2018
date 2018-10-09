package com.zx.springcloud.service;

import com.zx.entities.Dept;

import java.util.List;

public interface IDeptService {

    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();

}
