package com.spring.backendmongo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backendmongo.models.Categoria;
import com.spring.backendmongo.repositories.CategoriaRepository;

@RestController
@RequestMapping(path = "/categoria/")
public class CategoriaControllers {
    @Autowired
    private CategoriaRepository _categoriaMongoRepository;

    @GetMapping(path = "find")
    public Categoria getCategoriaFromMongoDB(@RequestParam(value = "nome") String nome) {
        return _categoriaMongoRepository.findByNome(nome);
    }

    @GetMapping(path = "findall")
    public List<Categoria> getAllCategoriasFromMongoDB() {
        return _categoriaMongoRepository.findAll();
    }

    @PostMapping
    public void insert(@RequestBody Categoria categoria) {
        _categoriaMongoRepository.save(categoria);
    }
}
