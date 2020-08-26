package testapps.springframework.txnspringdi31.controllers;

import testapps.springframework.txnspringdi31.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return "SetterInjectedController >>>> " + greetingService.sayGreeting();
    }
}

