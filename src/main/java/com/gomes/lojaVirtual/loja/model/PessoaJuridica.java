package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.Entity;

import java.io.Serializable;

@Entity
public class PessoaJuridica extends Pessoa implements Serializable {
    private String cnpj;
    private String inscicaoEstadual;
    private String inscricaoMunicipal;
    private String nomeFantasia;
    private String razaoSocial;
    private String categoria;

    public PessoaJuridica(Long id, String nome, String email, String telefone, String cnpj, String inscicaoEstadual,
                          String inscricaoMunicipal, String nomeFantasia, String razaoSocial, String categoria) {
        super(id, nome, email, telefone);
        this.cnpj = cnpj;
        this.inscicaoEstadual = inscicaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.categoria = categoria;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscicaoEstadual() {
        return inscicaoEstadual;
    }

    public void setInscicaoEstadual(String inscicaoEstadual) {
        this.inscicaoEstadual = inscicaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
