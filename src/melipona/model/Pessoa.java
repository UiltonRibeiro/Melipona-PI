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
    private Endereco endereco;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
