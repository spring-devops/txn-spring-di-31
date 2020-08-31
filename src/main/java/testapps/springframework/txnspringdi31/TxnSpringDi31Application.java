package testapps.springframework.txnspringdi31;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import testapps.springframework.txnspringdi31.controllers.*;

@ComponentScan({"some.other.example.pakkage","testapps.springframework.txnspringdi31"})
@SpringBootApplication
public class TxnSpringDi31Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(TxnSpringDi31Application.class, args);

		MyController myController = (MyController) ctx.getBean("myController") ;

		String greeting = myController.sayHello();

		System.out.println("TxnSpringDi31Application >>>> " + greeting);

		System.out.println("TxnSpringDi31Application >>>> ----------- Property ");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("TxnSpringDi31Application >>>> " + propertyInjectedController.getGreeting());

		System.out.println("TxnSpringDi31Application >>>> ----------- Setter ");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("TxnSpringDi31Application >>>> " + setterInjectedController.getGreeting());

		System.out.println("TxnSpringDi31Application >>>> ----------- Constructor ");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("TxnSpringDi31Application >>>> " + constructorInjectedController.getGreeting());

		System.out.println("TxnSpringDi31Application >>>> ----------- I18nProfileTest ");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("TxnSpringDi31Application >>>> " + i18nController.sayHello());

		System.out.println("TxnSpringDi31Application >>>> ----------- Which Pet is the best?");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println("TxnSpringDi31Application >>>> " + petController.whichPetIsTheBest());
	}

}
