package testapps.springframework.txnspringdi31.controllers.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import testapps.springframework.txnspringdi31.services.greetingsexample.GreetingService;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    GreetingService greetingService;

    public String getGreeting() {
        return "PropertyInjectedController >>>> " + greetingService.sayGreeting() ;
    }
}
