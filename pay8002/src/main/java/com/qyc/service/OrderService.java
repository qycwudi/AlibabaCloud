package com.qyc.service;

import com.qyc.bean.Order;
import com.qyc.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author qyc
 * @time 2020/5/14 - 10:37
 */
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Optional<Order> selectById(int id){
        return orderRepository.findById(id);
    }
}
