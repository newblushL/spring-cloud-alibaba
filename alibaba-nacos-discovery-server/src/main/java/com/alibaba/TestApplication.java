package com.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>@Description : nacos服务提供者启动类</p>
 * <p>@Author : ShiLin.Liu </p>
 * <p>@Date : 2020/8/21 15:42 </p>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
