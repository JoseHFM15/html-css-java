package br.com.dfcodelab.section.dois.missaodominar.ex4;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicado;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }
}
