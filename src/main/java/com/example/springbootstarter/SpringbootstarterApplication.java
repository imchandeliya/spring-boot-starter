package com.example.springbootstarter;

import com.example.springbootstarter.controller.GreetController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootstarterApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootstarterApplication.class, args);
		GreetController greetController = ctx.getBean(GreetController.class);
		greetController.sayHello();
	}

}
