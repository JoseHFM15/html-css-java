package br.com.dfcodelab.sistemabiblioteca;


import java.time.LocalDate;
import java.util.Scanner;

public abstract class  ItemBiblioteca {
    Scanner sc = new Scanner(System.in);
    private String titulo;
    private int anoPublicacao;
    private boolean disponivel;
    protected String codigo;
    private static int totalItens = 0;



    public ItemBiblioteca(String titulo, int anoPublicacao){
        validarTitulo(titulo);
        validarAno(anoPublicacao);
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
        totalItens++;
        this.codigo = gerarCodigo();
    }



    public void emprestar(){
       if (!disponivel) throw new BibliotecaException("Livro já está emprestado.");

       disponivel = false;


    }
    public void devolver(){
        if (disponivel)throw new BibliotecaException("Livro já está disponivel");

        disponivel = true;
    }
    public abstract void exibirResumo();



    protected String gerarCodigo(){
        return "ITEM-" + totalItens;

    }
    protected void marcarComoIndisponivel(){

    }

    private void validarTitulo(String titulo){
        if (titulo == null || titulo.trim().isEmpty()){
            throw  new BibliotecaException("Título não pode ser vazio");
        }
    }
    private void validarAno(int ano){
        int anoAtual = LocalDate.now().getYear();
        if (ano < 1500 || ano > anoAtual){
            throw new BibliotecaException("Ano de publicação inválido");

        }
    }

    public static int getTotalItens(){

        return totalItens;
    }
    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String getCodigo() {
        return codigo;
    }
}
