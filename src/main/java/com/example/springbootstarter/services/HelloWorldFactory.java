package com.example.springbootstarter.services;

public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language) {
        HelloWorldService helloWorldService = null;

        switch (language) {
            case "en":
                helloWorldService = new HelloWorldServiceEnglishImpl();
                break;
            case "hi":
                helloWorldService = new HelloWorldServiceHindiImpl();
                break;
            case "de":
                helloWorldService = new HelloWorldServiceGermanImpl();
                break;
            case "es":
                helloWorldService = new HelloWorldServiceSpanishImpl();
                break;
            case "pl":
                helloWorldService = new HelloWorldServicePolishImpl();
                break;
            default:
                helloWorldService = new HelloWorldServiceEnglishImpl();

        }
        return helloWorldService;
    }
}
