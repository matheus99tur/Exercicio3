package br.edu.up.modelo;

public class ProdutoEx14 {
  private double precoCusto;
  private double precoVenda;

  public ProdutoEx14(double precoCusto, double precoVenda) {
    this.precoCusto = precoCusto;
    this.precoVenda = precoVenda;
  }

  public double calcularLucroOuPrejuizo() {
    double lucro = precoVenda - precoCusto;
    if (lucro > 0) {
      return lucro;
    } else if (lucro < 0) {
      return lucro;
    } else {
      return 0;
    }
  }

  public double getPrecoCusto() {
    return precoCusto;
  }

  public double getPrecoVenda() {
    return precoVenda;
  }
}
