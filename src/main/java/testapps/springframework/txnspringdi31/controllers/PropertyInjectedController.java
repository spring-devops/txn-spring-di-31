package testapps.springframework.txnspringdi31.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import some.other.example.pakkage.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    GreetingService greetingService;

    public String getGreeting() {
        return "PropertyInjectedController >>>> " + greetingService.sayGreeting() ;
    }
}
