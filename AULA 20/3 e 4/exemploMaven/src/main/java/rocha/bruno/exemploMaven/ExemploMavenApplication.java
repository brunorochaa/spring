package rocha.bruno.exemploMaven;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rocha.bruno.exemploGradle.model.Aluno;

@SpringBootApplication
public class ExemploMavenApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExemploMavenApplication.class, args);
		System.out.println("Hello World! SpringBOOT com Maven!");

		Aluno aluno = new Aluno();
		aluno.setNome("Bruno");
		aluno.setNota1(10);
		aluno.setNota2(10);
		System.out.println(aluno);
	}
}
