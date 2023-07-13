package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Entity
public class UsuarioAcesso implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario_id;

    @Id
    @ManyToOne
    @JoinColumn(name = "acesso_id")
    private Acesso acesso;

    @Deprecated
    public UsuarioAcesso() {
    }

    public UsuarioAcesso(Usuario usuario_id, Acesso acesso) {
        this.usuario_id = usuario_id;
        this.acesso = acesso;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Acesso getAcesso() {
        return acesso;
    }

    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }
}
