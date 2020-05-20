package com.qyc.controller;

import com.qyc.service.AccountService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author qyc
 * @time 2020/5/20 - 21:05
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;
    @PostMapping("/account/update")
    public String updateAccount(@RequestParam("userId") Long userId,
                                @RequestParam("used") BigDecimal used){
        accountService.updateAccount(userId,used);
        return "success";
    }
}
