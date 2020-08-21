package com.alibaba.nacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@Description : 接口测试</p>
 * <p>@Author : ShiLin.Liu </p>
 * <p>@Date : 2020/8/21 15:59 </p>
 */
@Slf4j
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("invoked name = " + name);
        return "hello " + name;
    }
}
