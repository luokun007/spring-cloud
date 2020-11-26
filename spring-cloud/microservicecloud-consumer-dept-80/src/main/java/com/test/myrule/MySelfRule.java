package com.test.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author luo k
 * @Date 2020/11/23
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new MyRule_lk();//默认轮询，自定义为retryRule
    }
}
