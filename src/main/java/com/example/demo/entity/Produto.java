package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "testproduct")
public class Produto {

    private static final long serialVersionUID =1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String descricao;
    private Double preco;
    private String imgUrl;

    public Produto(Integer id, String name, String descricao, Double preco, String imgUrl) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.preco = preco;
        this.imgUrl = imgUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double Preco) {
        this.preco = preco;
    }

    public String getImgUrl() {return imgUrl;}

    public void setImgUrl(String ImgUrl) {this.imgUrl = imgUrl;}

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco='" + preco + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
