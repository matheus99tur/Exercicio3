package br.edu.up.modelo;

public class ProfessorEx20 {
  private int nivel;
  private double valorHoraAula;

  public ProfessorEx20(int nivel) {
    this.nivel = nivel;
    definirValorHoraAula();
  }

  private void definirValorHoraAula() {
    switch (nivel) {
      case 1:
        valorHoraAula = 12.00;
        break;
      case 2:
        valorHoraAula = 17.00;
        break;
      case 3:
        valorHoraAula = 25.00;
        break;
      default:
        valorHoraAula = 0.00;
        break;
    }
  }

  public double calcularSalario(int horasAula) {
    return horasAula * valorHoraAula;
  }
}
