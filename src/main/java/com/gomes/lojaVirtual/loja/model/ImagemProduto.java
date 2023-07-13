package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.w3c.dom.Text;

@Entity
public class ImagemProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imagemOriginal;
    private String imagemMiniatura;

    @Deprecated
    public ImagemProduto() {
    }

    public ImagemProduto(Long id, String imagemOriginal, String imagemMiniatura) {
        this.id = id;
        this.imagemOriginal = imagemOriginal;
        this.imagemMiniatura = imagemMiniatura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagemOriginal() {
        return imagemOriginal;
    }

    public void setImagemOriginal(String imagemOriginal) {
        this.imagemOriginal = imagemOriginal;
    }

    public String getImagemMiniatura() {
        return imagemMiniatura;
    }

    public void setImagemMiniatura(String imagemMiniatura) {
        this.imagemMiniatura = imagemMiniatura;
    }
}
