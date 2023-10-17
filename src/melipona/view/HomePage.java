/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package melipona.view;

import melipona.view.lists.listClient;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import melipona.model.Cargo;
import melipona.view.ViwsCad.CadProduto;
import melipona.view.ViwsCad.CadFuncionario;
import melipona.view.ViwsCad.CadCargo;
import melipona.view.ViwsCad.CadClient;
import melipona.view.ViwsCad.cadVenda;
import melipona.model.Cliente;
import melipona.model.Funcionario;
import melipona.model.ItemCarrinho;
import melipona.model.Venda;
import melipona.view.ViwsCad.cadFormPagamento;
import melipona.view.lists.listCargo;
import service.VendaService;

/**
 *
 * @author uilto
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vlTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        vlLiquido = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        quantV = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadVenda = new javax.swing.JMenu();
        mnVenda = new javax.swing.JMenuItem();
        mnProduto = new javax.swing.JMenuItem();
        CadProduto = new javax.swing.JMenuItem();
        mnFunc = new javax.swing.JMenuItem();
        mnForm = new javax.swing.JMenuItem();
        mnClient = new javax.swing.JMenuItem();
        mnEstoque = new javax.swing.JMenu();
        Estoque = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnConfCargo = new javax.swing.JMenuItem();
        mnConfigFunc = new javax.swing.JMenuItem();
        mnConfigClient = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        tblVenda.setBackground(new java.awt.Color(255, 255, 255));
        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Total", "Data", "Forma Pagamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVenda);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total vendas:");

        vlTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        vlTotal.setForeground(new java.awt.Color(0, 0, 0));
        vlTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vlTotal.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(vlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(vlTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Lucro liquido:");

        vlLiquido.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        vlLiquido.setForeground(new java.awt.Color(0, 0, 0));
        vlLiquido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vlLiquido.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(vlLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel4)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(vlLiquido)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Quantidade de");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("vendas nos ultimos 30 dias");

        quantV.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        quantV.setForeground(new java.awt.Color(0, 0, 0));
        quantV.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel8)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(quantV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quantV)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        cadVenda.setText("Cadastrar");

        mnVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnVenda.setText("Venda");
        mnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVendaActionPerformed(evt);
            }
        });
        cadVenda.add(mnVenda);

        mnProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnProduto.setText("Cargo");
        mnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProdutoActionPerformed(evt);
            }
        });
        cadVenda.add(mnProduto);

        CadProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        CadProduto.setText("Produto");
        CadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadProdutoActionPerformed(evt);
            }
        });
        cadVenda.add(CadProduto);

        mnFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnFunc.setText("Funcionario");
        mnFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFuncActionPerformed(evt);
            }
        });
        cadVenda.add(mnFunc);

        mnForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnForm.setText("Forma Pagamento");
        mnForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFormActionPerformed(evt);
            }
        });
        cadVenda.add(mnForm);

        mnClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnClient.setText("Cliente");
        mnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClientActionPerformed(evt);
            }
        });
        cadVenda.add(mnClient);

        jMenuBar1.add(cadVenda);

        mnEstoque.setText("Estoque");
        mnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEstoqueActionPerformed(evt);
            }
        });

        Estoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Estoque.setText("Produtos");
        Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstoqueActionPerformed(evt);
            }
        });
        mnEstoque.add(Estoque);

        jMenuBar1.add(mnEstoque);

        jMenu4.setText("Configurações");

        mnConfCargo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnConfCargo.setText("Alterar Cargo");
        mnConfCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConfCargoActionPerformed(evt);
            }
        });
        jMenu4.add(mnConfCargo);

        mnConfigFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnConfigFunc.setText("Alterar Funcionario");
        mnConfigFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConfigFuncActionPerformed(evt);
            }
        });
        jMenu4.add(mnConfigFunc);

        mnConfigClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnConfigClient.setText("Alterar Cliente");
        mnConfigClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConfigClientActionPerformed(evt);
            }
        });
        jMenu4.add(mnConfigClient);

        Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu4.add(Sair);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVendaActionPerformed
        // TODO add your handling code here:
        cadVenda CadVenda = new cadVenda(null, true);
        CadVenda.setVisible(true);
        if(service.AllVendas() != null){
            preencherTable(service.AllVendas());
            totalBruto(service.AllVendas());
            totalLiquido(service.AllVendas());
            quantV.setText(toString().valueOf(service.AllVendas().size()));
        }
    }//GEN-LAST:event_mnVendaActionPerformed

    private void mnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProdutoActionPerformed
        // TODO add your handling code here:
        CadCargo cadCargo = new CadCargo();
        cadCargo.setVisible(true);
    }//GEN-LAST:event_mnProdutoActionPerformed

    private void CadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadProdutoActionPerformed
        // TODO add your handling code here:
        CadProduto cadProduto = new CadProduto();
        cadProduto.setVisible(true);
    }//GEN-LAST:event_CadProdutoActionPerformed

    private void mnFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFuncActionPerformed
        // TODO add your handling code here:
        CadFuncionario cadFunc = new CadFuncionario();
        cadFunc.setVisible(true);
    }//GEN-LAST:event_mnFuncActionPerformed

    private void mnFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFormActionPerformed
        // TODO add your handling code here:
        cadFormPagamento cfp = new cadFormPagamento();
        cfp.setVisible(true);
    }//GEN-LAST:event_mnFormActionPerformed

    private void mnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClientActionPerformed
        // TODO add your handling code here:
        CadClient cadCliente = new CadClient();
        cadCliente.setVisible(true);
    }//GEN-LAST:event_mnClientActionPerformed

    private void mnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEstoqueActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnEstoqueActionPerformed

    private void mnConfigFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConfigFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnConfigFuncActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        login login = new login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoqueActionPerformed
        // TODO add your handling code here:
        EstoqueView estoque = new EstoqueView();
        estoque.setVisible(true);
    }//GEN-LAST:event_EstoqueActionPerformed

    private void mnConfigClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConfigClientActionPerformed
        // TODO add your handling code here:
        listClient listaCliente = new listClient(null, true);
        listaCliente.setVisible(true);
        if(listaCliente.getClienteSelecionado() != null){
            Cliente cliente = listaCliente.getClienteSelecionado();
            CadClient cadastro = new CadClient();
            cadastro.setCliente(cliente);
            cadastro.setVisible(true);
        }
        
        
    }//GEN-LAST:event_mnConfigClientActionPerformed

    private void mnConfCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConfCargoActionPerformed
        // TODO add your handling code here:
        listCargo listaCargo = new listCargo(null, true);
        listaCargo.setVisible(true);
        if(listaCargo.getCargoSelecionado() != null){
            CadCargo edit = new CadCargo();
            Cargo cargo = listaCargo.getCargoSelecionado();
            edit.setCargoEdit(cargo);
            edit.preendarDados(cargo);
            edit.setVisible(true);
        }
        
    }//GEN-LAST:event_mnConfCargoActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadProduto;
    private javax.swing.JMenuItem Estoque;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenu cadVenda;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnClient;
    private javax.swing.JMenuItem mnConfCargo;
    private javax.swing.JMenuItem mnConfigClient;
    private javax.swing.JMenuItem mnConfigFunc;
    private javax.swing.JMenu mnEstoque;
    private javax.swing.JMenuItem mnForm;
    private javax.swing.JMenuItem mnFunc;
    private javax.swing.JMenuItem mnProduto;
    private javax.swing.JMenuItem mnVenda;
    private javax.swing.JLabel quantV;
    private javax.swing.JTable tblVenda;
    private javax.swing.JLabel vlLiquido;
    private javax.swing.JLabel vlTotal;
    // End of variables declaration//GEN-END:variables
    private static Funcionario user;
    private VendaService service= new VendaService();

    public static Funcionario getUser() {
        return user;
    }

    public static void setUser(Funcionario user) {
        HomePage.user = user;
    }
    
    private void setOptions(){
        user.getPermisoes();
        
        mnVenda.setVisible(user.getPermisoes().isCadVenda());
        mnVenda.enable(user.getPermisoes().isCadVenda());
        
        mnProduto.setVisible(user.getPermisoes().isCadProduto());
        mnProduto.enable(user.getPermisoes().isCadProduto());
        
        mnClient.setVisible(user.getPermisoes().isCadCliente());
        mnClient.enable(user.getPermisoes().isCadCliente());
        
        mnConfCargo.setVisible(user.getPermisoes().isCadCargo());
        mnConfCargo.enable(user.getPermisoes().isCadCargo());
        
        mnConfigFunc.setVisible(user.getPermisoes().isCadFuncionario());
        mnConfigFunc.enable(user.getPermisoes().isCadFuncionario());
        
        mnConfigClient.setVisible(user.getPermisoes().isCadCliente());
        mnConfigClient.enable(user.getPermisoes().isCadCliente());
        
    }
    
    public void preencherTable(List<Venda> vendas){
        String columns[] = {"Id","Cliente","Total","Data","Forma Pagamento"};
        String dados[][] = new String[vendas.size()][columns.length];
        int i = 0;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        for (Venda venda: vendas) {
            dados[i] = new String[]{
                toString().valueOf(venda.getIdVenda()),
                venda.getCliente().getNome(),
                NumberFormat.getCurrencyInstance().format(venda.getValFinal()),
                formatter.format(venda.getData()),
                venda.getPagamento().getForma()
            };
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados,columns);
        tblVenda.setModel(model);
    }
    
    public void totalBruto(List<Venda> vendas){
        double total = 0;
        for (Venda venda : vendas) {
            total += venda.getValFinal();
        }
        vlTotal.setText(NumberFormat.getCurrencyInstance().format(total));
    }
    
     public void totalLiquido(List<Venda> vendas){
        double custo = 0;
        double total = 0;
        for (Venda venda : vendas) {
            for (ItemCarrinho item: venda.getCarrinho().getItens()) {
                custo += (item.getProduto().getCusto() * item.getQuant()); 
            }
            total += venda.getValFinal();
        }
        vlLiquido.setText(NumberFormat.getCurrencyInstance().format(total - custo));
    }
    
}
