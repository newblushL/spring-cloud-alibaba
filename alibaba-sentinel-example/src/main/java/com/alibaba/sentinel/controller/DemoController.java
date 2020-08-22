package com.alibaba.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.sentinel.util.ExceptionUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@Description : 接口测试</p>
 * <p>@Author : ShiLin.Liu </p>
 * <p>@Date : 2020/8/22 15:38 </p>
 */
@RestController
public class DemoController {

    @GetMapping("hello")
    public String hello() {
        return "it is Sentinel";
    }

    @GetMapping("resource")
    @SentinelResource(value = "resource", blockHandler = "exUrlBlockHandler", blockHandlerClass = {ExceptionUtil.class})
    public String resource() {
        return "resource";
    }
}
