package com.gomes.lojaVirtual.loja.repository;

import com.gomes.lojaVirtual.loja.model.Acesso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessoRepository extends CrudRepository<Acesso,Long> {
}
