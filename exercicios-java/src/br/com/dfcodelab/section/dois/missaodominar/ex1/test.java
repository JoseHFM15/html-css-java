package br.com.dfcodelab.section.dois.missaodominar.ex1;

public class test {
    public static void main(String[] args) {
        Carros meuCarro = new Carros("Toyota", "Corolla", 2022);

        meuCarro.exibirInformacoes();

        Carros outroCarro = new Carros("Honda", "Civic", 2023);
        outroCarro.exibirInformacoes();
    }
}
