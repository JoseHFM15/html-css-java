package br.com.dfcode.biblioteca.repository;

import br.com.dfcode.biblioteca.model.ItemBiblioteca;
import br.com.dfcode.biblioteca.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioRepository {
    private List<Usuario> usuarios;

    public UsuarioRepository(List<Usuario> usuarios) {
        this.usuarios = new ArrayList<>();
    }
    public void salvar(Usuario usuario){
        usuarios.add(usuario);
    }

    public List<Usuario> listarTodos(){
        return usuarios;
    }

    public Optional<Usuario> buscarPorId(Long id){
        return usuarios.stream().filter(usuario -> usuario.getId().equals(id)).findFirst();
    }

}
