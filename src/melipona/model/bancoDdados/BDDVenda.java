/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melipona.model.bancoDdados;

import java.util.ArrayList;
import java.util.List;
import melipona.model.Venda;

/**
 *
 * @author uilto
 */
public class BDDVenda {
    static List<Venda> Vendas = new ArrayList<>();

    public static List<Venda> getVendas() {
        return Vendas;
    }

    public static void setVendas(List<Venda> Vendas) {
        BDDVenda.Vendas = Vendas;
    }
    
    
    
}
