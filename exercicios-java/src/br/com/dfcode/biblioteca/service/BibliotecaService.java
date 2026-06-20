package br.com.dfcode.biblioteca.service;

import br.com.dfcode.biblioteca.exception.ItemIndisponivelException;
import br.com.dfcode.biblioteca.exception.ItemNaoEncontradoException;
import br.com.dfcode.biblioteca.exception.LimiteEmprestimoException;
import br.com.dfcode.biblioteca.exception.UsuarioNaoEncontradoException;
import br.com.dfcode.biblioteca.model.Emprestimo;
import br.com.dfcode.biblioteca.model.ItemBiblioteca;
import br.com.dfcode.biblioteca.model.Usuario;
import br.com.dfcode.biblioteca.repository.EmprestimoRepository;
import br.com.dfcode.biblioteca.repository.ItemRepository;
import br.com.dfcode.biblioteca.repository.UsuarioRepository;

public class BibliotecaService {
    private ItemRepository itemRepository;
    private UsuarioRepository usuarioRepository;
    private EmprestimoRepository emprestimoRepository;

    public void realizarEmprestimo(Long usuarioId, Long itemId){
        Usuario usuario = usuarioRepository.buscarPorId(usuarioId).orElseThrow(() -> new UsuarioNaoEncontradoException("Usuario não encontrado"));

        ItemBiblioteca item = itemRepository.buscarPorId(itemId).orElseThrow(() -> new ItemNaoEncontradoException("Item não foi encontrado"));

        if (!item.estaDisponivel()){
            throw new ItemIndisponivelException("Item indisponivel para emprestimo");
        }
        long ativos = emprestimoRepository.contarAtivosPorUsuario(usuario.getId());
        if (ativos >= usuario.getLimiteEmprestimos()){
            throw new LimiteEmprestimoException("Usuario atingiu o limite de emprestimos");
        }

        item.emprestar();
        Emprestimo emprestimo = new Emprestimo(gerarId(), usuario, item);
        emprestimoRepository.salvar(emprestimo);
    }

}
