package com.qyc.contrller;

import com.qyc.Order;
import com.qyc.service.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qyc
 * @time 2020/5/20 - 19:04
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @PostMapping("/order/create")
    public String create(Order order){
        orderService.create(order);
        return order.toString();
    }
}
