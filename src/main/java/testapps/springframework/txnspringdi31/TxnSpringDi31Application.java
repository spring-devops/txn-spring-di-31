package testapps.springframework.txnspringdi31;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import testapps.springframework.txnspringdi31.controllers.*;
import testapps.springframework.txnspringdi31.controllers.injection.ConstructorInjectedController;
import testapps.springframework.txnspringdi31.controllers.greetings.I18nController;
import testapps.springframework.txnspringdi31.controllers.injection.PropertyInjectedController;
import testapps.springframework.txnspringdi31.controllers.injection.SetterInjectedController;
import testapps.springframework.txnspringdi31.controllers.pets.PetController;
import testapps.springframework.txnspringdi31.services.data.SimulatedDataModel;
import testapps.springframework.txnspringdi31.services.data.SimulatedJmsBroker;

//NOTE: These three commneted out annotations are equivalent to the uncommented one below
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class TxnSpringDi31Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(TxnSpringDi31Application.class, args);

		System.out.println("TxnSpringDi31Application >>>> ----------- MyController Greeting ");
		MyController myController = (MyController) ctx.getBean("myController") ;
		System.out.println("TxnSpringDi31Application >>>> " + myController.sayHello());

		System.out.println("TxnSpringDi31Application >>>> ----------- I18nProfileTest ");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("TxnSpringDi31Application >>>> " + i18nController.sayHello());

		System.out.println("TxnSpringDi31Application >>>> ----------- Which Pet is the best?");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println("TxnSpringDi31Application >>>> " + petController.whichPetIsTheBest());

		System.out.println("TxnSpringDi31Application >>>> ----------- Property ");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("TxnSpringDi31Application >>>> " + propertyInjectedController.getGreeting());

		System.out.println("TxnSpringDi31Application >>>> ----------- Setter ");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("TxnSpringDi31Application >>>> " + setterInjectedController.getGreeting());

		System.out.println("TxnSpringDi31Application >>>> ----------- Constructor ");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("TxnSpringDi31Application >>>> " + constructorInjectedController.getGreeting());

		System.out.println("TxnSpringDi31Application >>>> ----------- Property Reader from external file ");
		//SimulatedDataModel dataModel = (SimulatedDataModel) ctx.getBean("simulatedDataModel") ;
		SimulatedDataModel dataModel = (SimulatedDataModel) ctx.getBean("external-properties-data", SimulatedDataModel.class) ;
		System.out.println("TxnSpringDi31Application >>>> Data Model " + dataModel.hashCode() + ", Value: " + dataModel.toString());
		SimulatedJmsBroker jmsBroker = (SimulatedJmsBroker) ctx.getBean("external-properties-jms", SimulatedJmsBroker.class) ;
		System.out.println("TxnSpringDi31Application >>>> JMS Broker " + jmsBroker.hashCode() + ", Value: " + jmsBroker.toString());

		System.out.println("TxnSpringDi31Application >>>> ----------- Property Reader from SpringBootProperties file ");
		SimulatedDataModel dataModel1 = (SimulatedDataModel) ctx.getBean("spring-properties-data", SimulatedDataModel.class) ;
		System.out.println("TxnSpringDi31Application >>>> Data Model " + dataModel1.hashCode() + ", Value: " + dataModel1.toString());
		SimulatedJmsBroker jmsBroker1 = (SimulatedJmsBroker) ctx.getBean("spring-properties-jms", SimulatedJmsBroker.class) ;
		System.out.println("TxnSpringDi31Application >>>> JMS Broker " + jmsBroker1.hashCode() + ", Value: " + jmsBroker1.toString());

	}

}
