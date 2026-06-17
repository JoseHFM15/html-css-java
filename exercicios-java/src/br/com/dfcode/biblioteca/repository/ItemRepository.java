package br.com.dfcode.biblioteca.repository;

import br.com.dfcode.biblioteca.model.ItemBiblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemRepository {
    private List<ItemBiblioteca>itens = new ArrayList<>();

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
