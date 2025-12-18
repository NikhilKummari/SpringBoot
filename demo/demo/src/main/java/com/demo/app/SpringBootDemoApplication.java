package com.demo.app;

import com.demo.app.model.Laptop;
import com.demo.app.model.Programmer;
import com.demo.app.repository.LaptopRepository;
import com.demo.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
//        Programmer programmer = context.getBean(Programmer.class);
//        System.out.println(programmer.getAge());
//        programmer.code();

        LaptopService service = context.getBean(LaptopService.class);
          Laptop lap = context.getBean(Laptop.class);
          service.addLaptop(lap);

	}
}
