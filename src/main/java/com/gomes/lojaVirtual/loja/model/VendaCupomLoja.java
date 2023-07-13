package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class VendaCupomLoja implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Pessoa pessoa;
    @ManyToOne
    private Endereco enderecoEntrega;
    @ManyToOne
    private Endereco enderecoCobranca;

    private BigDecimal valorTotal;
    private BigDecimal valorDesconto;
    @ManyToOne
    private FormaPagamento formaPagamento;
    @OneToOne
    private NotaFiscalVenda notaFiscalVenda;
    @ManyToOne
    private CupomDesconto cupomDesconto;
    private BigDecimal valorFrete;
    private int diasEntrega;
    private Date dataVenda;
    private Date dataEntrega;

    @Deprecated
    public VendaCupomLoja() {
    }

    public VendaCupomLoja(Long id, Pessoa pessoa, Endereco enderecoEntrega, Endereco enderecoCobranca,
                          BigDecimal valorTotal, BigDecimal valorDesconto, FormaPagamento formaPagamento,
                          NotaFiscalVenda notaFiscalVenda, CupomDesconto cupomDesconto, BigDecimal valorFrete,
                          int diasEntrega, Date dataVenda, Date dataEntrega) {
        this.id = id;
        this.pessoa = pessoa;
        this.enderecoEntrega = enderecoEntrega;
        this.enderecoCobranca = enderecoCobranca;
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
        this.formaPagamento = formaPagamento;
        this.notaFiscalVenda = notaFiscalVenda;
        this.cupomDesconto = cupomDesconto;
        this.valorFrete = valorFrete;
        this.diasEntrega = diasEntrega;
        this.dataVenda = dataVenda;
        this.dataEntrega = dataEntrega;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public Endereco getEnderecoCobranca() {
        return enderecoCobranca;
    }

    public void setEnderecoCobranca(Endereco enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca;
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

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public NotaFiscalVenda getNotaFiscaVenda() {
        return notaFiscalVenda;
    }

    public void setNotaFiscaVenda(NotaFiscalVenda notaFiscalVenda) {
        this.notaFiscalVenda = notaFiscalVenda;
    }

    public CupomDesconto getCupomDesconto() {
        return cupomDesconto;
    }

    public void setCupomDesconto(CupomDesconto cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
    }

    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }

    public int getDiasEntrega() {
        return diasEntrega;
    }

    public void setDiasEntrega(int diasEntrega) {
        this.diasEntrega = diasEntrega;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
