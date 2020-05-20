package com.qyc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author qyc
 * @time 2020/5/20 - 22:02
 */
@Component
@FeignClient(value = "seata-account-2003")
public interface AccountService {
    @PostMapping("/account/update")
    public String updateAccount(@RequestParam("userId") Long userId,
                                @RequestParam("used") BigDecimal used);
}
