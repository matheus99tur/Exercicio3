package br.edu.up.modelo;

public class FuncionarioEx16 {
  private String nome;
  private double salario;
  private double salarioMinimo;

  public FuncionarioEx16(String nome, double salario, double salarioMinimo) {
    this.nome = nome;
    this.salario = salario;
    this.salarioMinimo = salarioMinimo;
  }

  public double calcularReajuste() {
    double reajuste;
    if (salario < 3 * salarioMinimo) {
      reajuste = salario * 0.5;
    } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
      reajuste = salario * 0.2;
    } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
      reajuste = salario * 0.15;
    } else {
      reajuste = salario * 0.1;
    }
    return reajuste;
  }

  public double calcularNovoSalario() {
    return salario + calcularReajuste();
  }

  public String getNome() {
    return nome;
  }

  public double getSalario() {
    return salario;
  }

  public double getSalarioMinimo() {
    return salarioMinimo;
  }
}
