package br.edu.up.modelo;

public class ConversorEx4 {
  private double cotacaoDolar;

  public ConversorEx4(double cotacaoDolar) {
    this.cotacaoDolar = cotacaoDolar;
  }

  public double converterDolarParaReal(double quantidadeDolar) {
    return quantidadeDolar * cotacaoDolar;
  }
}
