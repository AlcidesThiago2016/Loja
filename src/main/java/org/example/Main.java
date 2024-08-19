package org.example;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(" Chaveiro Seja Forte e Corajoso", "Madeira, cordao, adesivo", 15.90);
        Produto p2 = new Produto(" Terço Máes que Oram pelos Filhos ", "Cordæo, metal, adesivo resinado", 32.900);

        Carrinho c = new Carrinho();
        c.adicionarProduto(p1);
        c.adicionarProduto(p2);
        c.removerProduto(" Chaveiro Seja Forte e Corajoso");

        Venda v = new Venda(c);
        v.totalPreco();

        System.out.println("-----***LOJA JAVA.COM***-----");

    }
}