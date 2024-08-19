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

    public void removerProduto(String nome){
        int codigo = -1;
        for (int i = 0; i < this.produtos.size(); i++){
            if(this.produtos.get(i).getNome().equals(nome)){
                codigo = i;
                produtos.remove(codigo);
                break;
            }else {
                continue;
            }
        }
        if(codigo == -1){
            System.out.println("O produto não foi encontrado!");
        }else {
            System.out.println("O produto " + nome + " removido com sucesso!");
        }
    }

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }

}
