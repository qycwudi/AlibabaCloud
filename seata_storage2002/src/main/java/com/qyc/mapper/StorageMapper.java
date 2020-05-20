package com.qyc.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author qyc
 * @time 2020/5/20 - 21:25
 */
public interface StorageMapper {
    public void updateStorage(@Param("productId") Long productId,@Param("used") Integer used);
}
