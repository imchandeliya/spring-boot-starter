package com.example.springbootstarter.configuration;

import com.example.springbootstarter.services.HelloWorldService;
import com.example.springbootstarter.services.HelloWorldServiceEnglishImpl;
import com.example.springbootstarter.services.HelloWorldSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    @Profile({"default", "english"})
    public HelloWorldService HelloWorldEnglish() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile({"spanish"})
    public HelloWorldService HelloWorldSpanish() {
        return new HelloWorldSpanishImpl();
    }

}