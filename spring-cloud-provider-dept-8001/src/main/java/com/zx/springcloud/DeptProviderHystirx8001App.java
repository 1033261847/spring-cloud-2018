package com.zx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
@EnableEurekaClient  //本服务会自动注册进eureka中
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker
public class DeptProviderHystirx8001App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystirx8001App.class,args);
    }

}
