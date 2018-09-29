package model;

public class Comissionado extends Empregado {

    private double salario;
    private double comissao;


    public Comissionado(String nome, double salario, double comissao){
        super(nome,salario);
        this.comissao = comissao;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao(){return this.comissao;}

    @Override
    public double getSalario() {
        return this.salario + comissao;
    }
}
