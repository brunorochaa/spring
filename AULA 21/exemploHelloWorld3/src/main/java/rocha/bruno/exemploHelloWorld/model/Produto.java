package rocha.bruno.exemploHelloWorld.model;

public class Produto {
    private String descricao;

    //Construtor
    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public Produto() {
    }

    //Get&Set
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //toString
    @Override
    public String toString() {
        return "Descricão do Produto: " +descricao;
    }
}
