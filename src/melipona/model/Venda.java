package melipona.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;


public class Venda {
    private int idVenda;
    private LocalDate data;
    private Cliente Cliente;
    private float valTotal;
    private Carrinho carrinho;
    private int desconto;
    private float valFinal;
    private Pagamento pagamento;
    private boolean finalizada = false;

    public Venda(int idVenda, LocalDate data, Cliente Cliente) {
        this.idVenda = idVenda;
        this.data = data;
        this.Cliente = Cliente;
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

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public float getValTotal() {
        return valTotal;
    }

    public void setValTotal(float valTotal) {
        this.valTotal = valTotal;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public float getValFinal() {
        return valFinal;
    }

    public void setValFinal(float valFinal) {
        this.valFinal = valFinal;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
    
    public int randomID(){
        Random gerador = new Random();
        int idRandom = -1;
        do{
            idRandom = gerador.nextInt();
        }while(idRandom < 0);
        return idRandom;
    }
}

