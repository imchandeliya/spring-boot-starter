package com.example.springbootstarter;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorldInterface{

    public void sayHello() {
        System.out.println("Hello World!!!");
    }

}
