package com.zx.spingcloud;

import com.ribbon.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//在启动该服务的时候就能去加载我们自己定义Ribbon的配置类,从而使配置生效
//注意MySelfRule类@ComponentScan 扫描的包下 也就是说不能放在主启动类的同包及子包下
@RibbonClient(name="SPRINGCLOUD-DEPT",configuration = MySelfRule.class)
public class DeptProvider80App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider80App.class,args);
    }

}
