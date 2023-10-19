/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import javax.swing.JOptionPane;
import melipona.model.Carrinho;
import melipona.model.ItemCarrinho;

/**
 *
 * @author uilto
 */
public class CarrinhoService {
    EstoqueService estoqueService = new EstoqueService();
    
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
    
    public Carrinho Alterar(Carrinho carrinho, ItemCarrinho item, int id){
        for (int i = 0; i < carrinho.getItens().size(); i++) {
            if(carrinho.getItens().get(i).getProduto() == item.getProduto()){
                //estoqueService.devolverProduto(item.getProduto().getIdProduto(), carrinho.getItens().get(i).getQuant());
                carrinho.getItens().set(id, item);
            }
        }
        return carrinho;
    }
    
    public Carrinho remover(Carrinho carrinho,int indexItem ,int idProduto, int quant){
            carrinho.getItens().remove(indexItem);
            estoqueService.devolverProduto(idProduto, quant);
            return carrinho;
    }
}

