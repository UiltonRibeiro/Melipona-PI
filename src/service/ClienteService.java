/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import javax.swing.JOptionPane;
import melipona.model.Cliente;
import melipona.model.bancoDdados.BDDCliente;

/**
 *
 * @author uilto
 */
public class ClienteService {

    public ClienteService() {
    }
    
    public boolean cadCliente(Cliente cliente){
        try {
            BDDCliente.getClientes().add(cliente);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao cadastrar");
            return false;
        }
    }
    
    public Cliente getCliente(int id){
        return BDDCliente.getClientes().get(id);
    }
    
    public List<Cliente> AllCliente(){
        return BDDCliente.getClientes();
    }
    
    public boolean AlterCliente(Cliente cliente){
        try {
            BDDCliente.getClientes().set(cliente.getId(), cliente);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao Alterar dados");
            return false;
        }
    }
    
    public boolean DeleteCliente(int id){
        try {
            BDDCliente.getClientes().remove(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
