package com.qyc.controller;

import com.qyc.service.StorageService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qyc
 * @time 2020/5/20 - 21:40
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @PostMapping("/storage/update")
    public String storageUpdate(@RequestParam("productId") Long productId,
                                @RequestParam("used") Integer used){

//        int a = 10/0;
        System.out.println(productId+"   "+used);
        storageService.update(productId,used);
        return "success";
    }
}
