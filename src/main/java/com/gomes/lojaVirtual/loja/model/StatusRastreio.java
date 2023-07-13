package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class StatusRastreio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String centroDestribuicao;
    private String cidade;
    private String estado;
    private String status;

    @ManyToOne
    private VendaCupomLoja vendaCupomLoja;

    @Deprecated
    public StatusRastreio() {
    }

    public StatusRastreio(Long id, String centroDestribuicao, String cidade, String estado, String status,VendaCupomLoja vendaCupomLojaVendaCupomLoja) {
        this.id = id;
        this.centroDestribuicao = centroDestribuicao;
        this.cidade = cidade;
        this.estado = estado;
        this.status = status;
        this.vendaCupomLoja = vendaCupomLojaVendaCupomLoja;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCentroDestribuicao() {
        return centroDestribuicao;
    }

    public void setCentroDestribuicao(String centroDestribuicao) {
        this.centroDestribuicao = centroDestribuicao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VendaCupomLoja getVendaCupomLoja() {
        return vendaCupomLoja;
    }

    public void setVendaCupomLoja(VendaCupomLoja vendaCupomLoja) {
        this.vendaCupomLoja = vendaCupomLoja;
    }
}
