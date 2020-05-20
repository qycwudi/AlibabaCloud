package com.qyc.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author qyc
 * @time 2020/5/18 - 17:59
 */
public class CustomerBlockHandler {
    public static String customerBlockhandler1(BlockException e){
        return "customerBlockhandler1";
    }
}
