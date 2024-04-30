package br.edu.up.modelo;

public class TrianguloEx19 {
  private int lado1;
  private int lado2;
  private int lado3;

  public TrianguloEx19(int lado1, int lado2, int lado3) {
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
  }

  private boolean verificarCondicaoTriangulo() {
    return (lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2);
  }

  public String determinarTipoTriangulo() {
    if (verificarCondicaoTriangulo()) {
      if (lado1 == lado2 && lado2 == lado3) {
        return "Equilátero";
      } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        return "Isóscele";
      } else {
        return "Escaleno";
      }
    } else {
      return "Não é um triângulo";
    }
  }
}
