package com.zx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfig3344App {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfig3344App.class,args);
    }

}
