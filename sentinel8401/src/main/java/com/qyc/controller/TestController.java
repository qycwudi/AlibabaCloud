package com.qyc.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.qyc.myhandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

import java.util.concurrent.TimeUnit;

/**
 * @author qyc
 * @time 2020/5/16 - 16:35
 */
@RestController
public class TestController {
    @GetMapping("/test1")
    public String test1(){
        System.out.println(Thread.currentThread().getName());
        return "--- test1 ---";
    }
    @GetMapping("/test2")
    public String test2(){
        return "=== test2 ===";
    }

    @GetMapping("/test3")
    public String test3() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return "test3";
    }

    @GetMapping("/test4")
    public String test4() throws InterruptedException {
        int a = 10/0;
        return "test4";
    }

    @GetMapping("test5")
    @SentinelResource(value = "test5",blockHandler = "deal_test5")
    public String test5(@RequestParam(value = "p1",required = false) String p1){

        return "test5";
    }
    public String deal_test5(String p1, BlockException blockException){
        return "deal_test5";
    }

    @GetMapping("/test6")
    @SentinelResource(value = "test6",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "customerBlockhandler1")
    public String test6(){

        return "test6";
    }


}
