package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class CupomDesconto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoDesconto;
    private BigDecimal valorRealDesconto;
    private BigDecimal valorPorcentoDesconto;

    @Deprecated
    public CupomDesconto() {
    }

    public CupomDesconto(Long id, String codigoDesconto, BigDecimal valorRealDesconto, BigDecimal valorPorcentoDesconto) {
        this.id = id;
        this.codigoDesconto = codigoDesconto;
        this.valorRealDesconto = valorRealDesconto;
        this.valorPorcentoDesconto = valorPorcentoDesconto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoDesconto() {
        return codigoDesconto;
    }

    public void setCodigoDesconto(String codigoDesconto) {
        this.codigoDesconto = codigoDesconto;
    }

    public BigDecimal getValorRealDesconto() {
        return valorRealDesconto;
    }

    public void setValorRealDesconto(BigDecimal valorRealDesconto) {
        this.valorRealDesconto = valorRealDesconto;
    }

    public BigDecimal getValorPorcentoDesconto() {
        return valorPorcentoDesconto;
    }

    public void setValorPorcentoDesconto(BigDecimal valorPorcentoDesconto) {
        this.valorPorcentoDesconto = valorPorcentoDesconto;
    }
}
