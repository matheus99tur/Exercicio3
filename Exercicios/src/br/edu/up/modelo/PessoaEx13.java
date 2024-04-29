package br.edu.up.modelo;

public class PessoaEx13 {
  private String nome;
  private char sexo;
  private int idade;
  private char saude;

  public PessoaEx13(String nome, char sexo, int idade, char saude) {
      this.nome = nome;
      this.sexo = sexo;
      this.idade = idade;
      this.saude = saude;
  }

  public boolean estaApto() {
      return idade >= 18 && saude == 'S';
  }

  public String getNome() {
      return nome;
  }

  public char getSexo() {
      return sexo;
  }

  public int getIdade() {
      return idade;
  }

  public char getSaude() {
      return saude;
  }
}
