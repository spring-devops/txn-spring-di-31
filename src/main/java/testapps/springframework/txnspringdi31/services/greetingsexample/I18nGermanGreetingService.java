package testapps.springframework.txnspringdi31.services.greetingsexample;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("de")
public class I18nGermanGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public I18nGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "I18nSpanishGreetingService --> " + greetingRepository.getGermanGreeting();
    }
}
