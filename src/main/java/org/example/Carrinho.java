package org.example;

import java.util.ArrayList;

public class Carrinho {

    ArrayList<Produto> produtos;

    public Carrinho(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
        System.out.println("Produto"+ produto.getNome()+ " adicionado com sucesso!");
    }

    public String removerProduto(String nome){
        int codigo = -1;
        for (int i = 0; i < this.produtos.size(); i++){
            if(this.produtos.get(i).getNome().equals(nome)){
                codigo = i;
                break;
            }else {
                continue;
            }
        }
        if(codigo == -1){
            return null;
        }else {
            return "O produto "+nome+" foi removido do carrinho!";
        }
    }

}
