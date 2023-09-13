/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package melipona.view.ViwsCad;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import melipona.Control.Funcoes;
import melipona.model.Carrinho;
import melipona.model.Cliente;
import melipona.model.FormaPG;
import melipona.model.Venda;
import melipona.model.banco.BDDCarinho;
import melipona.view.listClient;
import melipona.view.listProduto;

/**
 *
 * @author uilto
 */
public class cadVenda extends javax.swing.JFrame {

    /**
     * Creates new form cadVenda
     */
    public cadVenda() {
        initComponents();
        
        this.carrinho = new Carrinho();
        
        preencherPag(Funcoes.getFormasPG());
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
        lbId = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtClient = new javax.swing.JTextField();
        lblClient = new javax.swing.JLabel();
        bntClient = new javax.swing.JButton();
        BntAlterProd = new javax.swing.JButton();
        bntAddProd = new javax.swing.JButton();
        bntDeletProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        txtDesc = new javax.swing.JTextField();
        lblDesc = new javax.swing.JLabel();
        bntFormPag = new javax.swing.JLabel();
        cbForm = new javax.swing.JComboBox<>();
        txtParcelas = new javax.swing.JTextField();
        lblParc = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        lblNumber = new javax.swing.JLabel();
        bntCancelar = new javax.swing.JButton();
        bntSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastrar Venda");

        lbId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbId.setForeground(new java.awt.Color(0, 0, 0));
        lbId.setText("ID:");

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setForeground(new java.awt.Color(0, 0, 0));

        txtClient.setBackground(new java.awt.Color(255, 255, 255));
        txtClient.setForeground(new java.awt.Color(0, 0, 0));

        lblClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblClient.setForeground(new java.awt.Color(0, 0, 0));
        lblClient.setText("Cliente:");

        bntClient.setBackground(new java.awt.Color(255, 255, 255));
        bntClient.setForeground(new java.awt.Color(0, 0, 0));
        bntClient.setText("Selecionar Cliente");
        bntClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntClientActionPerformed(evt);
            }
        });

        BntAlterProd.setBackground(new java.awt.Color(255, 255, 255));
        BntAlterProd.setForeground(new java.awt.Color(0, 0, 0));
        BntAlterProd.setText("Produto Alterar");
        BntAlterProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntAlterProdActionPerformed(evt);
            }
        });

        bntAddProd.setBackground(new java.awt.Color(255, 255, 255));
        bntAddProd.setForeground(new java.awt.Color(0, 0, 0));
        bntAddProd.setText("Adicionar Produto");
        bntAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddProdActionPerformed(evt);
            }
        });

        bntDeletProd.setBackground(new java.awt.Color(255, 255, 255));
        bntDeletProd.setForeground(new java.awt.Color(0, 0, 0));
        bntDeletProd.setText("Excluir produto");
        bntDeletProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDeletProdActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produto", "Quant", "SubTotal"
            }
        ));
        jScrollPane1.setViewportView(tblProdutos);

        txtDesc.setBackground(new java.awt.Color(255, 255, 255));
        txtDesc.setForeground(new java.awt.Color(0, 0, 0));

        lblDesc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDesc.setForeground(new java.awt.Color(0, 0, 0));
        lblDesc.setText("Desconto(%):");

        bntFormPag.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntFormPag.setForeground(new java.awt.Color(0, 0, 0));
        bntFormPag.setText("Forma de Pagamento:");

        cbForm.setBackground(new java.awt.Color(255, 255, 255));
        cbForm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFormItemStateChanged(evt);
            }
        });

        txtParcelas.setBackground(new java.awt.Color(255, 255, 255));
        txtParcelas.setForeground(new java.awt.Color(0, 0, 0));

        lblParc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblParc.setForeground(new java.awt.Color(0, 0, 0));
        lblParc.setText("Parcelas");

        lblSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSubTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblSubTotal.setText("SubTotal");

        txtSubTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtSubTotal.setForeground(new java.awt.Color(0, 0, 0));

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setForeground(new java.awt.Color(0, 0, 0));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setText("Total:");

        txtCEP.setBackground(new java.awt.Color(255, 255, 255));
        txtCEP.setForeground(new java.awt.Color(0, 0, 0));

        lblCEP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCEP.setForeground(new java.awt.Color(0, 0, 0));
        lblCEP.setText("CEP:");

        txtCidade.setBackground(new java.awt.Color(255, 255, 255));
        txtCidade.setForeground(new java.awt.Color(0, 0, 0));

        lblCidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(0, 0, 0));
        lblCidade.setText("Cidade:");

        cbEstado.setBackground(new java.awt.Color(255, 255, 255));
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(0, 0, 0));
        lblEstado.setText("Estado:");

        txtBairro.setBackground(new java.awt.Color(255, 255, 255));
        txtBairro.setForeground(new java.awt.Color(0, 0, 0));

        lblBairro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(0, 0, 0));
        lblBairro.setText("Bairro:");

        txtRua.setBackground(new java.awt.Color(255, 255, 255));
        txtRua.setForeground(new java.awt.Color(0, 0, 0));

        lblRua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRua.setForeground(new java.awt.Color(0, 0, 0));
        lblRua.setText("Rua:");

        txtNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtNumber.setForeground(new java.awt.Color(0, 0, 0));

        lblNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(0, 0, 0));
        lblNumber.setText("Numero:");

        bntCancelar.setBackground(new java.awt.Color(255, 255, 255));
        bntCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bntCancelar.setForeground(new java.awt.Color(0, 0, 0));
        bntCancelar.setText("Cancelar");
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        bntSalvar.setBackground(new java.awt.Color(0, 0, 0));
        bntSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntSalvar.setForeground(new java.awt.Color(255, 255, 255));
        bntSalvar.setText("Salvar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(bntAddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(BntAlterProd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(bntDeletProd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bntFormPag)
                                    .addComponent(cbForm, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblParc)
                                    .addComponent(txtParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSubTotal)
                                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDesc)
                                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotal)
                                    .addComponent(txtTotal)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbId)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClient)
                                    .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bntClient, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblBairro)
                                                .addGap(198, 198, 198))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtBairro)
                                                .addGap(37, 37, 37)))
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblRua)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtRua))
                                        .addGap(23, 23, 23))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCEP)
                                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCidade)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstado)
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblNumber)
                                            .addGap(23, 23, 23)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bntCancelar)
                                        .addGap(31, 31, 31)
                                        .addComponent(bntSalvar)))))
                        .addGap(307, 307, 307))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bntClient, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntAddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BntAlterProd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntDeletProd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntFormPag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblParc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblSubTotal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblCEP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblCidade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblBairro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblRua)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntCancelar)
                    .addComponent(bntSalvar))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BntAlterProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntAlterProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BntAlterProdActionPerformed

    private void bntAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddProdActionPerformed
        // TODO add your handling code here:
        listProduto listaProduto = new listProduto();
        listaProduto.setVisible(true);
    }//GEN-LAST:event_bntAddProdActionPerformed

    private void bntDeletProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeletProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntDeletProdActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void bntClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntClientActionPerformed
        // TODO add your handling code here:
        this.pullClient.setVisible(true);
        
        if(pullClient.getClienteSelecionado() != null){
            this.clienteSelecionado = this.pullClient.getClienteSelecionado();
            System.out.println("Cliente: " + clienteSelecionado.getNome());
        }
    }//GEN-LAST:event_bntClientActionPerformed

    private void cbFormItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFormItemStateChanged
        // TODO add your handling code here:
        int itemIndex = cbForm.getSelectedIndex();
        txtParcelas.enable(Funcoes.getFormasPG().get(itemIndex).isParcelar());
    }//GEN-LAST:event_cbFormItemStateChanged

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
            java.util.logging.Logger.getLogger(cadVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BntAlterProd;
    private javax.swing.JButton bntAddProd;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntClient;
    private javax.swing.JButton bntDeletProd;
    private javax.swing.JLabel bntFormPag;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblClient;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblParc;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtParcelas;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    
    Venda venda;
    Carrinho carrinho;
    Cliente clienteSelecionado;
    listClient pullClient = new listClient(null, true);
    
    public boolean verifCarrinho(Cliente cliente){
        if(cliente.getCarrinho() == null){
            cliente.setCarrinho(carrinho);
            return true;
        }else{
            this.carrinho = cliente.getCarrinho();
            return false;
        }
    }
    
    public void preencherPag(List<FormaPG> formas){
        for (FormaPG forma : formas) {
            cbForm.addItem(forma.getForma());
        }
    }
}
