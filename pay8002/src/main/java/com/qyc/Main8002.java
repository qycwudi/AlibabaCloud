package com.qyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qyc
 * @time 2020/5/14 - 10:31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main8002 {
    public static void main(String[] args){
        SpringApplication.run(Main8002.class,args);
    }
}
