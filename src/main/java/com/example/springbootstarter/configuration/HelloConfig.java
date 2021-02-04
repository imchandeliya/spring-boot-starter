package com.example.springbootstarter.configuration;

import com.example.springbootstarter.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }

    @Bean
    @Profile({"default", "english"})
    @Primary
    public HelloWorldService helloWorldEnglish(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("en");
    }

    @Bean
    @Profile({"spanish"})
    @Primary
    public HelloWorldService helloWorldSpanish(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("es");
    }

    @Bean(name = "polish")
    public HelloWorldService helloWorldPolish(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("pl");
    }

    @Bean
    public HelloWorldService helloWorldGerman(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("de");
    }

    @Bean
    public HelloWorldService helloWorldHindi(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("hi");
    }

}
