package br.edu.up.modelo;

public class ContaLuzEx22 {
  private int tipoCliente;
  private double valorKWh;
  private double consumo;

  public ContaLuzEx22(int tipoCliente, double consumo) {
    this.tipoCliente = tipoCliente;
    this.consumo = consumo;
    definirValorKWh();
  }

  private void definirValorKWh() {
    switch (tipoCliente) {
      case 1:
        valorKWh = 0.602;
        break;
      case 2:
        valorKWh = 0.483;
        break;
      case 3:
        valorKWh = 1.29;
        break;
      default:
        valorKWh = 0;
        break;
    }
  }

  public double calcularConta() {
    return valorKWh * consumo;
  }
}
