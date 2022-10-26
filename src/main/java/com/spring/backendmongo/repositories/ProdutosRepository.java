package com.spring.backendmongo.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.backendmongo.models.Produtos;

public interface ProdutosRepository extends MongoRepository<Produtos, String> {
    Produtos findByNome(String nome);

    Optional<Produtos> findById(String id);

}
