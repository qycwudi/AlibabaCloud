package com.qyc.service;

import com.qyc.mapper.StorageMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qyc
 * @time 2020/5/20 - 21:38
 */
@Service
public class StorageService {
    @Resource
    private StorageMapper storageMapper;

    public void update(Long productId,Integer used){
        storageMapper.updateStorage(productId,used);
    }
}
