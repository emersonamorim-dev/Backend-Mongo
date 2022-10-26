package com.spring.backendmongo.models;

import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

@Document(collection = "produtos")
@TypeAlias("Produto")
public class Produtos {
    @Id
    private String id;

    private String nome;

    private String descricao;

    private float preco;

    private String imagem_URL;

    private String categoria;

    @DBRef
    private Vendas vendas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getImagem_URL() {
        return imagem_URL;
    }

    public void setImagem_URL(String imagem_URL) {
        this.imagem_URL = imagem_URL;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Vendas getVendas() {
        return vendas;
    }

    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    public Produtos(String nome, String descricao, float preco, String imagem_URL, String categoria, Vendas vendas) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem_URL = imagem_URL;
        this.categoria = categoria;
        this.vendas = vendas;
    }

    public Produtos() {
    }

}
