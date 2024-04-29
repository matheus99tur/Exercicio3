package br.edu.up.modelo;

public class VendedorEx3 {
  private String nome;
  private double salarioFixo;
  private double totalVendas;

  public VendedorEx3(String nome, double salarioFixo, double totalVendas) {
    this.nome = nome;
    this.salarioFixo = salarioFixo;
    this.totalVendas = totalVendas;
  }

  public double calcularSalarioFinal() {
    double comissao = totalVendas * 0.15;
    return salarioFixo + comissao;
  }

  // Getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalarioFixo() {
    return salarioFixo;
  }

  public void setSalarioFixo(double salarioFixo) {
    this.salarioFixo = salarioFixo;
  }

  public double getTotalVendas() {
    return totalVendas;
  }

  public void setTotalVendas(double totalVendas) {
    this.totalVendas = totalVendas;
  }
}
