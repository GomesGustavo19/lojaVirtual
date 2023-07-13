package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.ContaPagar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaPagarRepository extends JpaRepository<ContaPagar,Long> {
}
