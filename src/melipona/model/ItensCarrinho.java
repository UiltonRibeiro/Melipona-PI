package melipona.model;

public class ItensCarrinho {
    private Produto produto;
    private int quant;
    private double subtotal;

    public ItensCarrinho(Produto produto, int quant) {
        this.produto = produto;
        this.quant = quant;
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

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    public void calcSubTotal(){
        subtotal = produto.getPreço() * quant;
    }
}
