package rocha.bruno.exemploRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploRestApplication.class, args);
        System.out.println("Exemplo com server TomCat");
	}
}
