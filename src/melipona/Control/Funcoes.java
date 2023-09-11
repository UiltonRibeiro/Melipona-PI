/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melipona.Control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import melipona.model.Funcionario;
import melipona.model.Cargo;
import melipona.model.Cliente;
import melipona.model.FormaPG;
import melipona.model.Venda;
import melipona.view.HomePage;

/**
 *
 * @author uilto
 */
public class Funcoes {
    static List<Venda> Vendas = new ArrayList<>();
    static List<Cliente> Clientes = new ArrayList<>();
    static List<Funcionario> Funcionarios = new ArrayList<>();
    static List<Cargo> Cargos = new ArrayList<>();
    static List<FormaPG> formasPG = new ArrayList<>();

    public static List<Venda> getVendas() {
        return Vendas;
    }

    public static List<FormaPG> getFormasPG() {
        return formasPG;
    }

    public static List<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(List<Cliente> Clientes) {
        this.Clientes = Clientes;
    }

    public static List<Funcionario> getFuncionarios() {
        return Funcionarios;
    }

    public static void setFuncionarios(List<Funcionario> Funcionarios) {
        Funcoes.Funcionarios = Funcionarios;
    }

    public static List<Cargo> getCargos() {
        return Cargos;
    }

    public static void setCargos(List<Cargo> Cargos) {
        Funcoes.Cargos = Cargos;
    }
    
    public Cargo getCargo(int id){
        return Cargos.get(id);
    }
    
    
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
    
    
    public void exibirAllClientes(){
        for (Cliente cliente : Clientes) {
            System.out.println(cliente.getId() + " - " + cliente.getNome());
        }
    }
    
    public Cliente getCliente(int id){
        return Clientes.get(id);
    }
    
    public void exibirAllVendas(){
        for (Venda venda : Vendas) {
        }
    }
    
    public void exibirAllCargos(){
        for (Cargo cargo : Cargos) {
            System.out.println(cargo.getId() + " - " + cargo.getNome());
        }
    }
    
    public void exibirAllFuncionarios(){
        for (Funcionario func : Funcionarios) {
            System.out.println(func.getId() + " - " + func.getNome());
        }
    }
    
    
    public boolean validLogin(String login, String senha){
        boolean valid = false;
        for (Funcionario func : Funcionarios) {
            if(func.getUsuario().equals(login) && func.getSenha().equals(senha)){
                HomePage.setUser(func);
                valid = true;
                break;
            }
        }
        return valid;
    }
}