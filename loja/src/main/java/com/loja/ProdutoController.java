package com.loja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loja/produtos")
public class ProdutoController {
    private Tabelaprodutos tabelaprodutos;

    public ProdutoController() {
        this.tabelaprodutos = new Tabelaprodutos();
    }

    @GetMapping
    public List<Produto> buscarTodosOsProdutosDaLoja() {
        return this.tabelaprodutos.buscarTodosProdutos();
    }
    @GetMapping("/{produtoId}")
    public Produto buscarProdutoPeloIdNaLoja(@PathVariable int produtoId){
        Produto produtoProcurado = this.tabelaprodutos.buscarProdutoPeloId(produtoId);
        return produtoProcurado;
    }

    @PostMapping
    public Produto cadastrarprodutonaloja(@RequestBody Produto dadosNovoProduto){
        return this.tabelaprodutos.cadastrasNovoProduto((dadosNovoProduto));
    }

    @PutMapping("/{produtoId}")
    public void atualizarProdutoNaLoja(@PathVariable int produtoId, @RequestBody Produto dadosAtualizarProduto){
        this.tabelaprodutos.atualizarProdutos(produtoId, dadosAtualizarProduto);

    }
}
