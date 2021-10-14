package com.guying.ilearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Starter
 *
 * @author Frank Zhang
 */
@SpringBootApplication(scanBasePackages = {"com.guying.ilearn","com.alibaba.cola"})
@MapperScan("com.guying.ilearn.repository")
public class ILearnWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ILearnWebApplication.class, args);
    }
}
