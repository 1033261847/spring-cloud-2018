package com.zx.spingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages ={"com.zx.rest"})
@ComponentScan(basePackages = {"com.zx.spingcloud.controller","com.zx.rest" } )
public class DeptProviderFeign80App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderFeign80App.class,args);
    }


}
