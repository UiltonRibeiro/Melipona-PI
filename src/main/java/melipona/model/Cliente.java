package melipona.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
public class Cliente extends Pessoa {

    private Carrinho carrinho;

    public Cliente(int id, String nome, String CPF, LocalDate dataNasc, String telefone, String celular, String Email) {
        super(id, nome, CPF, dataNasc, telefone, celular, Email);
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

}
