package melipona.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Pessoa {
    private ArrayList<Venda> compras = new ArrayList<Venda>();

    public Cliente(int id, String nome, String CPF, LocalDate dataNasc, String telefone, String celular, String Email) {
        super(id, nome, CPF, dataNasc, telefone, celular, Email);
    }
    

    public ArrayList<Venda> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Venda> compras) {
        this.compras = compras;
    }
}
