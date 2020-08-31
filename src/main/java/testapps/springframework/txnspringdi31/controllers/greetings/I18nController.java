package testapps.springframework.txnspringdi31.controllers.greetings;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import testapps.springframework.txnspringdi31.services.greetingsexample.GreetingService;

@Controller
public class I18nController {
     private final GreetingService greetingService;

    public I18nController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return "I18nController >>>>> " + greetingService.sayGreeting();
    }
}
