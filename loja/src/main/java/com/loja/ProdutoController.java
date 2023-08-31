package com.loja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loja/podutos")
public class ProdutoController {
    private Tabelaprodutos tabelaprodutos;

    public ProdutoController() {
        this.tabelaprodutos = new Tabelaprodutos();
    }

    @GetMapping
    public List<Produto> buscarTodosOsProdutosDaLoja() {
        return this.tabelaprodutos.buscarTodosProdutos();
    }
}
