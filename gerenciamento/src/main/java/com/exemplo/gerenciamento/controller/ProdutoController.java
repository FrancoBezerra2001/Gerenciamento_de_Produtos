package com.exemplo.gerenciamento.controller;

import com.exemplo.gerenciamento.entities.Produto;
import com.exemplo.gerenciamento.services.GerenciamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private GerenciamentoService service;

    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return service.salvarProduto(produto);
    }

    @GetMapping
    public Page<Produto> listar(
            @RequestParam(defaultValue = "") String nome,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "asc") String direction) {
        return service.listarProdutos(nome, page, size, direction);
    }
}