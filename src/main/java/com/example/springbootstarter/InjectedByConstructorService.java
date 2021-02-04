package com.example.springbootstarter;

import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructorService {
    private HelloWorldInterface helloWorldInterface;

    public InjectedByConstructorService(HelloWorldInterface helloWorldInterface) {
        this.helloWorldInterface = helloWorldInterface;
    }

    public void getMessage() {
        helloWorldInterface.sayHello();
    }
}
