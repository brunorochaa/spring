package rocha.bruno.exemploPostConstructPreDestroy.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rocha.bruno.exemploPostConstructPreDestroy.model.Client;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Getter @Setter
public class ClientDAO {
    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Objeto criado!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Objeto finalizado!");
    }
}
