package testapps.springframework.txnspringdi31.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "GreetingServiceImpl >>> Hello World";
    }
}
