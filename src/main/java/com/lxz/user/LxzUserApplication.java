package com.lxz.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.lxz.user")
@MapperScan(value = {"com.lxz.user.dao"})
public class LxzUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxzUserApplication.class, args);
    }

}
