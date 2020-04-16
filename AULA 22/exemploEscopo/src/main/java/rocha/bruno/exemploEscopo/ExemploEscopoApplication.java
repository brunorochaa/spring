package rocha.bruno.exemploEscopo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import rocha.bruno.exemploEscopo.dao.ClassDAO;

@SpringBootApplication
public class ExemploEscopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploEscopoApplication.class, args);
		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO objectDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " +objectDAO1);
		System.out.println("Objeto JDBC: " +objectDAO1.getObjectJDBC());

		System.out.println("Objeto DAO: " +objectDAO2);
		System.out.println("Objeto JDBC: " +objectDAO2.getObjectJDBC());
	}
}
