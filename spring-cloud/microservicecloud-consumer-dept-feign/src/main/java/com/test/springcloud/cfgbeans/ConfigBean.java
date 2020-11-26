package com.test.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author luo k
 * @Date 2020/11/19
 **/
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  //springCloud Ribbons是基于Netflix Ribbon实现的一套客户端 负载均衡的工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule(){
//        return new RandomRule();//将默认的轮询策略改为随机
//    }
}
