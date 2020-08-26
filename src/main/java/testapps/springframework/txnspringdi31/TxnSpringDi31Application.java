package testapps.springframework.txnspringdi31;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import testapps.springframework.txnspringdi31.controllers.MyController;

@SpringBootApplication
public class TxnSpringDi31Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(TxnSpringDi31Application.class, args);

		MyController myController = (MyController) ctx.getBean("myController") ;

		String greeting = myController.sayHello();

		System.out.println("greeting");
	}

}
