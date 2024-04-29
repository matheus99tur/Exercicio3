package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.PessoaEx10;

public class Exercicio10 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o número de pessoas: ");
    int numeroPessoas = entrada.nextInt();

    for (int i = 1; i <= numeroPessoas; i++) {
      System.out.print("Digite a idade da pessoa " + i + ": ");
      int idade = entrada.nextInt();
      PessoaEx10 pessoa = new PessoaEx10(idade);
      System.out.println(pessoa.obterStatusIdade());
    }

    entrada.close();
  }
}
