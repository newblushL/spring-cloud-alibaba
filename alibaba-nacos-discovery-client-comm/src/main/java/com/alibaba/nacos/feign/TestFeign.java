package com.alibaba.nacos.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>@Description : feign客户端测试</p>
 * <p>@Author : ShiLin.Liu </p>
 * <p>@Date : 2020/8/21 16:53 </p>
 */
@FeignClient("alibaba-nacos-discovery-server")
public interface TestFeign {

    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}
