package rocha.bruno.exemploInjecaoDeDependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import rocha.bruno.exemploInjecaoDeDependencia.model.Cat;
import rocha.bruno.exemploInjecaoDeDependencia.model.Dog;

@SpringBootApplication
public class ExemploInjecaoDeDependenciaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploInjecaoDeDependenciaApplication.class, args);
		//3a forma
		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();

		//2a forma
		/*Pet pet1 = new Pet(new Cat());
		pet1.execute();

		Pet pet2 = new Pet(new Dog());
		pet2.execute();*/

		//1a forma
		/*Pet pet = new Pet();
		pet.execute();*/
	}
}
