package br.edu.up.modelo;

public class ProdutoEx6 {
  private double precoCusto;

  public ProdutoEx6(double precoCusto) {
    this.precoCusto = precoCusto;
  }

  public double calcularPrecoVenda(double percentualLucro) {
    return precoCusto * (1 + percentualLucro / 100);
  }
}
