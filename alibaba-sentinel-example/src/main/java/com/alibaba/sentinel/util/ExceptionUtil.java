package com.alibaba.sentinel.util;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * <p>@Description : 异常工具</p>
 * <p>@Author : ShiLin.Liu </p>
 * <p>@Date : 2020/8/22 16:09 </p>
 */
public class ExceptionUtil {

    public static String exUrlBlockHandler(BlockException e) {
        return "exUrlBlockHandle error";
    }
}
