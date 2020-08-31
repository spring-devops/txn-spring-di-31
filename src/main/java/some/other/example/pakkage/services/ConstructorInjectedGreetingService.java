package some.other.example.pakkage.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "ConstructorInjectedGreetingService --> Hello World!";
    }
}
