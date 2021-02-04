package com.example.springbootstarter.controller;

import com.example.springbootstarter.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetController {


    HelloWorldService helloWorldService;

    @Autowired
    public GreetController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String message = helloWorldService.getGreeting();
        System.out.println(message);
        return message;
    }
}
