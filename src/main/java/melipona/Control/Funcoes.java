/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melipona.Control;

import melipona.model.Funcionario;
import melipona.model.bancoDdados.BDDFuncionarios;
import melipona.view.HomePage;

/**
 *
 * @author uilto
 */
public class Funcoes {

    public boolean validLogin(String login, String senha) {
        boolean valid = false;
        for (Funcionario func : BDDFuncionarios.getFuncionarios()) {
            if (func.getUsuario().equals(login) && func.getSenha().equals(senha)) {
                HomePage.setUser(func);
                valid = true;
                break;
            }
        }
        return valid;
    }
}
