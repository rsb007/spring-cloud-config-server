package com.example.springcloudcongigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudCongigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCongigServerApplication.class, args);
    }

}
