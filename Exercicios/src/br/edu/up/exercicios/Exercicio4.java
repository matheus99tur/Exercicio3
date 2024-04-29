package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.ConversorEx4;

public class Exercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a cotação do dólar: ");
    double cotacaoDolar = scanner.nextDouble();

    System.out.print("Digite a quantidade de dólares: ");
    double quantidadeDolar = scanner.nextDouble();

    ConversorEx4 conversor = new ConversorEx4(cotacaoDolar);
    double valorConvertido = conversor.converterDolarParaReal(quantidadeDolar);

    System.out.printf("O valor em reais é: R$ %.2f%n", valorConvertido);

    scanner.close();
  }
}
