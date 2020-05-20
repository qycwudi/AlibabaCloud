package com.qyc.controller;

import com.qyc.bean.Order;
import com.qyc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author qyc
 * @time 2020/5/14 - 10:31
 */
@RestController
@RefreshScope
public class OredrController {
    @Value("${server.port}")
    private String port;

    @Value("${config.info}")
    private String info;

    @Autowired
    private OrderService orderService;
    @GetMapping("/select/{id}")
    public Optional<Order> selectById(@PathVariable("id") Integer uid){

        Optional<Order> order = orderService.selectById(uid);
        order.get().setNumber(port+"  "+info);
        return order;
    }
}
