/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melipona.model.bancoDdados;

import java.util.ArrayList;
import java.util.List;
import melipona.model.Carrinho;

/**
 *
 * @author uilto
 */
public class BDDCarinho {

    static List<Carrinho> allCar = new ArrayList<>();

    public static List<Carrinho> getAllCar() {
        return allCar;
    }

    public static void setAllCar(List<Carrinho> allCar) {
        BDDCarinho.allCar = allCar;
    }
}
