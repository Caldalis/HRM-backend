package com.prj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@org.springframework.boot.autoconfigure.SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }
}
