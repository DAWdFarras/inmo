package com.daw.inmo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class InmoApplication {

    public static void main(String[] args) {
        SpringApplication.run(InmoApplication.class, args);
    }

}
