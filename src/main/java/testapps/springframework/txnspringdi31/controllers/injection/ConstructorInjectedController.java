package testapps.springframework.txnspringdi31.controllers.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import testapps.springframework.txnspringdi31.services.greetingsexample.GreetingService;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    //Constructor based AUTOWIRED is not needed since Spring 4.2 It is OPTIONAL now, never needed. If present, it does not do anything extra
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return "ConstructorInjectedController >>>> " + greetingService.sayGreeting();
    }
}
