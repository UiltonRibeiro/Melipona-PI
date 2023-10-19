/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package melipona.view.ViwsCad;

import javax.swing.JOptionPane;
import melipona.model.Cargo;
import melipona.model.bancoDdados.BDDFuncionarios;
import melipona.model.propriedades.PropriedadesCargo;
import service.CargoService;

/**
 *
 * @author uilto
 */
public class CadCargo extends javax.swing.JFrame {

    /**
     * Creates new form CadCargo
     */
    public CadCargo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbCadFunc = new javax.swing.JCheckBox();
        cbCadCargo = new javax.swing.JCheckBox();
        cbCadVenda = new javax.swing.JCheckBox();
        cbCadFormPg = new javax.swing.JCheckBox();
        cbCadProduto = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbAlterar = new javax.swing.JCheckBox();
        bntSalvar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastrar Cargo");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome:");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));

        txtSalario.setBackground(new java.awt.Color(255, 255, 255));

        lblSalario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSalario.setForeground(new java.awt.Color(0, 0, 0));
        lblSalario.setText("Salario:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbCadFunc.setBackground(new java.awt.Color(255, 255, 255));
        cbCadFunc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbCadFunc.setForeground(new java.awt.Color(0, 0, 0));
        cbCadFunc.setText("Cadastro de Funcionario");

        cbCadCargo.setBackground(new java.awt.Color(255, 255, 255));
        cbCadCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbCadCargo.setForeground(new java.awt.Color(0, 0, 0));
        cbCadCargo.setText("Cadastro de Cargo");
        cbCadCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCadCargoActionPerformed(evt);
            }
        });

        cbCadVenda.setBackground(new java.awt.Color(255, 255, 255));
        cbCadVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbCadVenda.setForeground(new java.awt.Color(0, 0, 0));
        cbCadVenda.setText("Cadastro de Venda");
        cbCadVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCadVendaActionPerformed(evt);
            }
        });

        cbCadFormPg.setBackground(new java.awt.Color(255, 255, 255));
        cbCadFormPg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbCadFormPg.setForeground(new java.awt.Color(0, 0, 0));
        cbCadFormPg.setText("Cadastro Forma de Pagamento");
        cbCadFormPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCadFormPgActionPerformed(evt);
            }
        });

        cbCadProduto.setBackground(new java.awt.Color(255, 255, 255));
        cbCadProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbCadProduto.setForeground(new java.awt.Color(0, 0, 0));
        cbCadProduto.setText("Cadastro de Produto");
        cbCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCadProdutoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Atenção: Selecionar ou remover as permissões ");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("para novos cadastros com o cargo.");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("algumas funções do sistema não estaram mais disponível");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel5)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel6)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jLabel6)
                    .addContainerGap(118, Short.MAX_VALUE)))
        );

        cbAlterar.setBackground(new java.awt.Color(255, 255, 255));
        cbAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbAlterar.setForeground(new java.awt.Color(0, 0, 0));
        cbAlterar.setText("Alterar dados cadastrais");
        cbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCadFunc)
                            .addComponent(cbAlterar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCadCargo)
                            .addComponent(cbCadProduto)
                            .addComponent(cbCadFormPg)
                            .addComponent(cbCadVenda))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cbCadFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCadCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCadVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCadProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCadFormPg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAlterar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bntSalvar.setBackground(new java.awt.Color(0, 0, 0));
        bntSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntSalvar.setForeground(new java.awt.Color(255, 255, 255));
        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        bntCancelar.setBackground(new java.awt.Color(255, 255, 255));
        bntCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bntCancelar.setForeground(new java.awt.Color(0, 0, 0));
        bntCancelar.setText("Cancelar");
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bntCancelar)
                .addGap(18, 18, 18)
                .addComponent(bntSalvar)
                .addGap(141, 141, 141))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSalario)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntSalvar)
                    .addComponent(bntCancelar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbCadCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCadCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCadCargoActionPerformed

    private void cbCadVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCadVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCadVendaActionPerformed

    private void cbCadFormPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCadFormPgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCadFormPgActionPerformed

    private void cbCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCadProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCadProdutoActionPerformed

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        // TODO add your handling code here:
        int id = BDDFuncionarios.getFuncionarios().size();
        if (isEmpty() == false) {
            if (validSalario(txtSalario.getText()) == true) {
                double salario = convertDouble(txtSalario.getText());
                if (salario > 0) {
                    if (CargoEdit == null) {
                        Cargo nvCargo = new Cargo(id, txtNome.getText(), salario);
                        nvCargo = propriedades(nvCargo);
                        boolean success = service.createCargo(nvCargo);
                        if (success == true) {
                            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso");
                        }
                    }
                    CargoEdit.setPriedades(proprie());
                    service.AlterCliente(CargoEdit);
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso");
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_bntSalvarActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void cbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCargo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JCheckBox cbAlterar;
    private javax.swing.JCheckBox cbCadCargo;
    private javax.swing.JCheckBox cbCadFormPg;
    private javax.swing.JCheckBox cbCadFunc;
    private javax.swing.JCheckBox cbCadProduto;
    private javax.swing.JCheckBox cbCadVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
    CargoService service = new CargoService();
    ;
    Cargo CargoEdit;

    public Cargo getCargoEdit() {
        return CargoEdit;
    }

    public void setCargoEdit(Cargo CargoEdit) {
        this.CargoEdit = CargoEdit;
    }

    private boolean validSalario(String salario) {
        salario = salario.replaceAll(",", ".");
        boolean Slentrar = salario.matches("[a-zA-Z].*");
        if (Slentrar == false) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Não utilize letras");
            return false;
        }
    }

    private double convertDouble(String salario) {
        salario = salario.replaceAll(",", ".");
        try {
            double salarioConv = Double.parseDouble(salario);
            return salarioConv;
        } catch (Exception e) {
            return -1;
        }
    }

    private Cargo propriedades(Cargo nvCargo) {
        nvCargo.getPriedades().setCadCargo(cbCadCargo.isSelected());
        nvCargo.getPriedades().setCadFuncionario(cbCadFunc.isSelected());
        nvCargo.getPriedades().setCadProduto(cbCadProduto.isSelected());

        return nvCargo;
    }

    private PropriedadesCargo proprie() {
        PropriedadesCargo propriedades = new PropriedadesCargo();
        propriedades.setCadCargo(cbCadCargo.isSelected());
        propriedades.setCadForm(cbCadFormPg.isSelected());
        propriedades.setCadFuncionario(cbCadFunc.isSelected());
        propriedades.setCadProduto(cbCadProduto.isSelected());
        propriedades.setCadVenda(cbCadVenda.isSelected());
        propriedades.setConcPermissao(cbAlterar.isSelected());
        return propriedades;
    }

    private boolean isEmpty() {
        if (txtNome.getText().isEmpty() == true && txtSalario.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campo");
            return true;
        } else if (txtNome.getText().isEmpty() == true && txtSalario.getText().isEmpty() == false) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de Nome do cargo");
            return true;
        } else if (txtNome.getText().isEmpty() == false && txtSalario.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de Salario do cargo");
            return true;
        } else {
            return false;
        }
    }

    public void preendarDados(Cargo cargo) {
        if (cargo != null) {
            txtNome.setText(cargo.getNome());
            txtSalario.setText(toString().valueOf(cargo.getSalario()));
            cbCadFunc.setSelected(cargo.getPriedades().isCadFuncionario());
            cbCadCargo.setSelected(cargo.getPriedades().isCadCargo());
            cbCadVenda.setSelected(cargo.getPriedades().isCadVenda());
            cbCadProduto.setSelected(cargo.getPriedades().isCadProduto());
            cbCadFormPg.setSelected(cargo.getPriedades().isCadForm());
            cbAlterar.setSelected(cargo.getPriedades().isConcPermissao());
        }
    }
}