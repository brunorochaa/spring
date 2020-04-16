package rocha.bruno.exemploInjecaoDeDependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import rocha.bruno.exemploInjecaoDeDependencia.interfaces.IAnimal;

@Component
public class Pet {
    //3a forma
    @Autowired
    @Qualifier("cat")
    private IAnimal iAnimal;

    public void execute() {
        iAnimal.comunicar();
    }

    //2a forma
    /*public Animal(IAnimal iAnimal) {
        this.iAnimal = iAnimal;
    }*/

    //1a forma
    /*public void execute() {
        iAnimal = new Cat();
        iAnimal.comunicar();
    }*/

}
