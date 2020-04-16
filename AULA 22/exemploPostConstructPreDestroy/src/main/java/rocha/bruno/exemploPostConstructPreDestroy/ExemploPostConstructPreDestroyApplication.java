package rocha.bruno.exemploPostConstructPreDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import rocha.bruno.exemploPostConstructPreDestroy.dao.ClientDAO;
import rocha.bruno.exemploPostConstructPreDestroy.model.Client;

@SpringBootApplication
public class ExemploPostConstructPreDestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploPostConstructPreDestroyApplication.class, args);
		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);
		clientDAO.setClient(new Client("Bruno Rocha"));

		System.out.println("Objeto ClientDAO: " +clientDAO);
		System.out.println("Objeto Client: " +clientDAO.getClient());
	}

}
