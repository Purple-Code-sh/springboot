package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayHello(){
        return "Hello from my first controller";
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public String post(
            @RequestBody
            String message
    ){
        return "Request Accepted and message is: " + message;
    }

}

