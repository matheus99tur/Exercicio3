package br.edu.up.exercicios;

import br.edu.up.modelo.FuncionarioEx17;

public class Exercicio17 {
  public static void main(String[] args) {
    String nomeFuncionario = "João";
    double salarioAtual = 2000.0;
    double salarioMinimo = 1100.0;

    // Criar objeto Funcionario
    FuncionarioEx17 funcionario = new FuncionarioEx17(nomeFuncionario, salarioAtual, salarioMinimo);

    // Calcular reajuste
    double reajuste = funcionario.calcularReajuste();

    // Calcular novo salário
    double novoSalario = funcionario.calcularNovoSalario();

    // Aumento na folha de pagamento
    double aumentoFolha = novoSalario - salarioAtual;

    // Exibir resultados
    System.out.println("Nome do funcionário: " + funcionario.getNome());
    System.out.println("Salário atual: R$" + funcionario.getSalario());
    System.out.println("Reajuste: R$" + reajuste);
    System.out.println("Novo salário: R$" + novoSalario);
    System.out.println("Aumento na folha de pagamento: R$" + aumentoFolha);
  }
}
