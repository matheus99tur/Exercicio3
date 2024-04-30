package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelo.TrianguloEx19;

public class Exercicio19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o tamanho do lado 1 do triângulo:");
    int lado1 = scanner.nextInt();

    System.out.println("Digite o tamanho do lado 2 do triângulo:");
    int lado2 = scanner.nextInt();

    System.out.println("Digite o tamanho do lado 3 do triângulo:");
    int lado3 = scanner.nextInt();

    TrianguloEx19 triangulo = new TrianguloEx19(lado1, lado2, lado3);

    String tipoTriangulo = triangulo.determinarTipoTriangulo();
    System.out.println("O triângulo é do tipo: " + tipoTriangulo);

    scanner.close();
  }
}
