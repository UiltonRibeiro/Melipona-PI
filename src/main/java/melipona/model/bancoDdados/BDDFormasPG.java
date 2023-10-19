/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melipona.model.bancoDdados;

import java.util.ArrayList;
import java.util.List;
import melipona.model.FormaPG;

/**
 *
 * @author uilto
 */
public class BDDFormasPG {

    static List<FormaPG> formasPG = new ArrayList<>() {
        {
            add(new FormaPG(0, "Debito[Master]", false, 0, 0, false));
            add(new FormaPG(1, "Credito[Juros:2%]", true, 12, 2, true));
            add(new FormaPG(2, "Dinheiro", false, 0, 0, false));
            add(new FormaPG(3, "Pix", false, 0, 0, false));
        }
    };

    public static List<FormaPG> getFormasPG() {
        return formasPG;
    }

    public static void setFormasPG(List<FormaPG> formasPG) {
        BDDFormasPG.formasPG = formasPG;
    }

}
