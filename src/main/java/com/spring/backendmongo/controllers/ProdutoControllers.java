package com.spring.backendmongo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backendmongo.models.Produtos;
import com.spring.backendmongo.models.Vendas;
import com.spring.backendmongo.repositories.ProdutosRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "/api/produtos/")
public class ProdutoControllers {
    @Autowired
    private ProdutosRepository _produtosRepository;

    @GetMapping(path = "produtos-list")
    public List<Produtos> getAllCategoriasFromMongoDB() {
        return _produtosRepository.findAll();
    }

    @PostMapping(path = "save-produto")
    public void insert(@RequestBody Produtos produtos) {
        _produtosRepository.save(produtos);
    }

    @DeleteMapping("delete-produtp/{produto_id}")
    public void deleteVendas(@PathVariable("produto_id") String produto_id) {
        _produtosRepository.deleteById(produto_id);
    }

    @GetMapping(path = "/{vendas_id}")
    public Produtos getProdutos(@PathVariable("produtos_id") String produto_id) {
        Produtos produtos = _produtosRepository.findById(produto_id).orElse(new Produtos());
        return produtos;
    }

    @PostMapping("update-produtos/{produtos_id}")
    public void updateVendas(@RequestBody Produtos produtos, @PathVariable("produto_id") String produto_id) {
        produtos.setId(produto_id);
        _produtosRepository.save(produtos);
    }
}
