package testapps.springframework.txnspringdi31.services.greetingsexample;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("deprecated")
//This class represents not using a repository, hence deprecated in favor of new ones that do use the repository
public class GreetingServiceImpl implements GreetingService {

    private final String PRIMARYGREETING = "GreetingServiceImpl ---> Hello World from IMPL Service" ;
    @Override
    public String sayGreeting() {
        return PRIMARYGREETING;
    }
}
