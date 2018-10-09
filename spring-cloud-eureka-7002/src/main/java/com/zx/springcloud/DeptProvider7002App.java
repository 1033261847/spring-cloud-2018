package com.zx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DeptProvider7002App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider7002App.class,args);
    }

}
