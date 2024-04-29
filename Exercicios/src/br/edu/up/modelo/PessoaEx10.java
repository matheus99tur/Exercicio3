package br.edu.up.modelo;

public class PessoaEx10 {
  private int idade;

  public PessoaEx10(int idade) {
    this.idade = idade;
  }

  public int getIdade() {
    return idade;
  }

  public String obterStatusIdade() {
    if (idade >= 18) {
      return "Maior de idade";
    } else {
      return "Menor de idade";
    }
  }
}
