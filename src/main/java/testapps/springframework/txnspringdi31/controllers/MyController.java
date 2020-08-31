package testapps.springframework.txnspringdi31.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import some.other.example.pakkage.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        //System.out.println("MyController --> Hello World!");
        return "MyController >>>> " + greetingService.sayGreeting();
    }
}
