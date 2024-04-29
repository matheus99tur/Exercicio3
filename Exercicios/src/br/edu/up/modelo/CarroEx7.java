package br.edu.up.modelo;

public class CarroEx7 {
  private double custoFabrica;

  public CarroEx7(double custoFabrica) {
    this.custoFabrica = custoFabrica;
  }

  private double calcularImpostos() {
    return custoFabrica * 0.45;
  }

  private double calcularCustoDistribuidor() {
    return (calcularImpostos() + custoFabrica) * 1.28;
  }

  public double calcularCustoConsumidor() {
    return calcularImpostos() + calcularCustoDistribuidor();
  }
}
