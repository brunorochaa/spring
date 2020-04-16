package rocha.bruno.exemploHelloWorldLombok.model;

import lombok.*;

/**
 * @author Bruno Rocha
 * @since 15/04/2020
 * @version 1.0
 * */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {
    @Getter @Setter private String name;
    @Getter @Setter private String lastName;
    @Getter @Setter private String email;
}
