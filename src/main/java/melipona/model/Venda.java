package melipona.model;

import java.time.LocalDate;

public class Venda {

    private int idVenda;
    private LocalDate data;
    private Cliente Cliente;
    private double valTotal;
    private Carrinho carrinho;
    private int desconto;
    private double valFinal;
    private FormaPG pagamento;
    private Endereco endereco;

    public Venda(int idVenda, LocalDate data, Cliente cliente, Carrinho carrinho) {
        this.idVenda = idVenda;
        this.data = data;
        this.Cliente = cliente;
        this.carrinho = carrinho;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public double getValTotal() {
        return valTotal;
    }

    public void setValTotal(double valTotal) {
        this.valTotal = valTotal;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public double getValFinal() {
        return valFinal;
    }

    public void setValFinal(double valFinal) {
        this.valFinal = valFinal;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public FormaPG getPagamento() {
        return pagamento;
    }

    public void setPagamento(FormaPG pagamento) {
        this.pagamento = pagamento;
    }

}
