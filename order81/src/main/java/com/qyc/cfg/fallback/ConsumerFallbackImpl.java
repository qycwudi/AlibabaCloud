package com.qyc.cfg.fallback;

import com.qyc.bean.Order;
import com.qyc.server.ConsumerService;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author qyc
 * @time 2020/5/19 - 17:20
 */
@Component
public class ConsumerFallbackImpl implements ConsumerService {
    @Override
    public Optional<Order> selectById(Integer uid) {
        Order order = new Order();
        order.setId(100);
        order.setNumber("404,服务降级");
        return Optional.of(order);
    }
}
