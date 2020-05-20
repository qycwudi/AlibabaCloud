package com.qyc.controller;

import com.qyc.bean.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author qyc
 * @time 2020/5/14 - 11:45
 */
@RestController
@RefreshScope
public class OrderController {

    @Value("${server.port}")
    private String port;
    @Value("${config.info}")
    private String info;

    @GetMapping("/select/{id}")
    public Optional<Order> selectById(@PathVariable("id") Integer uid){
        Order order1 = new Order(1,port+"  "+info);
        Optional<Order> order = Optional.of(order1);
        return order;
    }
}
