package com.qyc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qyc
 * @time 2020/5/20 - 16:52
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)  //取消数据库源的自动创建
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(value = "com.qyc.mapper")
public class Main2001 {
    public static void main(String[] args) {
        SpringApplication.run(Main2001.class,args);
    }
}
