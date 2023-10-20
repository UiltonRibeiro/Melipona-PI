package melipona.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import melipona.model.propriedades.PropriedadesCargo;

@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private Double salario;
    @OneToOne
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
