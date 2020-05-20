package com.qyc.service;

import com.qyc.Order;
import com.qyc.mapper.OrderMapper;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qyc
 * @time 2020/5/20 - 19:04
 */
@Service

public class OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private AccountService accountService;
    @Resource
    private StorageService storageService;

    @GlobalTransactional(name="global_tx_group",rollbackFor = Exception.class)
    public void create(Order order){
        System.out.println("开始创建订单"+order);
        orderMapper.create(order);
        System.out.println("账户");
        accountService.updateAccount(order.getUserId(),order.getMoney());
        System.out.println("库存");
        storageService.storageUpdate(order.getProductId(),order.getCount());
    }
}
