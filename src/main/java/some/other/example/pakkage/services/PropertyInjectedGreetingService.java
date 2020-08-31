package some.other.example.pakkage.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "PropertyInjectedGreetingService --> Hello World!";
    }
}
