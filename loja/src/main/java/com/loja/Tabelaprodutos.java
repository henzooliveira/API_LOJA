package com.loja;

import java.util.ArrayList;
import java.util.List;

public class Tabelaprodutos {
    List<Produto> produtos = new ArrayList<>();

    public Tabelaprodutos(){
        Produto caneta = new Produto(1, "Caneta BIC", "canetabic cor azul", 1.99);
        Produto borracha = new Produto(2, "Borracha branca", "borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lapis faber castel", "lapis grafite preto", 2.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
    }
}
