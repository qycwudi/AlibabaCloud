package com.qyc.cfg;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qyc
 * @time 2020/5/14 - 11:40
 */
@Configuration
public class Logging {
    @Bean
    Logger.Level feignLoggerLevel(){
        return  Logger.Level.FULL;   //开启日志
    }
}