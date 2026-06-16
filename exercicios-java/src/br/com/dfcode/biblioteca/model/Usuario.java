package br.com.dfcode.biblioteca.model;

public abstract class Usuario {
    private long id;
    private String nome;
    private String email;

    public Usuario(String email, String nome, long id) {
        this.email = email;
        this.nome = nome;
        this.id = id;
    }

    public abstract int getLimiteEmprestimos();

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

}
