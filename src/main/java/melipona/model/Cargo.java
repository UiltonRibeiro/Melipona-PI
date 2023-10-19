package melipona.model;

import melipona.model.propriedades.PropriedadesCargo;

public class Cargo {

    private int id;
    private String nome;
    private Double salario;
    private PropriedadesCargo priedades = new PropriedadesCargo();

    ;

    public Cargo(int id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public PropriedadesCargo getPriedades() {
        return priedades;
    }

    public void setPriedades(PropriedadesCargo priedades) {
        this.priedades = priedades;
    }

}
