package io.caroline.projeto02;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        System.out.println("Entrei no método hello");
        return "Olá mundo";
    }
}
