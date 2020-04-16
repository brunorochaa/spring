package rocha.bruno.exemploHelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rocha.bruno.exemploHelloWorld.model.Cliente;

import java.util.ArrayList;

@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public Cliente getClient(){
        Cliente cliente = new Cliente();
        cliente.setNome("Bruno");
        return cliente;
    }

    @GetMapping("/arrayClientes")
    public ArrayList<Cliente> getClients(){
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Bruno");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Thiago");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        return clientes;
    }
}
