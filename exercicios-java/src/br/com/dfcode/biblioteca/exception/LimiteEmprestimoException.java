package br.com.dfcode.biblioteca.exception;

public class LimiteEmprestimoException extends RuntimeException {
    public LimiteEmprestimoException(String mensagem) {
        super(mensagem);
    }
}
