package testapps.springframework.txnspringdi31.services.greetingsexample;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import testapps.springframework.txnspringdi31.services.greetingsexample.GreetingService;

@Profile({"EN", "default"})
@Service("I18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "I18nEnglishGreetingService --> Hello World (EN)!";
    }
}
