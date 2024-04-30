package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.NadadorEx21;

public class Exercicio21 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a idade do nadador:");
    int idade = scanner.nextInt();

    NadadorEx21 nadador = new NadadorEx21(idade);

    String categoria = nadador.classificarCategoria();
    System.out.println("Categoria do nadador: " + categoria);

    scanner.close();
  }
}
