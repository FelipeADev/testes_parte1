package br.com.faguirre;

import java.util.List;


public class Pessoa {
    private String Nome;
    private String Sexualidade;

    public Pessoa() {
    }

    public Pessoa(String Nome, String Sexualidade) {
        this.Nome = Nome;
        this.Sexualidade = Sexualidade;
    }


    public Pessoa(Pessoa pessoa) {
        this(pessoa.getNome(), pessoa.getSexualidade());
    }

    public List registroPessoas() {
        Pessoa pessoa1 = new Pessoa("Rodrigo", "Masculino");
        Pessoa pessoa2 = new Pessoa("Felipe", "Masculino");
        Pessoa pessoa3 = new Pessoa("Luiza", "Feminino");
        Pessoa pessoa4 = new Pessoa("Lara", "Feminino");
        Pessoa pessoa5 = new Pessoa("Carol", "Feminino");
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSexualidade() {
        return Sexualidade;
    }

    public void setSexualidade(String sexualidade) {
        Sexualidade = sexualidade;
    }

    @Override
    public String toString() {
        return Nome;
    }
}
