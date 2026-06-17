package br.com.dfcode.biblioteca.model;

public class Professor extends Usuario {
    public Professor(long id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 5;
    }
}