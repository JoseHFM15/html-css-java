package br.com.dfcode.biblioteca.model;

public abstract class ItemBiblioteca implements Emprestavel{
    private Long id;
    private String titulo;
    private int anoPublicacao;
    private boolean disponivel;

    public ItemBiblioteca(String titulo , Long id , int anoPublicacao) {
        this.titulo = titulo;
        this.id = id;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public abstract String getTipo();

    @Override
    public void emprestar() {
        this.disponivel = false;
    }

    @Override
    public void devolver() {
        this.disponivel = true;
    }

    @Override
    public boolean estaDisponivel() {
        return disponivel;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
