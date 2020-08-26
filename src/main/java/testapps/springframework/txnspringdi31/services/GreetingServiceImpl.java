package testapps.springframework.txnspringdi31.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "GreetingServiceImpl >>> Hello World";
    }
}
