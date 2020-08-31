package some.other.example.pakkage.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "SetterInjectedGreetingService --> Hello World!";
    }
}
