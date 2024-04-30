package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.ProfessorEx20;

public class Exercicio20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nível do professor (1, 2 ou 3):");
    int nivel = scanner.nextInt();

    System.out.println("Digite a quantidade de horas/aula ministradas:");
    int horasAula = scanner.nextInt();

    ProfessorEx20 professor = new ProfessorEx20(nivel);

    double salario = professor.calcularSalario(horasAula);
    System.out.println("O salário do professor é: R$ " + salario);

    scanner.close();
  }
}
