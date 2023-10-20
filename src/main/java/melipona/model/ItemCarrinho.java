package melipona.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

//@Entity
public class ItemCarrinho {
    
   // @OneToOne
    private Produto produto;
    
    private int idCarrinho;
    private int quant;
    private double subtotal;

    public ItemCarrinho(Produto produto, int quant) {
        this.produto = produto;
        this.quant = quant;
        this.subtotal = produto.getPreço() * quant;
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal() {
        this.subtotal = produto.getPreço() * quant;
    }

}
