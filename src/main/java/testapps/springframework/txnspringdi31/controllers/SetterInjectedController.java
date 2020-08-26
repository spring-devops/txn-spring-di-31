package testapps.springframework.txnspringdi31.controllers;

import org.springframework.stereotype.Controller;
import testapps.springframework.txnspringdi31.services.GreetingService;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return "SetterInjectedController >>>> " + greetingService.sayGreeting();
    }
}

