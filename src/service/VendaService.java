/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import javax.swing.JOptionPane;
import melipona.model.Venda;
import melipona.model.bancoDdados.BDDVenda;

/**
 *
 * @author uilto
 */
public class VendaService {
    
    public boolean saveVenda(Venda venda){
        try {
            BDDVenda.getVendas().add(venda);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve uma falha ao salvar");
            return false;
        }
    }
    
    public Venda getVenda(int id){
        return BDDVenda.getVendas().get(id);
    }
    
    public List<Venda> AllVendas(){
        return BDDVenda.getVendas();
    }
    
    public boolean DeleteVenda(int id){
        try {
            BDDVenda.getVendas().remove(id);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao deletar");
            return false;
        }
    }
    
    public boolean UpdateVenda(Venda venda){
        try {
            BDDVenda.getVendas().set(venda.getIdVenda(), venda);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao alterar dados");
            return false;
        }
    }
    
}
