package testapps.springframework.txnspringdi31.services.greetingsexample;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "SetterInjectedGreetingService --> Hello World!";
    }
}
