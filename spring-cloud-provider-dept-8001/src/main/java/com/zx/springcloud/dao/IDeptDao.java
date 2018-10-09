package com.zx.springcloud.dao;

import com.zx.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IDeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long deptno);

    public List<Dept> findAll();


}
