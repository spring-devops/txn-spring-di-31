package testapps.springframework.txnspringdi31.services.greetingsexample;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//@Primary
@Profile({"PRI", "default"})
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
