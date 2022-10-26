package com.spring.backendmongo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.backendmongo.models.Vendas;

public interface VendasRepository extends MongoRepository<Vendas, String> {
    List<Vendas> findByNome(String nome);

    Optional<Vendas> findById(String id);

}
