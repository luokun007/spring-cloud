package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author luo k
 * @Date 2020/11/19
 * 主启动类
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.test.springcloud.dao"})
//本服务启动后会自动注册进eureka服务
@EnableEurekaClient
@EnableDiscoveryClient//服务发现，对外暴露
public class DeptConfigProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConfigProvider8001_App.class,args);
    }
}
