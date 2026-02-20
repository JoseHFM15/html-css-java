package br.com.dfcodelab.section.dois.missaodominar.ex1;

public class Carros {
    // Atributos da classe
    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Carros(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

}
