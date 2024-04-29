package br.edu.up.exercicios;

import br.edu.up.modelo.AutomovelEx2;

public class Exercicio2 {
  public static void main(String[] args) {
    AutomovelEx2 automovel = new AutomovelEx2(300, 20);
    System.out.println("Consumo médio: " + automovel.calcularConsumoMedio() + " km/l");
  }
}
