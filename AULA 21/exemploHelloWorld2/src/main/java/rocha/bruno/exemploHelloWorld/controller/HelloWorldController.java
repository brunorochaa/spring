package rocha.bruno.exemploHelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rocha.bruno.exemploHelloWorld.model.Cliente;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index(){
        return "Agora sim, vamo dale!";
    }

    @GetMapping("/clientes")
    public Cliente getClient(){
        Cliente cliente = new Cliente();
        cliente.setNome("Bruno");
        return cliente;
    }

    @GetMapping("/produtos")
    public String getProduct(){
        return "Área dos produtos!";
    }
}
