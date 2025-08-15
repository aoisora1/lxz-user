package com.lxz.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName TestApplicationMain
 * @Description TestApplicationMain
 * @Author 86184
 * @Date 2024/9/8 21:07
 */
@SpringBootApplication(scanBasePackages = "com.lxz.user")
@MapperScan(value = {"com.lxz.user.dao"})
public class TestApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(TestApplicationMain.class, args);
    }
}
