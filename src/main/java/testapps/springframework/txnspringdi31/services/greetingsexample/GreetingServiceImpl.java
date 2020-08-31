package testapps.springframework.txnspringdi31.services.greetingsexample;

public class GreetingServiceImpl implements GreetingService {

    private final String PRIMARYGREETING = "GreetingServiceImpl ---> Hello World from IMPL Service" ;
    @Override
    public String sayGreeting() {
        return PRIMARYGREETING;
    }
}
