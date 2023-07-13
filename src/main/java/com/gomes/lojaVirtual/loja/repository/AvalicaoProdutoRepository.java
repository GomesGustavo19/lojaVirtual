package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.AvaliacaoProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvalicaoProdutoRepository extends JpaRepository<AvaliacaoProduto, Long> {
}
