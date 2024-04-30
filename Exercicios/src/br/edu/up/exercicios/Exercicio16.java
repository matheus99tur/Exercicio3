package br.edu.up.exercicios;

import br.edu.up.modelo.FuncionarioEx16;

public class Exercicio16 {
  public static void main(String[] args) {

    double salarioMinimo = 1100.0;
    FuncionarioEx16[] funcionarios = new FuncionarioEx16[584];

    for (int i = 0; i < funcionarios.length; i++) {
      String nome = "Funcionário " + (i + 1);
      double salario = Math.random() * 30000;
      funcionarios[i] = new FuncionarioEx16(nome, salario, salarioMinimo);
    }

    double totalReajuste = 0;
    double totalNovosSalarios = 0;

    for (FuncionarioEx16 funcionario : funcionarios) {
      double reajuste = funcionario.calcularReajuste();
      double novoSalario = funcionario.calcularNovoSalario();

      totalReajuste += reajuste;
      totalNovosSalarios += novoSalario;

      System.out.println("Nome: " + funcionario.getNome());
      System.out.println("Salário antigo: R$" + funcionario.getSalario());
      System.out.println("Reajuste: R$" + reajuste);
      System.out.println("Novo salário: R$" + novoSalario);
      System.out.println();
    }

    System.out.println("Total de reajustes concedidos: R$" + totalReajuste);
    System.out.println("Total dos novos salários: R$" + totalNovosSalarios);
  }
}
