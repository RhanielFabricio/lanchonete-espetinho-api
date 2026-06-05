package com.lanchonete.lanchonete_api.service;

import com.lanchonete.lanchonete_api.model.Produto;
import com.lanchonete.lanchonete_api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public Produto atualizar(Long id, Produto produtoAtualizado) {
    Produto produto = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    produto.setNome(produtoAtualizado.getNome());
    produto.setCategoria(produtoAtualizado.getCategoria());
    produto.setPreco(produtoAtualizado.getPreco());
    return repository.save(produto);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}