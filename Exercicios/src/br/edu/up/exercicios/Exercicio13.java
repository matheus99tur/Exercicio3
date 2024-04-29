package br.edu.up.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.modelo.PessoaEx13;

public class Exercicio13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<PessoaEx13> pessoas = new ArrayList<>();
    char continuar;

    do {
      System.out.print("Informe o nome: ");
      String nome = scanner.next();

      System.out.print("Informe o sexo (M/F): ");
      char sexo = scanner.next().charAt(0);

      System.out.print("Informe a idade: ");
      int idade = scanner.nextInt();

      System.out.print("Informe a saúde (S/N): ");
      char saude = scanner.next().charAt(0);

      PessoaEx13 pessoa = new PessoaEx13(nome, sexo, idade, saude);
      pessoas.add(pessoa);

      System.out.print("Deseja continuar? (S/N): ");
      continuar = scanner.next().charAt(0);
    } while (continuar == 'S' || continuar == 's');

    scanner.close();

    int totalAptos = 0;
    int totalHomens = 0;
    int totalMulheres = 0;

    System.out.println("\nResultado da inspeção:");
    for (PessoaEx13 pessoa : pessoas) {
      System.out.println("Nome: " + pessoa.getNome());
      System.out.println("Sexo: " + pessoa.getSexo());
      System.out.println("Idade: " + pessoa.getIdade());
      System.out.println("Saúde: " + pessoa.getSaude());
      System.out.println("Apto para o serviço militar: " + (pessoa.estaApto() ? "Sim" : "Não"));
      System.out.println();

      if (pessoa.getSexo() == 'M') {
        totalHomens++;
      } else {
        totalMulheres++;
      }

      if (pessoa.estaApto()) {
        totalAptos++;
      }
    }

    System.out.println("\nTotal de pessoas inspecionadas: " + pessoas.size());
    System.out.println("Total de homens: " + totalHomens);
    System.out.println("Total de mulheres: " + totalMulheres);
    System.out.println("Total de aptos para o serviço militar: " + totalAptos);
  }
}
