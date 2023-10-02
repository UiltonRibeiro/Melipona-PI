/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import javax.swing.JOptionPane;
import melipona.model.Funcionario;
import melipona.model.bancoDdados.BDDFuncionarios;

/**
 *
 * @author uilto
 */
public class FuncionarioService {

    public FuncionarioService() {
    }
    
    public boolean createFunc(Funcionario funcionario){
        try {
            BDDFuncionarios.getFuncionarios().add(funcionario);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao cadastrar");
            return false;
        }
    }
    
    public Funcionario getFuncionario(int id){
        return getFuncionario(id);
    }
    
    public boolean AlterFunci(Funcionario funcionario){
        try {
            BDDFuncionarios.getFuncionarios().set(funcionario.getId(), funcionario);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao alterar dados");
            return false;
        }
    }
    
    public List<Funcionario> AllFuncionario(){
        return BDDFuncionarios.getFuncionarios();
    }
    
    public boolean deleteFunc(int id){
        try {
            BDDFuncionarios.getFuncionarios().remove(id);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao deletar");
            return false;
        }
    }
    
    
}
