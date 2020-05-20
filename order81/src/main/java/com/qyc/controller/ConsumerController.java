package com.qyc.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.qyc.bean.Order;
import com.qyc.server.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * @author qyc
 * @time 2020/5/14 - 11:00
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("select/{id}")
    @SentinelResource(value = "select",blockHandler = "blockHandler_select",fallback = "fallback_select",
            exceptionsToIgnore = IllegalArgumentException.class)
    public Optional<Order> select(@PathVariable("id") Integer id){
        if(id==4){
            throw new IllegalArgumentException();
        }

        return consumerService.selectById(id);
    }

    public Optional<Order> blockHandler_select(@PathVariable("id") Integer id,BlockException e){
        Order order = new Order();
        order.setId(100);
        order.setNumber("404,blockHandler_select服务熔断");
        return Optional.of(order);
    }

    public Optional<Order> fallback_select(@PathVariable("id") Integer id,Throwable e){
        Order order = new Order();
        order.setId(101);
        order.setNumber("404,fallback_select服务降级");
        return Optional.of(order);
    }

}
