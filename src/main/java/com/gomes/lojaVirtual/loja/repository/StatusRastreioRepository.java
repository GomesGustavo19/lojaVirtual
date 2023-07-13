package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.StatusRastreio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRastreioRepository extends JpaRepository<StatusRastreio,Long> {
}
