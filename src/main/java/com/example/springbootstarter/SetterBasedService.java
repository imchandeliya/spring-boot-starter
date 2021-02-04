package com.example.springbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterBasedService {

    private HelloWorldInterface helloWorldInterface;

    @Autowired
    public SetterBasedService(HelloWorldInterface helloWorldInterface) {
        this.helloWorldInterface = helloWorldInterface;
    }

    public void getMessage() {
        helloWorldInterface.sayHello();
    }
}
