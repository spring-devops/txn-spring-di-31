package testapps.springframework.txnspringdi31.services.greetingsexample;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "ConstructorInjectedGreetingService --> Hello World!";
    }
}
