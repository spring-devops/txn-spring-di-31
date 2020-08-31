package testapps.springframework.txnspringdi31.services.greetingsexample;

//This class is not used but was an example of how to get new factory instances
public class GreetingServiceFactory {
    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService (String lang) {
        switch (lang) {
            case "en":
                return new I18nEnglishGreetingService(greetingRepository);
            case "de":
                return new I18nGermanGreetingService(greetingRepository);
            case "es":
                return new I18nSpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
