package com.example.springbootstarter.configuration;

import com.example.springbootstarter.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }

    @Bean
    @Profile({"default", "english"})
    public HelloWorldService HelloWorldEnglish(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("en");
    }

    @Bean
    @Profile({"spanish"})
    public HelloWorldService HelloWorldSpanish(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("es");
    }

    @Bean
    @Profile({"polish"})
    public HelloWorldService HelloWorldPolish(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("pl");
    }

    @Bean
    @Profile({"german"})
    public HelloWorldService HelloWorldGerman(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("de");
    }

    @Bean
    @Profile({"hindi"})
    public HelloWorldService HelloWorldHindi(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("hi");
    }

}
