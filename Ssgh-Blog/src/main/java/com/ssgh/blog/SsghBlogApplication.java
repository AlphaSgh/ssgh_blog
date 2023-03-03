package com.ssgh.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ssgh.blog.dao")
@SpringBootApplication
public class SsghBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsghBlogApplication.class, args);
    }

}
