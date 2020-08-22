package com.alibaba.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>@Description : 限流服务启动项</p>
 * <p>@Author : ShiLin.Liu </p>
 * <p>@Date : 2020/8/22 15:35 </p>
 */
@SpringBootApplication
public class SentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication.class, args);
    }
}
