package com.alibaba.sentinel.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.WebCallbackManager;
import com.alibaba.sentinel.handle.UrlBlockHandler;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * <p>@Description : SentinelConfig</p>
 * <p>@Author : ShiLin.Liu </p>
 * <p>@Date : 2020/8/22 15:59 </p>
 */
@Configuration
public class SentinelConfig {

    @PostConstruct
    public void init() {
        WebCallbackManager.setUrlBlockHandler(new UrlBlockHandler());
    }
}
