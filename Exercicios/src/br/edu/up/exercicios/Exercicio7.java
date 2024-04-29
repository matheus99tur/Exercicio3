package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.CarroEx7;

public class Exercicio7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o custo de fábrica do carro: ");
    double custoFabrica = scanner.nextDouble();

    CarroEx7 carro = new CarroEx7(custoFabrica);
    double custoConsumidor = carro.calcularCustoConsumidor();

    System.out.println("O custo ao consumidor do carro é: R$ " + custoConsumidor);

    scanner.close();
  }
}
