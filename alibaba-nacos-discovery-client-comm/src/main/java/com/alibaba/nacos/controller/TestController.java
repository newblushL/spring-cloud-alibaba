package com.alibaba.nacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>@Description : 接口测试</p>
 * <p>@Author : ShiLin.Liu </p>
 * <p>@Date : 2020/8/21 15:59 </p>
 */
@Slf4j
@RestController
public class TestController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public String test(@RequestParam String name) {
        // 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
        ServiceInstance instance = loadBalancerClient.choose("alibaba-nacos-discovery-server");
        String url = instance.getUri() + "/hello?name=" + name;
        RestTemplate template = new RestTemplate();
        String result = template.getForObject(url, String.class);
        return "Invoke:".concat(url).concat(",").concat("return:").concat(StringUtils.isNotBlank(result) ? result : "");
    }
}
