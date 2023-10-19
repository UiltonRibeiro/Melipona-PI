/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melipona.model.bancoDdados;

import java.util.ArrayList;
import java.util.List;
import melipona.model.Cargo;

/**
 *
 * @author uilto
 */
public class BDDCargos {

    static List<Cargo> Cargos = new ArrayList<>();

    public static List<Cargo> getCargos() {
        return Cargos;
    }

    public static void setCargos(List<Cargo> Cargos) {
        BDDCargos.Cargos = Cargos;
    }

}
