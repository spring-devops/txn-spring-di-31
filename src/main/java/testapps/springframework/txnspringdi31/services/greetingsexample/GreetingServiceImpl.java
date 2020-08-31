package testapps.springframework.txnspringdi31.services.greetingsexample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "GreetingServiceImpl ---> Hello World from PRIMARY Service";
    }
}
