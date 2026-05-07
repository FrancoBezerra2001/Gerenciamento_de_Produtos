package com.exemplo.gerenciamento.services;

import com.exemplo.gerenciamento.entities.*;
import com.exemplo.gerenciamento.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GerenciamentoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Categoria salvarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Page<Produto> listarProdutos(String nome, int pagina, int tamanho, String direcao) {
        Sort sort = Sort.by("nome");
        sort = direcao.equalsIgnoreCase("asc") ? sort.ascending() : sort.descending();
        
        Pageable pageable = PageRequest.of(pagina, tamanho, sort);
        return produtoRepository.buscarPorNome(nome, pageable);
    }
}