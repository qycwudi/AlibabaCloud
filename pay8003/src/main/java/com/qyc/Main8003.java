package com.qyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qyc
 * @time 2020/5/14 - 10:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main8003 {
    public static void main(String[] args) {
        SpringApplication.run(Main8003.class,args);
    }
}
