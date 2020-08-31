package testapps.springframework.txnspringdi31.services.injectionexample;

import org.springframework.stereotype.Service;
import testapps.springframework.txnspringdi31.services.greetingsexample.GreetingService;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "SetterInjectedGreetingService --> Hello World!";
    }
}
