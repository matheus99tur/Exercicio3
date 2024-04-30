package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.PessoaEx23;

public class Exercicio23 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o nome da pessoa:");
    String nome = scanner.nextLine();
    System.out.println("Informe o sexo da pessoa (M ou F):");
    char sexo = scanner.next().charAt(0);
    System.out.println("Informe a altura da pessoa (em metros):");
    double altura = scanner.nextDouble();
    System.out.println("Informe a idade da pessoa:");
    int idade = scanner.nextInt();

    PessoaEx23 pessoa = new PessoaEx23(nome, sexo, altura, idade);

    double pesoIdeal = pessoa.calcularPesoIdeal();
    System.out.println("Nome: " + pessoa.getNome());
    System.out.println("Peso ideal: " + pesoIdeal + " kg");

    scanner.close();
  }
}
