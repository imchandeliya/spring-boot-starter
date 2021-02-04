package com.example.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootstarterApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootstarterApplication.class, args);
		InjectedByConstructorService injectedByConstructorService = (InjectedByConstructorService) context.getBean("injectedByConstructorService");
		injectedByConstructorService.getMessage();
	}

}
