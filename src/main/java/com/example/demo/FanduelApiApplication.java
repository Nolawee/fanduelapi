package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.repository.config.RepositoryConfiguration;

@SpringBootApplication
public class FanduelApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanduelApiApplication.class, args);

    }
}
