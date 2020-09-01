package testapps.springframework.txnspringdi31.services.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import testapps.springframework.txnspringdi31.services.data.SimulatedDataModel;
import testapps.springframework.txnspringdi31.services.data.SimulatedJmsBroker;

@Configuration
//@PropertySource("classpath:datasource.properties")
//@PropertySource("classpath:jms.properties")
//Alternate way:
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${txn-spring.username}")
    String user;

    @Value("${txn-spring.password}")
    String password;

    @Value("${txn-spring.url}")
    String url;

    @Value("${txn-spring.jms.username}")
    String JmsUser;

    @Value("${txn-spring.jms.password}")
    String JmsPassword;

    @Value("${txn-spring.jms.url}")
    String JmsUrl;

    @Bean
    public SimulatedDataModel getDataModel() {
        SimulatedDataModel model = new SimulatedDataModel();
        //We will simulate a password from ENVIRONMENT instead of file:
        //model.setPassword(password);
        model.setPassword(environment.getProperty("PASSWORD"));
        model.setUrl(url);
        model.setUser(user);
        return model;
    }

    @Bean
    public SimulatedJmsBroker getJmsBroker() {
        SimulatedJmsBroker simulatedJmsBroker = new SimulatedJmsBroker();
        simulatedJmsBroker.setJmsUserName(JmsUser);
        simulatedJmsBroker.setJmsPassword(JmsPassword);
        simulatedJmsBroker.setJmsUrl(JmsUrl);
        return simulatedJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
