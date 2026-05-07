package com.exemplo.gerenciamento.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exemplo.gerenciamento.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query("SELECT p FROM Produto p WHERE LOWER(p.nome) LIKE LOWER(concat('%', :nome, '%'))")
    Page<Produto> buscarPorNome(@Param("nome") String nome, Pageable pageable);
}