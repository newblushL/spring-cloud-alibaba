package com.alibaba.sentinel.handle;

import com.alibaba.csp.sentinel.slots.block.BlockException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>@Description : UrlBlockHandler</p>
 * <p>@Author : ShiLin.Liu </p>
 * <p>@Date : 2020/8/22 16:01 </p>
 */
public class UrlBlockHandler implements com.alibaba.csp.sentinel.adapter.servlet.callback.UrlBlockHandler {
    @Override
    public void blocked(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws IOException {
        httpServletResponse.getWriter().println("url block error");
    }
}
