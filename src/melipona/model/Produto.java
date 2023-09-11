package melipona.model;

import java.time.LocalDate;

public class Produto {
    private int idProduto;
    private String nome;
    private double preço;
    private int quantEstoque;
    private LocalDate datavalid;
    private double custo;

    public Produto() {
    }

    public Produto(int idProduto, String nome, double preço, int quantEstoque, double custo) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preço = preço;
        this.quantEstoque = quantEstoque;
        this.custo = custo;
    }

    public Produto(int idProduto, String nome, double preço, int quantEstoque, LocalDate datavalid, double custo) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preço = preço;
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
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
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
