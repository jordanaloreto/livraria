package com.livraria_mvc.controller;

import java.util.List;

import com.livraria_mvc.dao.LivroRepository;
import com.livraria_mvc.model.Livro;

public class LivroController {

    private LivroRepository livroRepository;

    public boolean salvarLivro(Livro livro) {
        return livroRepository.salvar(livro);
    }

    public boolean alterarLivro(Livro livro) {
        return livroRepository.alterar(livro);
    }

    public boolean excluirLivro(Livro livro) {
        return livroRepository.excluir(livro);
    }
	
    public List<Livro> buscarTodosLivros() {
        return livroRepository.buscarTodos();
    }

    public Livro buscarLivroPorId(int id) {
        return livroRepository.buscar(id);
    }
}
