package melipona.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduto;
    private String nome;
    private double preco;
    private int quantEstoque;
    private LocalDate datavalid;
    private double custo;

    public Produto() {
    }

    public Produto(int idProduto, String nome, double preço, int quantEstoque, double custo) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preço;
        this.quantEstoque = quantEstoque;
        this.custo = custo;
    }

    public Produto(int idProduto, String nome, double preço, int quantEstoque, LocalDate datavalid, double custo) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preço;
        this.quantEstoque = quantEstoque;
        this.datavalid = datavalid;
        this.custo = custo;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preco;
    }

    public void setPreço(double preço) {
        this.preco = preço;
    }

    public void setPreço(float preço) {
        this.preco = preço;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public LocalDate getDatavalid() {
        return datavalid;
    }

    public void setDatavalid(LocalDate datavalid) {
        this.datavalid = datavalid;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}
