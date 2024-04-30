package br.edu.up.modelo;

public class PretendenteEx26 {
  private String nome;
  private int idade;
  private int grupoRisco;

  public PretendenteEx26(String nome, int idade, int grupoRisco) {
    this.nome = nome;
    this.idade = idade;
    this.grupoRisco = grupoRisco;
  }

  public String determinarCategoria() {
    if (idade >= 17 && idade <= 20) {
      return "Categoria: " + getGrupoRisco();
    } else if (idade >= 21 && idade <= 24) {
      return "Categoria: " + (getGrupoRisco() + 1);
    } else if (idade >= 25 && idade <= 34) {
      return "Categoria: " + (getGrupoRisco() + 2);
    } else if (idade >= 35 && idade <= 64) {
      return "Categoria: " + (getGrupoRisco() + 3);
    } else if (idade >= 65 && idade <= 70) {
      return "Categoria: " + (getGrupoRisco() + 6);
    } else {
      return "Não se enquadra em nenhuma categoria.";
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getGrupoRisco() {
    return grupoRisco;
  }

  public void setGrupoRisco(int grupoRisco) {
    this.grupoRisco = grupoRisco;
  }
}
