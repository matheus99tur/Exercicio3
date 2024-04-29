package br.edu.up.exercicios;

import br.edu.up.modelo.VendedorEx3;

public class Exercicio3 {
  public static void main(String[] args) {
    VendedorEx3 vendedor = new VendedorEx3("João", 2000, 10000);
    System.out.println("Nome do vendedor: " + vendedor.getNome());
    System.out.println("Salário fixo: R$" + vendedor.getSalarioFixo());
    System.out.println("Salário no final do mês: R$" + vendedor.calcularSalarioFinal());
  }
}
