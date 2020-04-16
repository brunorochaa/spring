package rocha.bruno.exemploInjecaoDeDependencia.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import rocha.bruno.exemploInjecaoDeDependencia.interfaces.IAnimal;

@Component
@Qualifier("cat")
public class Cat implements IAnimal {
    @Override
    public void comunicar() {
        System.out.println("Meooooooow");
    }
}
