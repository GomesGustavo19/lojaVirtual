package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
