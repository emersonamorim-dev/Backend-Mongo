package com.spring.backendmongo.models;

import java.lang.annotation.Inherited;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vendas")
@TypeAlias(value = "Vendas")
public class Vendas {
    @Id
    private String id;

    private String vendedorId;

    private String nome;

    private String sobrenome;

    public Vendas() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(String vendedorId) {
        this.vendedorId = vendedorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Vendas(String vendedorId, String nome, String sobrenome) {
        this.vendedorId = vendedorId;
        this.nome = nome;
        this.sobrenome = sobrenome;

    }

    @Override
    public String toString() {
        return "Vendas [id=" + id + ", vendedorId=" + vendedorId + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";

    }

}
