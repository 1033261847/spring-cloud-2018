package com.zx.springcloud.service.impl;

import com.zx.entities.Dept;
import com.zx.springcloud.dao.IDeptDao;
import com.zx.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {


    @Autowired
    private IDeptDao ideptDao;

    @Override
    public boolean add(Dept dept) {
        return ideptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return ideptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return ideptDao.findAll();
    }
}
