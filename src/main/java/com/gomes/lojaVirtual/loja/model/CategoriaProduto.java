package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CategoriaProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDescricao;

    @Deprecated
    public CategoriaProduto() {
    }

    public CategoriaProduto(Long id, String nomeDescricao) {
        this.id = id;
        this.nomeDescricao = nomeDescricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDescricao() {
        return nomeDescricao;
    }

    public void setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
    }
}
