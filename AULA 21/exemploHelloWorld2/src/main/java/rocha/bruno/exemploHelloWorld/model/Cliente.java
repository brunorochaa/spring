package rocha.bruno.exemploHelloWorld.model;

public class Cliente {
    private String nome;

    //Construtor
    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {

    }

    //Get&Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //toString
    @Override
    public String toString() {
        return "Cliente: " +nome;
    }
}
