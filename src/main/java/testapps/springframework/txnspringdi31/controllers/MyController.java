package testapps.springframework.txnspringdi31.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("MyController --> Hello World!");
        return "MyController says: Hi Folks!";
    }
}
