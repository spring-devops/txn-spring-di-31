package testapps.springframework.txnspringdi31.services.greetingsexample;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import testapps.springframework.txnspringdi31.services.greetingsexample.GreetingService;

@Profile("ES")
@Service("I18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "I18nSpanishGreetingService --> Hola Mudo S(ES)!";
    }
}
