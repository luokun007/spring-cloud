package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author luo k
 * @Date 2020/11/24
 **/
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudAPP {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_StartSpringCloudAPP.class,args);
    }
}
