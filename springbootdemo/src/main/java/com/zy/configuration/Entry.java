package com.zy.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: 项目启动入口，配置包根路径
 * @Author: ZYY
 * @Date: 14:40 2018/5/14
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.zy")
public class Entry {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class, args);
    }
}
