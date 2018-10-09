package com.zx.entities;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data@Setter@Getter@ToString@AllArgsConstructor@NoArgsConstructor@Accessors(chain = true )
public class Dept implements Serializable
{
    private Long deptno; //主键
    private String deptName;//部门名称
    //来自那个数据库,因为微服务架构可以一个服务对应一个数据库,同一个信息被存储到不同数据库中
    private String dbSource ;

    public Dept(String deptName) {
        this.deptName = deptName;
    }

    public static void main(String[] args) {
        Dept dept=new Dept();
        dept.setDeptno(11L).setDeptName("开发部").setDbSource("orcl");
    }


}
