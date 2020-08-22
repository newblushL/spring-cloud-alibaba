package com.newblush.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@Description : 会员接口</p>
 * <p>@Author : ShiLin.Liu </p>
 * <p>@Date : 2020/8/22 14:56 </p>
 */
@RestController
public class MemberService {

    @GetMapping("getUser")
    public String getUser(@RequestParam("userId") Integer userId) {
        return "小明";
    }
}
