package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento,Long> {
}
