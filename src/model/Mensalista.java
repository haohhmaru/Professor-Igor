package model;

public class Mensalista extends Empregado {

    private double salario;

    public Mensalista(String nome, double salario){super(nome,salario);}

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }
}
