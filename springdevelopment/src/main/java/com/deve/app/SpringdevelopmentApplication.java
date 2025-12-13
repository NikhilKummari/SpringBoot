package com.deve.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdevelopmentApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(SpringdevelopmentApplication.class, args);
        Programmer program = context.getBean(Programmer.class);
        program.code();
    }
}