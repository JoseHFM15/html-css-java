package br.com.dfcodelab.section.dois.missaodominar.ex3;

public class Retangulo {

    private double altura;

    private double largura;

    public Retangulo(){

        this.altura = 1.0;
        this.largura = 1.0;
    }

    public Retangulo(double altura, double largura){

        this.altura = altura;
        this.largura = largura;
    }

    public double calcArea(){

        return this.altura * this.largura;
    }



}
