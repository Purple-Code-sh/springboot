package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    static void main(String[] args) {

        var ctx = SpringApplication.run(DemoApplication.class, args);

        MyFirstClass myFirstImplementation = ctx.getBean("firstBean", MyFirstClass.class);
        System.out.println(myFirstImplementation.sayHello());
	}

}
