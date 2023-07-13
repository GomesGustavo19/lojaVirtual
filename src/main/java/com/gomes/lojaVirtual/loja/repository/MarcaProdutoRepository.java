package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.MarcaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaProdutoRepository extends JpaRepository<MarcaProduto,Long> {
}
