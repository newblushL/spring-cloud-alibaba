package com.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>@Description : nacos配置启动项</p>
 * <p>@Author : ShiLin.Liu </p>
 * <p>@Date : 2020/8/21 17:11 </p>
 */
@SpringBootApplication
public class ConfigApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApp.class, args);
    }
}
