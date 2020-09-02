package testapps.springframework.txnspringdi31.services.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import testapps.springframework.txnspringdi31.services.data.SimulatedDataModel;
import testapps.springframework.txnspringdi31.services.data.SimulatedJmsBroker;

/*@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})*/
public abstract class AbstractAppProperties {

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

    public abstract SimulatedDataModel getSimulatedDataModel();
    public abstract SimulatedJmsBroker getSimulatedJmsBroker();

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public String getJmsUser() {
        return JmsUser;
    }

    public String getJmsPassword() {
        return JmsPassword;
    }

    public String getJmsUrl() {
        return JmsUrl;
    }

}
