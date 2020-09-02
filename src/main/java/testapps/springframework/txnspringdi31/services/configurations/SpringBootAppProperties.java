package testapps.springframework.txnspringdi31.services.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;
import testapps.springframework.txnspringdi31.services.data.SimulatedDataModel;
import testapps.springframework.txnspringdi31.services.data.SimulatedJmsBroker;

//The properties from this calss will be sourced from SpringBootApplication properties file
@Component
public class SpringBootAppProperties extends AbstractAppProperties{
    private final SimulatedDataModel simulatedDataModel;
    private final SimulatedJmsBroker simulatedJmsBroker;

    public SpringBootAppProperties(/*SimulatedDataModel simulatedDataModel, SimulatedJmsBroker simulatedJmsBroker*/) {
/*
        this.simulatedDataModel = simulatedDataModel;
        this.simulatedJmsBroker = simulatedJmsBroker;
*/

        this.simulatedDataModel = new SimulatedDataModel();
        this.simulatedJmsBroker = new SimulatedJmsBroker();
    }

    @Bean (name="spring-properties-data")
    public SimulatedDataModel getSimulatedDataModel() {
        simulatedDataModel.setPassword(this.getPassword());
        simulatedDataModel.setUrl(this.getUrl());
        simulatedDataModel.setUser(this.getUser());
        return simulatedDataModel;
    }

    @Bean (name="spring-properties-jms")
    public SimulatedJmsBroker getSimulatedJmsBroker() {
        simulatedJmsBroker.setJmsPassword(this.getJmsPassword());
        simulatedJmsBroker.setJmsUrl(this.getJmsUrl());
        simulatedJmsBroker.setJmsUserName(this.getJmsUser());
        return simulatedJmsBroker;
    }

}
