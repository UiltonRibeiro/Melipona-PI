/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import jakarta.persistence.EntityManager;
import javax.swing.JOptionPane;
import melipona.Control.JPAUtil;
import melipona.model.Produto;
import melipona.model.bancoDdados.Estoque;

/**
 *
 * @author Uilton
 */
public class EstoqueService {

    public boolean CreateProduto(Produto produto) {
         EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
            
            //Estoque.estoque.add(produto);
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
            return false;
        }finally{
            JPAUtil.closeEntityManager();
        }
    }

    public boolean alterQuant(int id, int quant) {
        try {
            Estoque.estoque.get(id).setQuantEstoque(quant);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar");
            return false;
        }
    }

    public Produto getProduto(int id) {
        return Estoque.estoque.get(id);
    }

    public boolean alterarProduto(Produto produto) {
        try {
            Estoque.estoque.set(produto.getIdProduto(), produto);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "falha ao alterar");
            return false;
        }
    }

    public boolean removerProduto(int id) {
        try {
            Estoque.estoque.remove(id);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao remover");
            return false;
        }
    }

    public void devolverProduto(int id, int quant) {
        Estoque.estoque.get(id).setQuantEstoque(Estoque.estoque.get(id).getQuantEstoque() + quant);
    }

    public void pushProduto(int id, int quant) {
        Estoque.estoque.get(id).setQuantEstoque(Estoque.estoque.get(id).getQuantEstoque() - quant);
    }
}
