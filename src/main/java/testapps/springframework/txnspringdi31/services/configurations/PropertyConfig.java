package testapps.springframework.txnspringdi31.services.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import testapps.springframework.txnspringdi31.services.data.SimulatedDataModel;
import testapps.springframework.txnspringdi31.services.data.SimulatedJmsBroker;

@Component
//@PropertySource("classpath:datasource.properties")
//@PropertySource("classpath:jms.properties")
//Alternate way:
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig extends AbstractAppProperties{

    @Autowired
    Environment environment;

    private final SimulatedDataModel simulatedDataModel;
    private final SimulatedJmsBroker simulatedJmsBroker;

    public PropertyConfig(/*SimulatedDataModel simulatedDataModel, SimulatedJmsBroker simulatedJmsBroker*/) {
/*
        this.simulatedDataModel = simulatedDataModel;
        this.simulatedJmsBroker = simulatedJmsBroker;
*/
        this.simulatedDataModel = new SimulatedDataModel();
        this.simulatedJmsBroker = new SimulatedJmsBroker();
    }

    @Bean (name="external-properties-data")
    public SimulatedDataModel getSimulatedDataModel() {
        //We will simulate a password from ENVIRONMENT instead of file:
        //simulatedDataModel.setPassword(password);
        simulatedDataModel.setPassword(environment.getProperty("PASSWORD"));
        simulatedDataModel.setUrl(this.getUrl());
        simulatedDataModel.setUser(this.getUser());
        return simulatedDataModel;
    }

    @Bean (name="external-properties-jms")
    public SimulatedJmsBroker getSimulatedJmsBroker() {
        simulatedJmsBroker.setJmsUserName(this.getJmsUser());
        simulatedJmsBroker.setJmsPassword(this.getJmsPassword());
        simulatedJmsBroker.setJmsUrl(this.getJmsUrl());
        return simulatedJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
