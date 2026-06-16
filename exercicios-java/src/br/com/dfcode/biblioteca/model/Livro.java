package br.com.dfcode.biblioteca.model;

public class Livro extends ItemBiblioteca{

    private String autor;
    private String isbn;
    public Livro(String titulo, long id, int anoPublicacao ,String autor ,String isbn) {
        super(titulo, id, anoPublicacao);
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public String getTipo() {
        return "Livro";
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}
