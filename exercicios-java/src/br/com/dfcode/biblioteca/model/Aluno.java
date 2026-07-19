package br.com.dfcode.biblioteca.model;

public class Aluno extends Usuario {


    public Aluno(long id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 3;
    }
}
