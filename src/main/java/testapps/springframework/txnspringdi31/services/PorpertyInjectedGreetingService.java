package testapps.springframework.txnspringdi31.services;

import org.springframework.stereotype.Service;

@Service
public class PorpertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "PorpertyInjectedGreetingService --> Hello World!";
    }
}
