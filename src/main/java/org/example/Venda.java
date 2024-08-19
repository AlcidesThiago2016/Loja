package org.example;

import java.util.ArrayList;

public class Venda {
    Carrinho c;

    public Venda(Carrinho c) {
        this.c = c;
    }

    public void totalPreco(){
        ArrayList<Produto> P = c.getProdutos();
        double total = 0;

        for (Produto p : P) {
            total += p.getPreco();
        }
        System.out.println("O total da compra foi: "+total);
    }
}
