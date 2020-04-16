package rocha.bruno.exemploInjecaoDeDependencia.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import rocha.bruno.exemploInjecaoDeDependencia.interfaces.IAnimal;

@Component
@Primary
@Qualifier("dog")
public class Dog implements IAnimal {
    @Override
    public void comunicar() {
        System.out.println("Au auuuu");
    }
}
