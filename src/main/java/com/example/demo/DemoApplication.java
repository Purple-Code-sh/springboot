package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    static void main(String[] args) {
        var ctx = SpringApplication.run(DemoApplication.class, args);

        MyFirstService myFirstServiceObject = ctx.getBean(MyFirstService.class);
        System.out.println(myFirstServiceObject.tellAStory());
	}

}
