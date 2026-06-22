package br.com.dfcode.biblioteca.model;

import java.time.LocalDate;

public class Emprestimo {


    private Long id;
    private Usuario usuario;
    private ItemBiblioteca item;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private StatusEmprestimo status;

    public Emprestimo(Long id, Usuario usuario, ItemBiblioteca item) {
        this.id = id;
        this.usuario = usuario;
        this.item = item;
        this.dataEmprestimo = LocalDate.now();
        this.status = StatusEmprestimo.ATIVO;
    }

    public void Devolver() {
        this.dataDevolucao = LocalDate.now();
        this.status = StatusEmprestimo.DEVOLVIDO;
        this.item.devolver();
    }

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ItemBiblioteca getItem() {
        return item;
    }

    public StatusEmprestimo getStatus() {
        return status;
    }


}
