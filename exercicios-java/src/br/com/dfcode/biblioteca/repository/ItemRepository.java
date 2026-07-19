package br.com.dfcode.biblioteca.repository;

import br.com.dfcode.biblioteca.model.ItemBiblioteca;
import br.com.dfcode.biblioteca.model.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class ItemRepository {
    Scanner sc = new Scanner(System.in);
    private List<ItemBiblioteca>itens = new ArrayList<>();
    public void cadastrarLivro(Livro livro){
        System.out.println("digite as informações do livro na ordem a seguir:");
        System.out.println("titulo, ano publicação, autor e isbn ");
        livro = new Livro(sc.nextLine() , livro.gerarId(), sc.nextInt(),sc.nextLine(), sc.nextLine()  );
        itens.add(livro);
    }

    public void salvar(ItemBiblioteca item){
        itens.add(item);
    }

    public List<ItemBiblioteca> listarTodos(){
        return itens;
    }

    public Optional<ItemBiblioteca> buscarPorId(Long id){
         return itens.stream().filter(item -> item.getId().equals(id)).findFirst();
    }

    public List<ItemBiblioteca> listarDisponiveis() {
        return itens.stream().filter(ItemBiblioteca::estaDisponivel).toList();
    }



}
