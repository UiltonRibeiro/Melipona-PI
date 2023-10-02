/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import javax.swing.JOptionPane;
import melipona.model.FormaPG;
import melipona.model.bancoDdados.BDDFormasPG;

/**
 *
 * @author uilto
 */
public class FormasPGService {

    public FormasPGService() {
    }
    
    public boolean CreateFormPG(FormaPG formapg){
        try {
            BDDFormasPG.getFormasPG().add(formapg);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao cadastrar");
            return false;
        }
    }
    
    public FormaPG getFormaPG(int id){
        return BDDFormasPG.getFormasPG().get(id);
    }
    
    public boolean AlterFormPG(FormaPG formaPG){
        try {
            BDDFormasPG.getFormasPG().set(formaPG.getIdFormaPG(), formaPG);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados");
            return false;
        }
    }
    
    public List<FormaPG> AllForm(){
        return BDDFormasPG.getFormasPG();
    }
    
    public boolean DeleteForm(int id){
        try {
            BDDFormasPG.getFormasPG().remove(id);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar dados");
            return false;
        }
    }
}
