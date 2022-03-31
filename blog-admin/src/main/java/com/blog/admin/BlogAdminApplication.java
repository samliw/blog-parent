package com.blog.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.blog")
@MapperScan("com.blog.component.mapper")
public class BlogAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogAdminApplication.class, args);
    }
}
