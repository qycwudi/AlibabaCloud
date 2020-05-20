package com.qyc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author qyc
 * @time 2020/5/20 - 20:54
 */
@Mapper
public interface AccountMapper {
    public void updateAccount(@Param("userId") Long userId, @Param("used") BigDecimal used);
}
