package br.com.dfcode.biblioteca.model;

public interface Emprestavel {
    void emprestar();
    void devolver();
    boolean estaDisponivel();
}
