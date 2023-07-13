package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.CupomDesconto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CupomDescontoRepository extends JpaRepository<CupomDesconto, Long> {
}
