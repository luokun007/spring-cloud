package com.test.springcloud;

import com.test.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author luo k
 * @Date 2020/11/19
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_APP.class, args);
    }
}
