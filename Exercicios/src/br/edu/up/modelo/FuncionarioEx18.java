package br.edu.up.modelo;

public class FuncionarioEx18 {
  private String nome;
  private int idade;
  private char sexo;
  private double salarioFixo;

  public FuncionarioEx18(String nome, int idade, char sexo, double salarioFixo) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
    this.salarioFixo = salarioFixo;
  }

  public double calcularAbono() {
    if (sexo == 'M' && idade >= 30) {
      return 100.0;
    } else if (sexo == 'M' && idade < 30) {
      return 50.0;
    } else if (sexo == 'F' && idade >= 30) {
      return 200.0;
    } else {
      return 80.0;
    }
  }

  public double calcularSalarioLiquido() {
    return salarioFixo + calcularAbono();
  }

  public String getNome() {
    return nome;
  }

  public double getSalarioFixo() {
    return salarioFixo;
  }
}
