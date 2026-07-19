package br.com.dfcodelab.section.dois.missaodominar.ex6;

public class Aluno {

    private String nome;

    private String matricula;

    private static int contador = 1;

    public Aluno(String nome){

        this.nome = nome;
        this.matricula = "";
    }

    public void GerarMatriculas(){

        String ano = "2024";

        String numeroFormatado = String.format("%03d", contador);

        this.matricula = "MAT-" + ano + "-" + numeroFormatado;

        contador++;
    }

    public String getnome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setnome(String nome) {

        this.nome = nome;


    }
}
