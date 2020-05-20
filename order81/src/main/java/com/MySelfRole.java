package com;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qyc
 * @time 2020/5/14 - 11:51
 */
@Configuration
public class MySelfRole {
    @Bean
    public IRule myRole(){
        return new RoundRobinRule();  //随机
    }
}
