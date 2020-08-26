package testapps.springframework.txnspringdi31.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "PropertyInjectedGreetingService --> Hello World!";
    }
}
