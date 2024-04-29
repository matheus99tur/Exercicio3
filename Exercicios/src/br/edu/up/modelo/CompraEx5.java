package br.edu.up.modelo;

public class CompraEx5 {
  private double valorCompra;

  public CompraEx5(double valorCompra) {
    this.valorCompra = valorCompra;
  }

  public double calcularValorPrestacao() {
    return valorCompra / 5;
  }
}
