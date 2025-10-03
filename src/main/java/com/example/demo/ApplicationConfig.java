package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {
    @Bean("firstBean")
    public MyFirstClass newFirstClassObject(){
        return new MyFirstClass();
    }
}
