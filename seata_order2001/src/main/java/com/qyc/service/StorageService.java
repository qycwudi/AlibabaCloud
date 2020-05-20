package com.qyc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author qyc
 * @time 2020/5/20 - 22:03
 */
@Component
@FeignClient(value = "seata-storage-2002")
public interface StorageService {
    @PostMapping("/storage/update")
    public String storageUpdate(@RequestParam("productId") Long productId, @RequestParam("used") Integer used);
}
