package testapps.springframework.txnspringdi31.services.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import testapps.springframework.txnspringdi31.services.data.SimulatedDataModel;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${txn-spring.username}")
    String user;

    @Value("${txn-spring.password}")
    String password;

    @Value("${txn-spring.url}")
    String url;

    @Bean
    public SimulatedDataModel getDataModel() {
        SimulatedDataModel model = new SimulatedDataModel();
        model.setPassword(password);
        model.setUrl(url);
        model.setUser(user);
        return model;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
