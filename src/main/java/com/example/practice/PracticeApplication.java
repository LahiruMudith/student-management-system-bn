package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.practice.repository")
public class PracticeApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);
    }
}