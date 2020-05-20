package com.qyc.server;

import com.qyc.bean.Order;
import com.qyc.cfg.fallback.ConsumerFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sun.awt.SunHints;


import java.util.Optional;

/**
 * @author qyc
 * @time 2020/5/14 - 11:02
 */
@Component
//@FeignClient(value = "pay-service",fallback = ConsumerFallbackImpl.class)
@FeignClient(value = "pay-service")
public interface ConsumerService {

    @GetMapping("/select/{id}")
    public Optional<Order> selectById(@PathVariable("id") Integer uid);
}
