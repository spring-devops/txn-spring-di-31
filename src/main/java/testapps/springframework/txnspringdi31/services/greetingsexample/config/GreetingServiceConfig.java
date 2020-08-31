package testapps.springframework.txnspringdi31.services.greetingsexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import testapps.springframework.txnspringdi31.services.greetingsexample.*;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingServiceFactory greetingServiceFactory (GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository) ;
    }

    @Bean
    @Primary
    @Profile({"en", "default"})
    public GreetingService getEnglishGreetingService(GreetingRepository greetingRepository) {
        return new I18nEnglishGreetingService(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"de"})
    public GreetingService getGermanGreetingService(GreetingRepository greetingRepository) {
        return new I18nGermanGreetingService(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"es"})
    public GreetingService getSpanishGreetingService(GreetingRepository greetingRepository) {
        return new I18nSpanishGreetingService(greetingRepository);
    }

    @Bean
    //@Primary
    @Profile({"PRI", "default"})
    public GreetingService getDefaultGreetingService(GreetingRepository greetingRepository) {
        return new PrimaryGreetingService(greetingRepository);
    }

    @Bean
    @Primary
    @Profile("deprecated")
    //This class represents not using a repository, hence deprecated in favor of new ones that do use the repository
    public GreetingService getOriginalGreetingService(GreetingRepository greetingRepository) {
        return new GreetingServiceImpl ();
    }
}
