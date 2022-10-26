package com.spring.backendmongo.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categorias")
@TypeAlias(value = "Categoria")
public class Categoria implements Serializable {

    @Id
    private String id;

    private String nome;

    @DBRef(lazy = true)
    private List<Produtos> produtosCategoria = new ArrayList<>();

    public Categoria() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produtos> getProdutosCategoria() {
        return produtosCategoria;

    }

    public void setProdutosCategoria(List<Produtos> produtosCategoria) {
        this.produtosCategoria = produtosCategoria;
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

}
