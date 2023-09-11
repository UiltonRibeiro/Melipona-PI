package melipona.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String CPF;
    private LocalDate dataNasc;
    private String telefone;
    private String celular;
    private String Email;
    private List<Endereco> enderecos = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String CPF, LocalDate dataNasc, String telefone, String celular, String Email) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.celular = celular;
        this.Email = Email;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
    Scanner Entrada = new Scanner(System.in);

   public void newEndereco(){
       
       System.out.println("Informe o CEP:");
       String CEP = Entrada.nextLine();
       
       System.out.println("Informe o Estado:");
       String estado = Entrada.nextLine();
       
       System.out.println("Informe a cidade:");
       String cidade = Entrada.nextLine();
       
       System.out.println("Informe o bairro:");
       String bairro = Entrada.nextLine();
       
       System.out.println("Informe o nome da rua:");
       String nomeRua = Entrada.nextLine();
       
       System.out.println("Informe o numero da residencia");
       int numero = Entrada.nextInt();
       
       System.out.println("Complemento:");
       String complemento = Entrada.nextLine();
       
       Endereco nvEndereco = new Endereco(0, CEP, cidade, estado,  bairro, nomeRua, numero, complemento, id);
       enderecos.add(nvEndereco);
   }
    
    
}
