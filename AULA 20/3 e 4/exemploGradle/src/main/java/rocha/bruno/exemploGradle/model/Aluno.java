package rocha.bruno.exemploGradle.model;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    //Get&Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    //toString
    @Override
    public String toString() {
        return "Aluno: " +nome
                +"\nN1: " +nota1
                +"\nN2: " +nota2
                +"\nMedia: " +this.calcularMedia();
    }

    //Métodos
    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }
}