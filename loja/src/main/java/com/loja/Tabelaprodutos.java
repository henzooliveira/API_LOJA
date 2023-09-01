package com.loja;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class Tabelaprodutos {
    List<Produto> produtos = new ArrayList<>();

    public Tabelaprodutos() {
        Produto caneta = new Produto(1, "Caneta BIC", "canetabic cor azul", 1.99);
        Produto borracha = new Produto(2, "Borracha branca", "borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lapis faber castel", "lapis grafite preto", 2.99);
        Produto caderno = new Produto(4, "Caderno comum", "caderno comum", 24.99);
        Produto lapiseira = new Produto(5, "Lapiseira faber castel", "lapiseira grafite 0.5", 9.99);
        Produto garrafinha = new Produto(6, "garrafinha moleka", "garrafinha rosa 500ml", 20.99);
        Produto estojo = new Produto(7, "estojo ever after high", "estojo 4 aberturas", 20.99);
        Produto mochila = new Produto(8, "mochila monster high", "mochila 5 bolsos", 54.99);
        Produto uniforme = new Produto(9, "Uniforme SESI", "Uniforme SESI", 60.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(caderno);
        this.produtos.add(lapiseira);
        this.produtos.add(garrafinha);
        this.produtos.add(estojo);
        this.produtos.add(mochila);
        this.produtos.add(uniforme);


    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Produto> buscarTodosProdutos() {
        return this.getProdutos();
    }

    public Produto buscarProdutoPeloId(int produtoId) {
        Produto produtoProcurado = null;
        for (Produto p : this.produtos) {
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;

            }

        }
        return produtoProcurado;
    }
    public Produto cadastrasNovoProduto(Produto novoProduto){
        int ultimoIndex = this.produtos.size() -1;
        Produto ultimoProduto = this.produtos.get(ultimoIndex);
        int proximoId = ultimoProduto.getId() +1;
        novoProduto.setId(proximoId);
        this.produtos.add(novoProduto);
        return novoProduto;
    }

    public void atualizarProdutos(int produtosId, Produto produtoAtualizar){
        Produto produtoProcurado = this.buscarProdutoPeloId(produtosId);
        if (produtoProcurado!=null){
            produtoProcurado.setNome(produtoAtualizar.getNome());
            produtoProcurado.setDescricao(produtoAtualizar.getDescricao());
            produtoProcurado.setValorUnitario(produtoAtualizar.getValorUnitario());
        }
    }
    public void removerProduto(Produto produtoRemover){
        this.produtos.remove(produtoRemover);
    }
    public void  removerProduto(int produtoId){
        Produto produtoRemover = this.buscarProdutoPeloId(produtoId);
        this.produtos.remove(produtoRemover);
    }
    }


