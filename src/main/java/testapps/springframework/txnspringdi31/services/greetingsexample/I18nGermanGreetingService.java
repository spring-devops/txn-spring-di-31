package testapps.springframework.txnspringdi31.services.greetingsexample;

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
