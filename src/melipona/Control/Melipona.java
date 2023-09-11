package melipona.Control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import melipona.model.Cargo;
import melipona.model.Funcionario;
import melipona.model.propriedades.PropriedadesCargo;
import melipona.view.login;

public class Melipona {

    public static void main(String[] args) {
        
        Scanner Entrada = new Scanner(System.in);
        
        PropriedadesCargo propriedade = new PropriedadesCargo();
        
        Funcoes.Cargos.add(new Cargo(0,"Admin",1300.00));
        Funcoes.Cargos.get(0).setPriedades(propriedade);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("03/05/2003",formatter);
        
        Funcoes.Funcionarios.add(
                new Funcionario(
                        0,"admin","admin","123654",Funcoes.Cargos.get(0),
                        date,"1223","1234","admin","123","admin"
                ));
        
        Funcoes.Funcionarios.get(0).importPripriodadesCargo();
        Funcoes func = new Funcoes();
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                login login = new login();
                login.setVisible(true);
            }
        });
       
    }
    
}// fim do programa
