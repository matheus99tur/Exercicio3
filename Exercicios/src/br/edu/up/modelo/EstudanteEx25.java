package br.edu.up.modelo;

public class EstudanteEx25 {
  private String nome;
  private int matricula;
  private double nota1;
  private double nota2;
  private double nota3;

  public EstudanteEx25(String nome, int matricula, double nota1, double nota2, double nota3) {
    this.nome = nome;
    this.matricula = matricula;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  public double calcularNotaFinal() {
    return (nota1 + nota2 + nota3) / 3;
  }

  public String obterClassificacao() {
    double notaFinal = calcularNotaFinal();
    if (notaFinal >= 8 && notaFinal <= 10) {
      return "A";
    } else if (notaFinal >= 7 && notaFinal < 8) {
      return "B";
    } else if (notaFinal >= 6 && notaFinal < 7) {
      return "C";
    } else if (notaFinal >= 5 && notaFinal < 6) {
      return "D";
    } else {
      return "R";
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public double getNota1() {
    return nota1;
  }

  public void setNota1(double nota1) {
    this.nota1 = nota1;
  }

  public double getNota2() {
    return nota2;
  }

  public void setNota2(double nota2) {
    this.nota2 = nota2;
  }

  public double getNota3() {
    return nota3;
  }

  public void setNota3(double nota3) {
    this.nota3 = nota3;
  }
}
