package br.edu.up.modelo;

public class PessoaEx11 {
  private String nome;
  private char sexo;

  public PessoaEx11(String nome, char sexo) {
    this.nome = nome;
    this.sexo = sexo;
  }

  public String getNome() {
    return nome;
  }

  public char getSexo() {
    return sexo;
  }

  public String obterGenero() {
    if (sexo == 'M' || sexo == 'm') {
      return "Homem";
    } else if (sexo == 'F' || sexo == 'f') {
      return "Mulher";
    } else {
      return "Sexo indefinido";
    }
  }
}
