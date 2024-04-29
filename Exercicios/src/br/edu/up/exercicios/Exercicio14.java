package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.ProdutoEx14;

public class Exercicio14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double somaPrecoCusto = 0;
    double somaPrecoVenda = 0;
    int lucro = 0;
    int prejuizo = 0;
    int empate = 0;

    for (int i = 1; i <= 40; i++) {
      System.out.println("Produto " + i);
      System.out.print("Informe o preço de custo: ");
      double precoCusto = scanner.nextDouble();

      System.out.print("Informe o preço de venda: ");
      double precoVenda = scanner.nextDouble();

      ProdutoEx14 produto = new ProdutoEx14(precoCusto, precoVenda);

      double resultado = produto.calcularLucroOuPrejuizo();

      if (resultado > 0) {
        System.out.println("Lucro: R$" + resultado);
        lucro++;
      } else if (resultado < 0) {
        System.out.println("Prejuízo: R$" + resultado);
        prejuizo++;
      } else {
        System.out.println("Empate");
        empate++;
      }

      somaPrecoCusto += produto.getPrecoCusto();
      somaPrecoVenda += produto.getPrecoVenda();
    }

    System.out.println("\nResumo:");
    System.out.println("Lucro: " + lucro);
    System.out.println("Prejuízo: " + prejuizo);
    System.out.println("Empate: " + empate);
    System.out.println("Média de preço de custo: R$" + (somaPrecoCusto / 40));
    System.out.println("Média de preço de venda: R$" + (somaPrecoVenda / 40));

    scanner.close();
  }
}
