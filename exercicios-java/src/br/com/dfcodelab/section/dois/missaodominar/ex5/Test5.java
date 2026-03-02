package br.com.dfcodelab.section.dois.missaodominar.ex5;

public class Test5 {
    public static void main(String[] args) {

        ManipuladorString objeto = new ManipuladorString("");

        objeto.setTexto("Olá");

        String palavra = " mundo";

        objeto.concatenarTexto(objeto, palavra);

        System.out.println(objeto.getTexto());
    }
}
