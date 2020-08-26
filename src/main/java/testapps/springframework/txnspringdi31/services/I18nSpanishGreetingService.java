package testapps.springframework.txnspringdi31.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("I18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "I18nSpanishGreetingService --> Hola Mudo S(ES)!";
    }
}
