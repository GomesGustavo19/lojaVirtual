package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.ImagemProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagemProdutoRepository extends JpaRepository<ImagemProduto,Long> {
}
