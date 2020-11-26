package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author luo k
 * @Date 2020/11/25
 **/
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartAPP {

    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartAPP.class,args);
    }
}
