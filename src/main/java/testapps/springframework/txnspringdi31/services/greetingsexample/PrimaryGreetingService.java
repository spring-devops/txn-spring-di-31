package testapps.springframework.txnspringdi31.services.greetingsexample;

public class PrimaryGreetingService implements GreetingService{

    private final GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "PrimaryGreetingService --> " + greetingRepository.getEnglishGreeting();
    }
}
