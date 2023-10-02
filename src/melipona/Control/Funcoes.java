/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melipona.Control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import melipona.model.Funcionario;
import melipona.model.bancoDdados.BDDFuncionarios;
import melipona.view.HomePage;

/**
 *
 * @author uilto
 */
public class Funcoes {
    
    
    public LocalDate convertStringDate(String data){
        try {
            data = data.replaceAll("-", "/");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(data,formatter);
            return date;
        } catch (Exception e) {
            System.out.println("Data invalida");
            return null;
        }
    }
    
    public boolean validLogin(String login, String senha){
        boolean valid = false;
        for (Funcionario func : BDDFuncionarios.getFuncionarios()) {
            if(func.getUsuario().equals(login) && func.getSenha().equals(senha)){
                HomePage.setUser(func);
                valid = true;
                break;
            }
        }
        return valid;
    }
}