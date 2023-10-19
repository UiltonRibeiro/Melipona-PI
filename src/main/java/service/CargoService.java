/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import javax.swing.JOptionPane;
import melipona.model.Cargo;
import melipona.model.bancoDdados.BDDCargos;

/**
 *
 * @author uilto
 */
public class CargoService {

    public CargoService() {
    }

    public boolean createCargo(Cargo cargo) {
        try {
            BDDCargos.getCargos().add(cargo);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao cadastrar");
            return false;
        }
    }

    public Cargo getCliente(int id) {
        return BDDCargos.getCargos().get(id);
    }

    public boolean AlterCliente(Cargo cargo) {
        try {
            BDDCargos.getCargos().set(cargo.getId(), cargo);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao alterar dados");
            return false;
        }
    }

    public List<Cargo> AllCargos() {
        return BDDCargos.getCargos();
    }

    public boolean DeleteCargo(int id) {
        try {
            BDDCargos.getCargos().remove(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
