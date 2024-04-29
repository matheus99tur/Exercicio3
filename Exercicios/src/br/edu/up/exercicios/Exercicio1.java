package br.edu.up.exercicios;

import br.edu.up.modelo.AlunoEx1;

public class Exercicio1 {
  public static void main(String[] args) {
    AlunoEx1 aluno = new AlunoEx1("João", 7.5, 8.0, 6.5);
    System.out.println("Nome: " + aluno.getNome());
    System.out.println("Média: " + aluno.calcularMedia());
  }
}
