package com.example.demo.Controller;

import com.example.demo.entity.Produto;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    ProductService produtoService;
    ProductRepository produtoRepository;

    public ProdutoController(ProductService produtoService, ProductRepository produtoRepository){
        this.produtoService = produtoService;
        this.produtoRepository = produtoRepository;
    }

    @GetMapping ("/produto/{id}")
    public Produto retornaProdutoPorId(@PathVariable int id) {
        return produtoService.buscarPorId(id);
    }

    @PostMapping("/addproduto")
    public Produto adicionaProduto(@RequestBody Produto produtoTarget){
        return produtoRepository.save(produtoTarget);

    }
}

