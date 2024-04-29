package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.PessoaEx11;

public class Exercicio11 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int totalHomens = 0;
    int totalMulheres = 0;

    for (int i = 1; i <= 5; i++) {
      System.out.println("Dados da pessoa " + i + ":");
      System.out.print("Nome: ");
      String nome = entrada.next();
      System.out.print("Sexo (M/F): ");
      char sexo = entrada.next().charAt(0);

      PessoaEx11 pessoa = new PessoaEx11(nome, sexo);
      System.out.println("Nome: " + pessoa.getNome());
      System.out.println("Sexo: " + pessoa.obterGenero());

      if (pessoa.getSexo() == 'M' || pessoa.getSexo() == 'm') {
        totalHomens++;
      } else if (pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f') {
        totalMulheres++;
      }
    }

    System.out.println("\nTotal de Homens: " + totalHomens);
    System.out.println("Total de Mulheres: " + totalMulheres);

    entrada.close();
  }
}
