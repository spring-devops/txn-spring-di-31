package testapps.springframework.txnspringdi31.controllers;

import testapps.springframework.txnspringdi31.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String getGreeting() {
        return "PropertyInjectedController >>>> " + greetingService.sayGreeting() ;
    }
}
