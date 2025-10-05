package com.example.demo;

import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayHello(){
        return "Hello from my first controller";
    }


    @GetMapping("/hello/{user-name}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String pathVar(
            @PathVariable("user-name")
            String userName
    ){
        return "the path variable is: " + userName;
    }

    @GetMapping("/hello2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String paramVar(
            @RequestParam("param1")
            String searchParam1,

            @RequestParam("param2")
            String searchParam2
    ){
        return "the params  are: " + searchParam1 + " and " + searchParam2;
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public String post(
            @RequestBody
            String message
    ){
        return "Request Accepted and message is: " + message;
    }

    @PostMapping("/post-order")
    @ResponseStatus(HttpStatus.CREATED)
    public String post(
            @RequestBody
            Order order
    ){
        return "Request Accepted and the order is: " + order.toString();
    }

    @PostMapping("/post-order-record")
    @ResponseStatus(HttpStatus.CREATED)
    public String postRecord(
            @RequestBody
            OrderRecord order
    ){
        return "Request Accepted and the order is: " + order.toString();
    }
}

