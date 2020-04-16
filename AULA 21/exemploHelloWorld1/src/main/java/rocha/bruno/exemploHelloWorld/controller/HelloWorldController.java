package rocha.bruno.exemploHelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index(){
        return "Agora sim, vamo dale!";
    }

    @GetMapping("/clientes")
    public String getClient(){
        return "Área dos Clientes!";
    }

    @GetMapping("/produtos")
    public String getProduct(){
        return "Área dos produtos!";
    }
}
