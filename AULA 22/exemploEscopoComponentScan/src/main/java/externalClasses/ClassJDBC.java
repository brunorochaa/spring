package externalClasses;

import org.springframework.stereotype.Component;

@Component
public class ClassJDBC {
    public ClassJDBC() {
        System.out.println("Conexão JDBC!");
    }
}
