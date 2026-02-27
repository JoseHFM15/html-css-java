package br.com.dfcodelab.section.dois.missaodominar.ex4;



public class Test4 {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");

        Livro livro2 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez");

        Livro livro3 = new Livro("1984", "George Orwell");

        livro1.setAnoPublicado(1899);

        livro2.setAnoPublicado(1967);

        livro3.setAnoPublicado(1949);

        System.out.println("N/1");

        System.out.println("Titulo:" + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano de publicação:" + livro1.getAnoPublicado());
        System.out.println(" ");
        System.out.println("N/2");

        System.out.println("Titulo:" + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Ano de publicação:" + livro2.getAnoPublicado());
        System.out.println(" ");
        System.out.println("N/3");

        System.out.println("Titulo:" + livro3.getTitulo());
        System.out.println("Autor: " + livro3.getAutor());
        System.out.println("Ano de publicação:" + livro3.getAnoPublicado());
    }
}
