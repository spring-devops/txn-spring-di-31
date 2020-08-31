package testapps.springframework.txnspringdi31.controllers.greetings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testapps.springframework.txnspringdi31.controllers.greetings.SetterInjectedController;
import testapps.springframework.txnspringdi31.services.greetingsexample.GreetingServiceImpl;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println("SetterInjectedControllerTest >>>> " + setterInjectedController.getGreeting());
    }
}