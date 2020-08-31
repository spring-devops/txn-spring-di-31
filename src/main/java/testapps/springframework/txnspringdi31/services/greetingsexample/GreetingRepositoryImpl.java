package testapps.springframework.txnspringdi31.services.greetingsexample;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "GreetingRepositoryImpl >>> Hello - Primary Greeting service";
    }

    @Override
    public String getGermanGreeting() {
        return "GreetingRepositoryImpl >>> Servicio de Saludo Primario";
    }

    @Override
    public String getSpanishGreeting() {
        return "GreetingRepositoryImpl >>> Primärer Grußdienst";
    }
}
