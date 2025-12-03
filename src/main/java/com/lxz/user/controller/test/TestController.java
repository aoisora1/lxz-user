package com.lxz.user.controller.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author 86184
 * @Date 2025/12/3 15:18
 */
@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {

    @Value("${user:t}")
    private String testValue;

    @GetMapping("/nacos")
    public String testNacosValue() {
        return testValue;
    }
}
