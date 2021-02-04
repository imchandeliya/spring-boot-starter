package com.example.springbootstarter.configuration;

import com.example.springbootstarter.services.*;
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
        return new HelloWorldServiceSpanishImpl();
    }

    @Bean
    @Profile({"polish"})
    public HelloWorldService HelloWorldPolish() {
        return new HelloWorldServicePolishImpl();
    }

    @Bean
    @Profile({"german"})
    public HelloWorldService HelloWorldGerman() {
        return new HelloWorldServiceGermanImpl();
    }

    @Bean
    @Profile({"german"})
    public HelloWorldService HelloWorldHindi() {
        return new HelloWorldServiceHindiImpl();
    }

}
