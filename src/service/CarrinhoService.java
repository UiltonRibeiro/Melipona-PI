/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import melipona.model.Carrinho;
import melipona.model.ItemCarrinho;
import melipona.model.Produto;

/**
 *
 * @author uilto
 */
public class CarrinhoService {
    
    public Carrinho AddProduto(Carrinho carrinho, ItemCarrinho itens){
        
        if(repeatProduto(carrinho, itens) == true){
            for (ItemCarrinho item : carrinho.getItens()){
            if(item.getProduto() == itens.getProduto()){
                item.setQuant(item.getQuant() + itens.getQuant());
                item.setSubtotal();
                return carrinho;
            }
        }
        }else{
            carrinho.getItens().add(itens);
        }
            return carrinho;
    }
    
    public boolean repeatProduto(Carrinho carrinho, ItemCarrinho itens){
        for (ItemCarrinho item : carrinho.getItens()){
            if(item.getProduto() == itens.getProduto()){
                return true;
            }
        }
        return false;
    }
    
}
