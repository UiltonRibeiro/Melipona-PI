/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melipona.model.bancoDdados;

import java.util.ArrayList;
import java.util.List;
import melipona.model.Funcionario;

/**
 *
 * @author uilto
 */
public class BDDFuncionarios {

    static List<Funcionario> Funcionarios = new ArrayList<>();

    public static List<Funcionario> getFuncionarios() {
        return Funcionarios;
    }

    public static void setFuncionarios(List<Funcionario> Funcionarios) {
        BDDFuncionarios.Funcionarios = Funcionarios;
    }

}
