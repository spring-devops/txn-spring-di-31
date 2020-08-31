package testapps.springframework.txnspringdi31.services.injectionexample;

import org.springframework.stereotype.Service;
import testapps.springframework.txnspringdi31.services.greetingsexample.GreetingService;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "ConstructorInjectedGreetingService --> Hello World!";
    }
}
