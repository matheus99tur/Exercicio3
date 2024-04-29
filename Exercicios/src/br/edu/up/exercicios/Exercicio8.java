package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.AlunoEx8;

public class Exercicio8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome do aluno: ");
    String nome = scanner.nextLine();

    System.out.print("Digite a nota 1: ");
    double nota1 = scanner.nextDouble();

    System.out.print("Digite a nota 2: ");
    double nota2 = scanner.nextDouble();

    System.out.print("Digite a nota 3: ");
    double nota3 = scanner.nextDouble();

    AlunoEx8 aluno = new AlunoEx8(nome, nota1, nota2, nota3);
    double media = aluno.calcularMedia();
    String mencao = aluno.obterMencao();

    System.out.println("Nome do aluno: " + aluno.getNome());
    System.out.println("Média: " + media);
    System.out.println("Menção: " + mencao);

    scanner.close();
  }
}
