package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.VendaCupomLoja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaCupomLojaRepository extends JpaRepository<VendaCupomLoja, Long> {
}
