package com.lxz.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.lxz.user")
@MapperScan(value = {"com.lxz.user.dao"})
//@EnableDiscoveryClient
public class LxzUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxzUserApplication.class, args);
    }

}
