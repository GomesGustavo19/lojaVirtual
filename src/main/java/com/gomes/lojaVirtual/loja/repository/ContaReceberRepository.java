package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.ContaReceber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaReceberRepository extends JpaRepository<ContaReceber,Long> {
}
