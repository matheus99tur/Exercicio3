package br.edu.up.modelo;

public class VeiculoEx15 {
  private String tipoCombustivel;
  private double valor;

  public VeiculoEx15(String tipoCombustivel, double valor) {
    this.tipoCombustivel = tipoCombustivel;
    this.valor = valor;
  }

  public double calcularDesconto() {
    double desconto;
    if (tipoCombustivel.equalsIgnoreCase("álcool")) {
      desconto = valor * 0.25;
    } else if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
      desconto = valor * 0.21;
    } else if (tipoCombustivel.equalsIgnoreCase("diesel")) {
      desconto = valor * 0.14;
    } else {
      desconto = 0;
    }
    return desconto;
  }

  public double calcularValorPago() {
    return valor - calcularDesconto();
  }
}
