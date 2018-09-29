package control;

import model.Comissionado;
import model.Gerente;
import model.Mensalista;

import javax.swing.*;

public class Executavel {

    public static void main(String []args){

        Object[] possibilidade = {"Gerente","Comissionado","Mensalista"};
        int opcao = JOptionPane.showOptionDialog(null,"Clique no tipo de Empregado","Tipo de empregado",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,possibilidade,possibilidade[0]);
        if (opcao == 0)
        {
            String nome = JOptionPane.showInputDialog("Insira o nome do Empregado !");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do Empregado"));
            Gerente gerente = new Gerente(nome,salario);
            gerente.setNome(nome);
            gerente.setSalario(salario);
            JOptionPane.showMessageDialog(null,"Nome: "+gerente.getNome()+"\n"+"Cargo: Gerente"+"\n"+"Salario: "+gerente.getSalario());
        }else if(opcao == 1)
        {
                     String nome = JOptionPane.showInputDialog("Digite o nome do Empregado !");
                     double salario = Double.parseDouble(JOptionPane.showInputDialog("Digte o salario do Empregado !"));
                     double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissao do Empregado"));
                     Comissionado com = new Comissionado(nome,salario,comissao);
                     com.setNome(nome);
                     com.setSalario(salario);
                     com.setComissao(comissao);
                     JOptionPane.showMessageDialog(null,"Nome: "+com.getNome()+"\n"+"Cargo: Comissionado"+"\n"+"Comissao: "+com.getComissao()+"\n"+"Salario + Comissao: "+com.getSalario());
        }else if (opcao == 2)
        {
            String nome = JOptionPane.showInputDialog("Digite o nome do Empregado !");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do Empregado !"));
            Mensalista men = new Mensalista(nome,salario);
            men.setNome(nome);
            men.setSalario(salario);
            JOptionPane.showMessageDialog(null,"Nome: "+men.getNome()+"\n"+"Cargo: Mensalista"+"\n"+"Salario: "+men.getSalario());
        }




    }
}
