package com.qyc.service;

import com.qyc.mapper.AccountMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author qyc
 * @time 2020/5/20 - 21:03
 */
@Service
public class AccountService {
    @Resource
    private AccountMapper accountMapper;

    public void updateAccount(Long userId, BigDecimal used){
        accountMapper.updateAccount(userId,used);
    }
}
