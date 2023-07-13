package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.NotaFiscalVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFiscalVendaRepository extends JpaRepository<NotaFiscalVenda, Long> {
}
