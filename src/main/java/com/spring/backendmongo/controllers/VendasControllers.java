package com.spring.backendmongo.controllers;

import java.util.List;
import java.util.Optional;

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

import com.spring.backendmongo.models.Vendas;
import com.spring.backendmongo.repositories.VendasRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "/api/vendas/")
public class VendasControllers {
    @Autowired
    private VendasRepository _vendasRepository;

    @GetMapping(path = "vendas-list")
    public List<Vendas> getAllCategoriasFromMongoDB() {
        return _vendasRepository.findAll();
    }

    @GetMapping(path = "/{vendas_id}")
    public Vendas getVendas(@PathVariable("vendas_id") String vendas_id) {
        return _vendasRepository.findById(vendas_id).orElse(new Vendas());
    }

    @PostMapping(path = "save-vendas")
    public void insert(@RequestBody Vendas vendas) {
        _vendasRepository.save(vendas);
    }

    @DeleteMapping("delete-vendas/{vendas_id}")
    public void deleteVendas(@PathVariable("vendas_id") String vendas_id) {
        _vendasRepository.deleteById(vendas_id);
    }

    @PostMapping("update-seller/{seller_id}")
    public void updateVendas(@RequestBody Vendas vendas, @PathVariable("vendas_id") String vendas_id) {
        vendas.setId(vendas_id);
        _vendasRepository.save(vendas);
    }
}
