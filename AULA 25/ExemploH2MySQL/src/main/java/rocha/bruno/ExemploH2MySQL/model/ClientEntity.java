package rocha.bruno.ExemploH2MySQL.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

//SpringBOOT
@Component

//Lombok
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

//JPA
@Entity
@Table(name = "cliente")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "renda")
    private double income;
}