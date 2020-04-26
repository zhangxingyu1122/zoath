package com.ontop.zoath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = {"com.ontop", "com.ontop.zoath.exception"})
public class zoathMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(zoathMainApplication.class, args);
    }
}
