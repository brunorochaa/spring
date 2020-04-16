package rocha.bruno.exemploGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rocha.bruno.exemploGradle.model.Aluno;

@SpringBootApplication
public class ExemploGradleApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExemploGradleApplication.class, args);
		System.out.println("Hello World! SpringBOOT com Gradle!");

		Aluno aluno = new Aluno();
		aluno.setNome("Bruno");
		aluno.setNota1(10);
		aluno.setNota2(10);
		System.out.println(aluno);
	}
}
