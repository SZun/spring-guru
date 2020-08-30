package com.zun.springdi.controllers;

import com.zun.springdi.services.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("Hello World!");

        return "Hi Folks!";
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
