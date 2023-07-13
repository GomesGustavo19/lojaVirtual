package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class ContaReceber implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Enum status;
    private Date dataVencimento;
    private Date dataPagamento;
    private BigDecimal valorTotal;
    private BigDecimal valorDesconto;

    @ManyToOne
    private Pessoa pessoa;

    @Deprecated
    public ContaReceber() {
    }

    public ContaReceber(Long id, String descricao, Enum status, Date dataVencimento, Date dataPagamento,
                        BigDecimal valorTotal, BigDecimal valorDesconto, Pessoa pessoa) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
        this.pessoa = pessoa;
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

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
