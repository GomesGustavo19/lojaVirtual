package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.CategoriaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaProdutoRepository extends JpaRepository<CategoriaProduto, Long> {
}
