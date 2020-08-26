package testapps.springframework.txnspringdi31;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import testapps.springframework.txnspringdi31.controllers.ConstructorInjectedController;
import testapps.springframework.txnspringdi31.controllers.MyController;
import testapps.springframework.txnspringdi31.controllers.PropertyInjectedController;
import testapps.springframework.txnspringdi31.controllers.SetterInjectedController;

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

		/*
		System.out.println("TxnSpringDi31Application >>>> ----------- Constructor ");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("TxnSpringDi31Application >>>> " + constructorInjectedController.getGreeting());*/
	}

}
