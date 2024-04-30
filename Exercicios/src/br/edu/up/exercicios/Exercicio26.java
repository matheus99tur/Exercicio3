package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.PretendenteEx26;

public class Exercicio26 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o nome do pretendente:");
    String nome = scanner.nextLine();
    System.out.println("Informe a idade do pretendente:");
    int idade = scanner.nextInt();
    System.out.println("Informe o grupo de risco (1 - Baixo, 2 - Médio, 3 - Alto):");
    int grupoRisco = scanner.nextInt();

    if (idade >= 17 && idade <= 70) {

      PretendenteEx26 pretendente = new PretendenteEx26(nome, idade, grupoRisco);

      System.out.println(pretendente.determinarCategoria());
    } else {
      System.out.println("Idade fora da faixa etária.");
    }

    scanner.close();
  }
}
