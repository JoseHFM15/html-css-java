package br.com.dfcode.biblioteca.model;

public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, long id, int anoPublicacao ,int edicao) {
        super(titulo, id, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }

    public int getEdicao() {
        return edicao;
    }
}
