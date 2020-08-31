package testapps.springframework.txnspringdi31.services.greetingsexample;

public class I18nEnglishGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public I18nEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "I18nEnglishGreetingService --> " + greetingRepository.getEnglishGreeting();
    }
}
