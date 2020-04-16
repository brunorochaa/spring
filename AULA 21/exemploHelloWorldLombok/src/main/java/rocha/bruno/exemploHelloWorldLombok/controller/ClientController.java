package rocha.bruno.exemploHelloWorldLombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rocha.bruno.exemploHelloWorldLombok.model.Client;

import java.util.ArrayList;

@RestController
public class ClientController {
    @GetMapping("/clientes")
    public Client getClient() {
        Client client = new Client();
        client.setName("Bruno");
        client.setLastName("Rocha");
        client.setEmail("brunorochaamaral@gmail.com");
        return client;
    }
    @GetMapping("/listaClientes")
    public ArrayList<Client> getListClient() {
        //Client1
        Client client1 = new Client();
        client1.setName("Bruno");
        client1.setLastName("Rocha");
        client1.setEmail("brunorochaamaral@gmail.com");
        //Client2
        Client client2 = new Client();
        client2.setName("Thiago");
        client2.setLastName("Cury");
        client2.setEmail("thiagocury@gmail.com");
        //ArrayListClient
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        //Retorna
        return clients;
    }
}
