package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Embeddable
public class NotaFiscalCompra implements Serializable {

    private String numeroNota;
    private String serieNota;
    private String descricaoObs;
    private BigDecimal valorTotal;
    private BigDecimal valorDesconto;
    private BigDecimal valorIcms;
    private Date dataCompra;

    @OneToMany
    private List<Pessoa> pessoa;

    public NotaFiscalCompra() {
    }

    public NotaFiscalCompra(String numeroNota, String serieNota, String descricaoObs, BigDecimal valorTotal,
                            BigDecimal valorDesconto, BigDecimal valorIcms, Date dataCompra, List<Pessoa> pessoa) {
        this.numeroNota = numeroNota;
        this.serieNota = serieNota;
        this.descricaoObs = descricaoObs;
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
        this.valorIcms = valorIcms;
        this.dataCompra = dataCompra;
        this.pessoa = pessoa;
    }


    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getSerieNota() {
        return serieNota;
    }

    public void setSerieNota(String serieNota) {
        this.serieNota = serieNota;
    }

    public String getDescricaoObs() {
        return descricaoObs;
    }

    public void setDescricaoObs(String descricaoObs) {
        this.descricaoObs = descricaoObs;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public List<Pessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa(List<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }
}
