package com.qyc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author qyc
 * @time 2020/5/20 - 21:24
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@MapperScan(value = "com.qyc.mapper")
public class Main2002 {
    public static void main(String[] args) {
        SpringApplication.run(Main2002.class,args);
    }
}
