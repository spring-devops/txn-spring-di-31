package testapps.springframework.txnspringdi31.controllers.injection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testapps.springframework.txnspringdi31.controllers.injection.ConstructorInjectedController;
import testapps.springframework.txnspringdi31.services.greetingsexample.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println("ConstructorInjectedControllerTest >>>> " + constructorInjectedController.getGreeting());
    }
}