/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioEstoque;

import java.util.ArrayList;

/**
 *
 * @author LIUJIARTHURKINOSHITA
 */
public class Estoque {
ArrayList<Produto> estoque = new ArrayList<>();
    
    public void adicionarProdutos(String nome, int quantidade) {
        if (nome == "" || quantidade <= 0 ) {
            throw new IllegalArgumentException("Digite o nome do produto e a quantidade acima de 0");
        }
        
        for(Produto produto:estoque) {
            if(produto.getNome().equals(nome)){
                System.out.println("Produto já existe, adicionando " + quantidade);
                produto.quantidade += quantidade;
                return;
               
            }
        }
       
            estoque.add(new Produto(nome, quantidade));
        
    }
    
    public void removerProdutos(String nome, int quantidade) {
        for(Produto produto:estoque) {
            if(produto.getNome().equals(nome)){
                produto.quantidade -= quantidade;
                System.out.println("Há "+ quantidade + " " + nome);
                if(produto.quantidade == 0){
                    estoque.remove(produto);
                    System.out.println("O produto nao existe!");
                }
               
            }
        }
    }
    
    public void consultarQuantidade(String nome) {
        for(Produto produto: estoque){
            if(nome == produto.nome){
            System.out.println(produto.nome + " | "+ produto.quantidade);
        }
        }
    }
        
    public void produtoMaisEstocado() {
        int maior = 0;
        for(Produto produto:estoque) {
           if(produto.quantidade > maior){
               maior = produto.quantidade;
           }
           
        }
        for(Produto produto:estoque) {
           if(maior == produto.quantidade){
               System.out.println("O produto mais estocado é " + produto.nome);
           }
        }
        
        }
    
    
    public void limparEstoque() {
        for(Produto produto: estoque){
            produto.quantidade = 0;
            produto.nome = "";
        }
        System.out.println("Estoque foi esvaziado!");
    }
   }
   

