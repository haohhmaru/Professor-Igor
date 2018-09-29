package model;

public class Gerente extends Empregado {

    private double salario;


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public void setSalario(double salario){this.salario = salario;}

    @Override
    public double getSalario() {
        return this.salario *1.5;
    }

}
