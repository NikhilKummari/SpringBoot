package com.deve.app;

import com.deve.app.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringdevelopmentApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);



//       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Programmer obj1 = (Programmer) context.getBean("programmer");
////        obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();
//        Programmer obj2 = (Programmer) context.getBean("programmer");
//        obj2.age;
//        System.out.println(obj2.age);
    }
}