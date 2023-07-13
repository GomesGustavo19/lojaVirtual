package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class NotaItemProduto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private NotaFiscalCompra notaFinalCompra;
    private Produto produto;
    private Double quantidade;

    @Deprecated
    public NotaItemProduto() {
    }

    public NotaItemProduto(Long id, NotaFiscalCompra notaFinalCompra, Produto produto, Double quantidade) {
        this.id = id;
        this.notaFinalCompra = notaFinalCompra;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NotaFiscalCompra getNotaFinalCompra() {
        return notaFinalCompra;
    }

    public void setNotaFinalCompra(NotaFiscalCompra notaFinalCompra) {
        this.notaFinalCompra = notaFinalCompra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
