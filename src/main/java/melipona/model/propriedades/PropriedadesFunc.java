/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melipona.model.propriedades;

/**
 *
 * @author uilto
 */
public class PropriedadesFunc {

    boolean cadCliente = true;
    boolean cadVenda = true;
    boolean cadCargo = true;
    boolean cadProduto = true;
    boolean cadFuncionario = true;
    boolean concPermissao = true;
    boolean cadForm = true;

    public PropriedadesFunc() {
    }

    public boolean isCadCliente() {
        return cadCliente;
    }

    public void setCadCliente(boolean cadCliente) {
        this.cadCliente = cadCliente;
    }

    public boolean isCadVenda() {
        return cadVenda;
    }

    public void setCadVenda(boolean cadVenda) {
        this.cadVenda = cadVenda;
    }

    public boolean isCadCargo() {
        return cadCargo;
    }

    public void setCadCargo(boolean cadCargo) {
        this.cadCargo = cadCargo;
    }

    public boolean isCadProduto() {
        return cadProduto;
    }

    public void setCadProduto(boolean cadProduto) {
        this.cadProduto = cadProduto;
    }

    public boolean isConcPermissao() {
        return concPermissao;
    }

    public void setConcPermissao(boolean concPermissao) {
        this.concPermissao = concPermissao;
    }

    public boolean isCadFuncionario() {
        return cadFuncionario;
    }

    public void setCadFuncionario(boolean cadFuncionario) {
        this.cadFuncionario = cadFuncionario;
    }

    public boolean isCadForm() {
        return cadForm;
    }

    public void setCadForm(boolean cadForm) {
        this.cadForm = cadForm;
    }

}
