package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.NotaItemProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaItemProdutoRepository extends JpaRepository<NotaItemProduto, Long> {
}
