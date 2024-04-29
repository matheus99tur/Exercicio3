package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.CompraEx5;

public class Exercicio5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor da compra: ");
    double valorCompra = scanner.nextDouble();

    CompraEx5 compra = new CompraEx5(valorCompra);
    double valorPrestacao = compra.calcularValorPrestacao();

    System.out.println("O valor de cada prestação é: R$ " + valorPrestacao);

    scanner.close();
  }
}
