package com.spring.backendmongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;
import com.spring.backendmongo.models.Produtos;
import com.spring.backendmongo.models.Vendas;
import com.spring.backendmongo.repositories.ProdutosRepository;
import com.spring.backendmongo.repositories.VendasRepository;

import java.util.ArrayList;

@Component
public class DbSeeder implements CommandLineRunner {
    @Autowired
    private ProdutosRepository _produtosRepository;
    @Autowired
    private VendasRepository _vendasRepository;

    @Override
    public void run(String... strings) throws Exception {
        _produtosRepository.deleteAll();
        _vendasRepository.deleteAll();

        Vendas vendas1 = new Vendas("01", "Enrique", "Lucas");
        Vendas vendas2 = new Vendas("02", "Gabrielly", "Amorim");
        Vendas vendas3 = new Vendas("03", "Ana", "Helloysa");
        _vendasRepository.save(vendas1);
        _vendasRepository.save(vendas2);
        _vendasRepository.save(vendas3);

        Produtos produtos1 = new Produtos("PlayStation 5",
                "Foi anunciado em outubro de 2018 e confirmado em outubro de 2019 como o quinto da série PlayStation e sucessor do PlayStation 4.",
                5325, "", "VideoGame", vendas1);
        Produtos produtos2 = new Produtos("Xbox Series X",
                "A Série X vem com um SSD interno de 1 TB, além de suporte a USB 3.1 ", 3850, "", "", vendas2);
        Produtos produtos3 = new Produtos("Nintendo Switch",
                "O Nintendo Switch é um console de videogame híbrido, o sistema principal contém o tablet", 3276, "",
                "",
                vendas3);
        _produtosRepository.save(produtos1);
        _produtosRepository.save(produtos2);
        _produtosRepository.save(produtos3);

        System.out.println("___________________________________");
        System.out.println("Test MongoDB repository");
        System.out.println("Encontrar vendedor(es) pelo primeiro nome");
        _vendasRepository.findByNome("Enrique").forEach(System.out::println);
        System.out.println("___________________________________");
    }

}
