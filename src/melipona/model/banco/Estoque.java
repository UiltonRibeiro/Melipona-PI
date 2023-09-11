/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melipona.model.banco;

import java.util.ArrayList;
import java.util.List;
import melipona.model.Produto;

/**
 *
 * @author uilto
 */
public class Estoque {
    public static List<Produto> estoque = new ArrayList<>();

    public static List<Produto> getEstoque() {
        return estoque;
    }

    public static void setEstoque(List<Produto> estoque) {
        Estoque.estoque = estoque;
    }
    
    public static Produto getProduto(int id, int quant){
        estoque.get(id).setQuantEstoque(estoque.get(id).getQuantEstoque() - quant);
        return estoque.get(id);
    }
    
    public static void backProduto(int id, int quant){
        estoque.get(id).setQuantEstoque(estoque.get(id).getQuantEstoque() + quant);
    }
}
