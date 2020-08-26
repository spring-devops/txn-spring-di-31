package testapps.springframework.txnspringdi31.controllers;

import testapps.springframework.txnspringdi31.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return "ConstructorInjectedController" + greetingService.sayGreeting();
    }
}
