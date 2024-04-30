package br.edu.up.exercicios;

import br.edu.up.modelo.FuncionarioEx18;

public class Exercicio18 {
  public static void main(String[] args) {

    String nome = "João";
    int idade = 35;
    char sexo = 'M';
    double salarioFixo = 2500.0;

    FuncionarioEx18 funcionario = new FuncionarioEx18(nome, idade, sexo, salarioFixo);

    double salarioLiquido = funcionario.calcularSalarioLiquido();

    System.out.println("Nome do funcionário: " + funcionario.getNome());
    System.out.println("Salário líquido: R$" + salarioLiquido);
  }
}
