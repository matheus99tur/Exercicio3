package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.EstudanteEx24;

public class Exercicio24 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a nota do trabalho de laboratório:");
    double notaLaboratorio = scanner.nextDouble();
    System.out.println("Informe a nota da avaliação semestral:");
    double notaSemestral = scanner.nextDouble();
    System.out.println("Informe a nota do exame final:");
    double notaExameFinal = scanner.nextDouble();

    EstudanteEx24 estudante = new EstudanteEx24(notaLaboratorio, notaSemestral, notaExameFinal);

    double notaFinal = estudante.calcularNotaFinal();
    System.out.println("Nota final do estudante: " + notaFinal);

    scanner.close();
  }
}
