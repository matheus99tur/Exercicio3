package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.CarroEx12;

public class Exercicio12 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Concessionária de veículos CARANGO VELHO");
    System.out.println("-----------------------------------------");

    int totalCarrosAte2000 = 0;
    int totalGeral = 0;
    char continuar;

    do {
      System.out.print("Informe o ano do carro: ");
      int ano = scanner.nextInt();
      CarroEx12 carro = new CarroEx12(ano);

      double valor;
      if (carro.getAno() <= 2000) {
        valor = 10000; // Valor base do carro
        valor -= valor * 0.12; // Desconto de 12%
        totalCarrosAte2000++;
      } else {
        valor = 10000; // Valor base do carro
        valor -= valor * 0.07; // Desconto de 7%
      }

      totalGeral++;
      System.out.println("Desconto: " + (10000 - valor));
      System.out.println("Valor a ser pago: " + valor);

      System.out.print("Deseja continuar? (S/N): ");
      continuar = scanner.next().charAt(0);
    } while (continuar == 'S' || continuar == 's');

    scanner.close();

    System.out.println("-----------------------------------------");
    System.out.println("Total de carros até 2000: " + totalCarrosAte2000);
    System.out.println("Total geral de carros: " + totalGeral);
  }
}
