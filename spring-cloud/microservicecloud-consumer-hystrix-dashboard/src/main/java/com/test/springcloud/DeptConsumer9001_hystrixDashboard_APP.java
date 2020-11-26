package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author luo k
 * @Date 2020/11/19
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer9001_hystrixDashboard_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer9001_hystrixDashboard_APP.class, args);
    }
}
