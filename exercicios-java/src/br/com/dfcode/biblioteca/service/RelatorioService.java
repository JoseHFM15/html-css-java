package br.com.dfcode.biblioteca.service;

import br.com.dfcode.biblioteca.model.Emprestimo;
import br.com.dfcode.biblioteca.model.StatusEmprestimo;
import br.com.dfcode.biblioteca.repository.EmprestimoRepository;
import br.com.dfcode.biblioteca.repository.UsuarioRepository;

import java.util.List;

public class RelatorioService {
    private UsuarioRepository usuarioRepository;
    private EmprestimoRepository emprestimoRepository;

    public RelatorioService(UsuarioRepository usuarioRepository, EmprestimoRepository emprestimoRepository) {
        this.usuarioRepository = usuarioRepository;
        this.emprestimoRepository = emprestimoRepository;
    }

    public void exibirEstatisticasGerais(){
        System.out.println("\n====================================");
        System.out.println("      DASHBORD ESTATÍSTICO GERAL      ");
        System.out.println("====================================");

        int totalUsuarios = usuarioRepository.listarTodos().size();
        int totalAtivos = 0;
        int totalDelvolvidos = 0;

        List<Emprestimo> todosEmprestimos = emprestimoRepository.listarTodos();

        for (Emprestimo emp : todosEmprestimos){
            if (emp.getStatus() == StatusEmprestimo.ATIVO){
                totalAtivos++;
            } else if (emp.getStatus() == StatusEmprestimo.DEVOLVIDO) {
                totalDelvolvidos++;
            }

            System.out.println(" Total de Usuários Cadastrados: "+ totalAtivos);
            System.out.println(" Total de Empréstimos Registrados: "+ todosEmprestimos);
            System.out.println("-----------------------------------------------");
            System.out.println("    Empréstimos Ativos: "+ totalAtivos);
            System.out.println("    Empréstimos Devolvidos: "+ totalDelvolvidos);
            System.out.println("================================================");
        }
    }
}
