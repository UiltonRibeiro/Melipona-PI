package melipona.model;

import melipona.model.banco.Estoque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {
    private int idCarrinho;
    private List<ItensCarrinho> itens = new ArrayList<ItensCarrinho>();
    
    Scanner Entrada = new Scanner(System.in);

    public Carrinho() {
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }
    
    public void addItem(int id){
        System.out.println("Informe a quantidade que deseja:");
        int quant = Entrada.nextInt();
        Entrada.nextLine();
        itens.add(new ItensCarrinho(Estoque.getProduto(id,quant),quant));
        itens.get(itens.size() - 1).calcSubTotal();
    }
    
    public void exibirAllItens(){
        System.out.println("id \t nome \t quant \t subtotal");
        for (ItensCarrinho item : itens) {
            System.out.println(item.getProduto().getIdProduto() + "\t" + item.getProduto().getNome() + "\t" + item.getQuant() + "\t" + item.getSubtotal());
        }
    }
    
    public int getIndex(int id){
        int cont = 0;
        for (ItensCarrinho item : itens) {
            if(item.getProduto().getIdProduto() == id){
                return cont;
            }
            cont++;
        }
        return cont;
    }
    
    
}
