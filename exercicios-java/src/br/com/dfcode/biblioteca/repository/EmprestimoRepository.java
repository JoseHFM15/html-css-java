package br.com.dfcode.biblioteca.repository;

import br.com.dfcode.biblioteca.model.Emprestimo;
import br.com.dfcode.biblioteca.model.ItemBiblioteca;
import br.com.dfcode.biblioteca.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmprestimoRepository {
    private List<Emprestimo> emprestimos;

    public EmprestimoRepository(List<Emprestimo> emprestimos) {
        this.emprestimos = new ArrayList<>();
    }
    public void salvar(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }
    public List<Emprestimo> listarTodos(){
        return emprestimos;
    }

    public Optional<Emprestimo> buscarPorId(Long id){
        return emprestimos.stream().filter(emprestimo -> emprestimo.getId().equals(id)).findFirst();


    }

    public int contarAtivosPorUsuario(Long id){
        int contador = 0;

        for (Emprestimo emp : this.emprestimos){
            if (emp.getUsuario().getId() == id && emp.)
        }

    }
}
