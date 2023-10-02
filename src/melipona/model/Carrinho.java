package melipona.model;

import melipona.model.bancoDdados.Estoque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {
    private int idCarrinho;
    private List<ItemCarrinho> itens = new ArrayList<ItemCarrinho>();
    
    Scanner Entrada = new Scanner(System.in);

    public Carrinho() {
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(List<ItemCarrinho> itens) {
        this.itens = itens;
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }
    
}
