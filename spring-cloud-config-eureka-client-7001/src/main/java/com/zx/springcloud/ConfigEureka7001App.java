package com.zx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfigEureka7001App {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEureka7001App.class,args);
    }



}
