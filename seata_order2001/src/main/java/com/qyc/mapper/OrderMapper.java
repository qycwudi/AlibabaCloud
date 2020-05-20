package com.qyc.mapper;

import com.qyc.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author qyc
 * @time 2020/5/20 - 19:04
 */
@Mapper
public interface OrderMapper {
    void create(Order order);

    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
