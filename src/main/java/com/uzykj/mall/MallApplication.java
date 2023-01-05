package com.uzykj.mall;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Springboot 启动器

 */
@Slf4j
@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement
@MapperScan("com.uzykj.mall.dao")
public class MallApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MallApplication.class, args);
        String serverPort = context.getEnvironment().getProperty("server.port");
        String path = context.getEnvironment().getProperty("server.servlet.context-path");
        log.info("This project is started! http://localhost:" + serverPort + path);
        log.info("This project admin is started! http://localhost:" + serverPort + path + "/admin");
    }
}
