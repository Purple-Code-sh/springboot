package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {

    @Bean
    public MyFirstClass myFirstClassObject(){
        return new MyFirstClass("First Bean Created");
    }
}
