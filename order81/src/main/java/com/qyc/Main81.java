package com.qyc;

import com.MySelfRole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qyc
 * @time 2020/5/14 - 10:56
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RibbonClients(value = {
        @RibbonClient(value = "pay-service",configuration = MySelfRole.class)
})
public class Main81 {
    public static void main(String[] args) {
        SpringApplication.run(Main81.class,args);
    }
}
