package com.example.springbootstarter.controller;

import com.example.springbootstarter.services.HelloWorldService;
import com.example.springbootstarter.services.HelloWorldServiceGermanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetController {

    HelloWorldService helloWorldService;
    HelloWorldService helloWorldServiceGerman;
    HelloWorldService helloWorldServicePolish;

    @Autowired
    public void setHelloWorld(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("helloWorldGerman")
    public void setHelloWorldGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    @Autowired
    @Qualifier("polish")
    public void setHelloWorldServicePolish(HelloWorldService helloWorldServicePolish) {
        this.helloWorldServicePolish = helloWorldServicePolish;
    }

    public String sayHello() {
        String message = helloWorldService.getGreeting();
        System.out.println(message);
        System.out.println(helloWorldServiceGerman.getGreeting());
        System.out.println(helloWorldServicePolish.getGreeting());
        return message;
    }
}
