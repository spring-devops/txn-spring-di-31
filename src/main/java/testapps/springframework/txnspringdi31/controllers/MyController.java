package testapps.springframework.txnspringdi31.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import testapps.springframework.txnspringdi31.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        //System.out.println("MyController --> Hello World!");
        System.out.println("MyController >>>> " + greetingService.sayGreeting());
        return "MyController says: Hi Folks!";
    }
}
