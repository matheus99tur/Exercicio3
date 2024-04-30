package br.edu.up.modelo;

public class EstudanteEx24 {
  private double notaLaboratorio;
  private double notaSemestral;
  private double notaExameFinal;

  public EstudanteEx24(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
    this.notaLaboratorio = notaLaboratorio;
    this.notaSemestral = notaSemestral;
    this.notaExameFinal = notaExameFinal;
  }

  public double calcularNotaFinal() {
    return (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
  }

  public double getNotaLaboratorio() {
    return notaLaboratorio;
  }

  public void setNotaLaboratorio(double notaLaboratorio) {
    this.notaLaboratorio = notaLaboratorio;
  }

  public double getNotaSemestral() {
    return notaSemestral;
  }

  public void setNotaSemestral(double notaSemestral) {
    this.notaSemestral = notaSemestral;
  }

  public double getNotaExameFinal() {
    return notaExameFinal;
  }

  public void setNotaExameFinal(double notaExameFinal) {
    this.notaExameFinal = notaExameFinal;
  }
}
