package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Date;
@Entity
public class PessoaFisica extends Pessoa implements Serializable {

    private String cpf;
    private Date dataNascimento;

    public PessoaFisica(Long id, String nome, String email, String telefone, String cpf, Date dataNascimento) {
        super(id, nome, email, telefone);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
