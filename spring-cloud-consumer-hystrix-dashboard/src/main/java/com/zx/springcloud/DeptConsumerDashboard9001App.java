package com.zx.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 *  注意 ： Unable to connect to Command Metric Stream.  也就是说  路径访问不到  404
 *      解决办法是在被监控的微服务的 yml 下 添加
 management:
  endpoints:
   web:
    exposure:
     include: "*"   #全部放开

 如果是以下的配置  actuator/health 就无法访问了
 management:
  endpoint:
   web:
    exposure:
     include: ['hystrix.stream']

 *
 */
@EnableFeignClients
@EnableHystrix
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker //一定不能少@EnableCircuitBreaker，刚开始就是少这个报的unable to connect错误
public class DeptConsumerDashboard9001App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard9001App.class,args);
    }




}
