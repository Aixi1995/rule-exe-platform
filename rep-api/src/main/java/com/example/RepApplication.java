package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author wang.zhiqiang
 * @version 1.0
 * @date 2021/5/13 11:16
 * @description
 */
@SpringBootApplication(scanBasePackages = {"com.example"}, exclude = {DataSourceAutoConfiguration.class})
@EntityScan(basePackages = "com.example")
@EnableJpaRepositories("com.example")
public class RepApplication {
    public static void main(String[] args) {
        SpringApplication.run(RepApplication.class, args);
    }
}
