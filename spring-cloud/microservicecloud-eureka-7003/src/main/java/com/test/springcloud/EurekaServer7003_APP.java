package com.test.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author luo k
 * @Date 2020/11/19
 **/
@SpringBootApplication
@EnableEurekaServer //Eureka服务端启动类，接受其他微服务注册进来
public class EurekaServer7003_APP {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003_APP.class, args);
    }
}
