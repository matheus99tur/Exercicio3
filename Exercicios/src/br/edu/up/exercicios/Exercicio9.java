package br.edu.up.exercicios;

import br.edu.up.modelo.NumeroEx9;

public class Exercicio9 {
  public static void main(String[] args) {
    int[] numeros = { /* Array de 80 números aqui */ };
    int contador = 0;

    for (int numero : numeros) {
      NumeroEx9 n = new NumeroEx9(numero);
      if (n.getValor() >= 10 && n.getValor() <= 150) {
        contador++;
      }
    }

    System.out.println("Quantidade de números no intervalo [10, 150]: " + contador);
  }
}
