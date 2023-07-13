package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class AvaliacaoProduto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private int nota;
    @ManyToOne
    private Pessoa pessoa;
    @ManyToOne
    private Produto produto;

    @Deprecated
    public AvaliacaoProduto() {
    }

    public AvaliacaoProduto(Long id, String descricao, int nota, Pessoa pessoa, Produto produto) {
        this.id = id;
        this.descricao = descricao;
        this.nota = nota;
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
