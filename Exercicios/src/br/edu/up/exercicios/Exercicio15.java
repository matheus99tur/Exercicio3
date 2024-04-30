package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.VeiculoEx15;

public class Exercicio15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double totalDesconto = 0;
    double totalPago = 0;

    while (true) {
      System.out.print("Informe o tipo de combustível (álcool, gasolina ou diesel): ");
      String tipoCombustivel = scanner.nextLine();

      if (tipoCombustivel.equalsIgnoreCase("fim")) {
        break;
      }

      System.out.print("Informe o valor do veículo: ");
      double valor = scanner.nextDouble();
      scanner.nextLine(); // Limpar o buffer do teclado

      VeiculoEx15 veiculo = new VeiculoEx15(tipoCombustivel, valor);
      double desconto = veiculo.calcularDesconto();
      double valorPago = veiculo.calcularValorPago();

      totalDesconto += desconto;
      totalPago += valorPago;

      System.out.println("\nValor do desconto: R$" + desconto);
      System.out.println("Valor a ser pago pelo cliente: R$" + valorPago);
    }

    System.out.println("\nResumo:");
    System.out.println("Total de desconto concedido: R$" + totalDesconto);
    System.out.println("Total pago pelos clientes: R$" + totalPago);

    scanner.close();
  }
}
