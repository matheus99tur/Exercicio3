package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.ProdutoEx6;

public class Exercicio6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o preço de custo do produto: ");
    double precoCusto = scanner.nextDouble();

    System.out.print("Digite o percentual de lucro desejado (%): ");
    double percentualLucro = scanner.nextDouble();

    ProdutoEx6 produto = new ProdutoEx6(precoCusto);
    double precoVenda = produto.calcularPrecoVenda(percentualLucro);

    System.out.println("O preço de venda do produto é: R$ " + precoVenda);

    scanner.close();
  }
}
