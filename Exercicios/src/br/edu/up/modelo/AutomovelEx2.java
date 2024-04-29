package br.edu.up.modelo;

public class AutomovelEx2 {
  private double distanciaPercorrida;
  private double combustivelGasto;

  public AutomovelEx2(double distanciaPercorrida, double combustivelGasto) {
    this.distanciaPercorrida = distanciaPercorrida;
    this.combustivelGasto = combustivelGasto;
  }

  public double calcularConsumoMedio() {
    return distanciaPercorrida / combustivelGasto;
  }
}
