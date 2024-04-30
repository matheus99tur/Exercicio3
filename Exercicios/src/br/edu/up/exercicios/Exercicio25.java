package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.EstudanteEx25;

public class Exercicio25 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o nome do estudante:");
    String nome = scanner.nextLine();
    System.out.println("Informe o número de matrícula:");
    int matricula = scanner.nextInt();
    System.out.println("Informe a primeira nota:");
    double nota1 = scanner.nextDouble();
    System.out.println("Informe a segunda nota:");
    double nota2 = scanner.nextDouble();
    System.out.println("Informe a terceira nota:");
    double nota3 = scanner.nextDouble();

    EstudanteEx25 estudante = new EstudanteEx25(nome, matricula, nota1, nota2, nota3);

    double notaFinal = estudante.calcularNotaFinal();

    String classificacao = estudante.obterClassificacao();

    System.out.println("Nome: " + estudante.getNome());
    System.out.println("Matrícula: " + estudante.getMatricula());
    System.out.println("Nota final: " + notaFinal);
    System.out.println("Classificação: " + classificacao);

    scanner.close();
  }
}
