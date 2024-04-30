package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.ContaLuzEx22;

public class Exercicio22 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o tipo de cliente (1 - Residência, 2 - Comércio, 3 - Indústria):");
    int tipoCliente = scanner.nextInt();
    System.out.println("Informe o consumo em kWh:");
    double consumo = scanner.nextDouble();

    ContaLuzEx22 conta = new ContaLuzEx22(tipoCliente, consumo);

    double valorConta = conta.calcularConta();
    System.out.println("Valor da conta de luz: R$ " + valorConta);

    scanner.close();
  }
}
