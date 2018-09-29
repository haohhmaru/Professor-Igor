package model;

public abstract class Empregado {

    private String nome;
    private double salario;

    public Empregado(String nome,double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome){this.nome = nome;}

    public void setSalario(double salario){this.salario = salario;}

    public String getNome(){return nome;}

    public abstract double getSalario();
}
