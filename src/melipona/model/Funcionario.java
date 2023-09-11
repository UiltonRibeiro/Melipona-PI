package melipona.model;

import java.time.LocalDate;
import java.util.Scanner;
import melipona.model.propriedades.PropriedadesFunc;

public class Funcionario extends Pessoa {
    private String PIS;
    private Cargo cargo;
    private String usuario;
    private String senha;
    private PropriedadesFunc permisoes;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String CPF,  String PIS, Cargo cargo, LocalDate dataNasc, String telefone, String celular, String Email, String senha,String usuario) {
        super(id, nome, CPF, dataNasc, telefone, celular, Email);
        this.PIS = PIS;
        this.cargo = cargo;
        this.senha = senha;
        this.usuario = usuario;
    }

    public String getPIS() {
        return PIS;
    }

    public void setPIS(String PIS) {
        this.PIS = PIS;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public PropriedadesFunc getPermisoes() {
        return permisoes;
    }

    public void setPermisoes(PropriedadesFunc permisoes) {
        this.permisoes = permisoes;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    Scanner Entrada = new Scanner(System.in);
    
    public void importPripriodadesCargo(){
        permisoes = new PropriedadesFunc(); 
        permisoes.setCadCargo(cargo.getPriedades().isCadCargo());
        permisoes.setCadCliente(cargo.getPriedades().isCadCliente());
        permisoes.setCadFuncionario(cargo.getPriedades().isCadFuncionario());
        permisoes.setCadProduto(cargo.getPriedades().isCadProduto());
        permisoes.setCadVenda(cargo.getPriedades().isCadVenda());
        permisoes.setConcPermissao(cargo.getPriedades().isConcPermissao());
        permisoes.setRelatorioEntrada(cargo.getPriedades().isRelatorioEntrada());
        permisoes.setRelatorioVenda(cargo.getPriedades().isRelatorioVenda());
    }
    
   
}
