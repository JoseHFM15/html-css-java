package br.com.dfcodelab.section.dois.missaodominar.ex2;

public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 0;
        this.sexo = ' ';

    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
