package com.alibaba.nacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@Description : nacos配置文件测试接口</p>
 * <p>@Author : ShiLin.Liu </p>
 * <p>@Date : 2020/8/21 17:12 </p>
 */
@RestController
@Slf4j
@RefreshScope
public class ConfigController {

    @Value("${name:}")
    private String name;

    @GetMapping("test")
    public String hello() {
        return name;
    }
}
