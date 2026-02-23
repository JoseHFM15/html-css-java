package br.com.dfcodelab.section.dois.missaodominar.ex2;

public class Test2 {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("joão");

        pessoa1.setIdade(20);
        pessoa1.setSexo('M');

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Sexo: " + pessoa1.getSexo());

        Pessoa pessoa2 = new Pessoa("Ana");

        pessoa2.setIdade(15);
        pessoa2.setSexo('F');

        System.out.println(" ");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Sexo: " + pessoa2.getSexo());

    }
}
