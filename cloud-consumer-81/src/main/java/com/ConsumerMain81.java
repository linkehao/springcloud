package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerMain81 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain81.class, args);
    }
}
