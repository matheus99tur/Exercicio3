package br.edu.up.modelo;

public class AlunoEx1 {
  private String nome;
  private double nota1;
  private double nota2;
  private double nota3;

  public AlunoEx1(String nome, double nota1, double nota2, double nota3) {
    this.nome = nome;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  public String getNome() {
    return nome;
  }

  public double calcularMedia() {
    return (nota1 + nota2 + nota3) / 3;
  }
}
