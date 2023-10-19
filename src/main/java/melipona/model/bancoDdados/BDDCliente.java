/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melipona.model.bancoDdados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import melipona.model.Cliente;
import melipona.model.Endereco;

/**
 *
 * @author uilto
 */
public class BDDCliente {

    static List<Cliente> Clientes = new ArrayList<>() {
        {
            add(new Cliente(0, "Teste", "123", LocalDate.now(), "123", "123", "Email"));
        }
    };

    public static List<Cliente> getClientes() {
        return Clientes;
    }

    public static void setClientes(List<Cliente> Clientes) {
        BDDCliente.Clientes = Clientes;
    }

}
