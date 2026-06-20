package br.com.dfcode.biblioteca.service;

import br.com.dfcode.biblioteca.repository.EmprestimoRepository;
import br.com.dfcode.biblioteca.repository.UsuarioRepository;

public class RelatorioService {
    private UsuarioRepository usuarioRepository;
    private EmprestimoRepository emprestimoRepository;

    public RelatorioService(UsuarioRepository usuarioRepository, EmprestimoRepository emprestimoRepository) {
        this.usuarioRepository = usuarioRepository;
        this.emprestimoRepository = emprestimoRepository;
    }
}
