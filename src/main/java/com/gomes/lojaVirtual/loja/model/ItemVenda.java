package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class ItemVenda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Produto produto;
    @ManyToOne
    private VendaCupomLoja vendaCupomLoja;
    private Double quantidade;

    @Deprecated
    public ItemVenda() {
    }

    public ItemVenda(Long id, Produto produto, VendaCupomLoja vendaCupomLoja, Double quantidade) {
        this.id = id;
        this.produto = produto;
        this.vendaCupomLoja = vendaCupomLoja;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public VendaCupomLoja getVendaCupomLoja() {
        return vendaCupomLoja;
    }

    public void setVendaCupomLoja(VendaCupomLoja vendaCupomLoja) {
        this.vendaCupomLoja = vendaCupomLoja;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
