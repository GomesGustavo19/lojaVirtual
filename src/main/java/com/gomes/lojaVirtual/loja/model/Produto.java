package com.gomes.lojaVirtual.loja.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoUnidade;
    private String nome;
    @Column(length = 500)
    private String descricao;
    @OneToMany
    @JoinColumn(name = "notaItemProduto_id")
    private List<NotaItemProduto> notaItemProduto;
    private Double peso;
    private Double largura;
    private Double altura;
    private Double profundidade;
    private BigDecimal valorVenda;
    private int qtdEstoque;
    private int qtdAlertaEstoque;
    private String linkYoutube;
    private Boolean alertaQtdEstoque;
    private int qtdClique;

    @OneToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaProduto categoriaProduto;

    @OneToOne
    @JoinColumn(name = "marcaProduto_id")
    private MarcaProduto marcaProduto;

    @OneToOne
    @JoinColumn(name = "imagem_id")
    private ImagemProduto imagemProduto;

    @Deprecated
    public Produto() {
    }


    public Produto(Long id, String tipoUnidade, String nome, String descricao, List<NotaItemProduto> notaItemProduto,
                   Double peso, Double largura, Double altura, Double profundidade, BigDecimal valorVenda,
                   int qtdEstoque, int qtdAlertaEstoque, String linkYoutube, Boolean alertaQtdEstoque,
                   int qtdClique, CategoriaProduto categoriaProduto, MarcaProduto marcaProduto,
                   ImagemProduto imagemProduto) {
        this.id = id;
        this.tipoUnidade = tipoUnidade;
        this.nome = nome;
        this.descricao = descricao;
        this.notaItemProduto = notaItemProduto;
        this.peso = peso;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
        this.valorVenda = valorVenda;
        this.qtdEstoque = qtdEstoque;
        this.qtdAlertaEstoque = qtdAlertaEstoque;
        this.linkYoutube = linkYoutube;
        this.alertaQtdEstoque = alertaQtdEstoque;
        this.qtdClique = qtdClique;
        this.categoriaProduto = categoriaProduto;
        this.marcaProduto = marcaProduto;
        this.imagemProduto = imagemProduto;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<NotaItemProduto> getNotaItemProduto() {
        return notaItemProduto;
    }

    public void setNotaItemProduto(List<NotaItemProduto> notaItemProduto) {
        this.notaItemProduto = notaItemProduto;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public int getQtdAlertaEstoque() {
        return qtdAlertaEstoque;
    }

    public void setQtdAlertaEstoque(int qtdAlertaEstoque) {
        this.qtdAlertaEstoque = qtdAlertaEstoque;
    }

    public String getLinkYoutube() {
        return linkYoutube;
    }

    public void setLinkYoutube(String linkYoutube) {
        this.linkYoutube = linkYoutube;
    }

    public Boolean getAlertaQtdEstoque() {
        return alertaQtdEstoque;
    }

    public void setAlertaQtdEstoque(Boolean alertaQtdEstoque) {
        this.alertaQtdEstoque = alertaQtdEstoque;
    }

    public int getQtdClique() {
        return qtdClique;
    }

    public void setQtdClique(int qtdClique) {
        this.qtdClique = qtdClique;
    }

    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public MarcaProduto getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(MarcaProduto marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public ImagemProduto getImagemProduto() {
        return imagemProduto;
    }

    public void setImagemProduto(ImagemProduto imagemProduto) {
        this.imagemProduto = imagemProduto;
    }
}
