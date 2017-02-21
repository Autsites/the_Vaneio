
package GUI;

import java.awt.event.KeyEvent;
import javax.swing.JInternalFrame;
import GUI.ClienteForm;

public class EnderecoForm extends JInternalFrame {

    
    public EnderecoForm() {
        initComponents();
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        btnNovo1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        edtID = new javax.swing.JTextField();
        edtCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edtEndereco = new javax.swing.JTextField();
        cbbCidade = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        edtData = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbbBairro = new javax.swing.JComboBox<>();
        cbxStatus = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        edtReferencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtComplemento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        edtObs = new javax.swing.JTextArea();
        btnBusscar = new javax.swing.JButton();
        btnRemoverFiltro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(true);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("GUI/Bundle"); // NOI18N
        setTitle(bundle.getString("EnderecoForm.title")); // NOI18N
        setName("frmEnderecos"); // NOI18N

        btnSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/finalizar-1.png"))); // NOI18N
        btnSair1.setToolTipText(bundle.getString("EnderecoForm.btnSair1.toolTipText")); // NOI18N
        btnSair1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair1.setName("btnSair1"); // NOI18N
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cancel-1.png"))); // NOI18N
        btnCancelar1.setToolTipText(bundle.getString("EnderecoForm.btnCancelar1.toolTipText")); // NOI18N
        btnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar1.setDisabledIcon(null);
        btnCancelar1.setEnabled(false);
        btnCancelar1.setName("btnCancelar1"); // NOI18N
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/salvar.png"))); // NOI18N
        btnSalvar1.setToolTipText(bundle.getString("EnderecoForm.btnSalvar1.toolTipText")); // NOI18N
        btnSalvar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar1.setDisabledIcon(null);
        btnSalvar1.setEnabled(false);
        btnSalvar1.setName("btnSalvar1"); // NOI18N
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        btnNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cadastro-banco2.png"))); // NOI18N
        btnNovo1.setToolTipText(bundle.getString("EnderecoForm.btnNovo1.toolTipText")); // NOI18N
        btnNovo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo1.setName("btnNovo1"); // NOI18N
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        jSeparator3.setName("jSeparator3"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel10.setText(bundle.getString("EnderecoForm.jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        edtID.setEditable(false);
        edtID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edtID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtID.setName("edtID"); // NOI18N
        edtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtIDFocusGained(evt);
            }
        });
        edtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtIDKeyPressed(evt);
            }
        });

        edtCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtCliente.setName("edtCliente"); // NOI18N
        edtCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtClienteFocusGained(evt);
            }
        });
        edtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edtClienteMouseClicked(evt);
            }
        });
        edtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtClienteKeyPressed(evt);
            }
        });

        jLabel4.setText(bundle.getString("EnderecoForm.jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel3.setText(bundle.getString("EnderecoForm.jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        edtEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtEndereco.setName("edtEndereco"); // NOI18N
        edtEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtEnderecoFocusGained(evt);
            }
        });
        edtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtEnderecoKeyPressed(evt);
            }
        });

        cbbCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbbCidade.setName("cbbCidade"); // NOI18N
        cbbCidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbCidadeItemStateChanged(evt);
            }
        });
        cbbCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbbCidadeFocusGained(evt);
            }
        });
        cbbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCidadeActionPerformed(evt);
            }
        });
        cbbCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbbCidadeKeyPressed(evt);
            }
        });

        jLabel8.setText(bundle.getString("EnderecoForm.jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel14.setText(bundle.getString("EnderecoForm.jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        edtData.setEditable(false);
        edtData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtData.setName("edtData"); // NOI18N
        edtData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtDataFocusGained(evt);
            }
        });
        edtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtDataKeyPressed(evt);
            }
        });

        jLabel9.setText(bundle.getString("EnderecoForm.jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        cbbBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbbBairro.setName("cbbBairro"); // NOI18N
        cbbBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbbBairroFocusGained(evt);
            }
        });
        cbbBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbbBairroKeyPressed(evt);
            }
        });

        cbxStatus.setSelected(true);
        cbxStatus.setText(bundle.getString("EnderecoForm.cbxStatus.text")); // NOI18N
        cbxStatus.setName("cbxStatus"); // NOI18N

        jLabel1.setText(bundle.getString("EnderecoForm.jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        edtReferencia.setText(bundle.getString("EnderecoForm.edtReferencia.text")); // NOI18N
        edtReferencia.setToolTipText("<html>\nReferência:<br>\nUtilize essa seção para criar um alias(Referência) ao endereço que está sendo cadastrado.<br>\nLembrando que não é possível duplicar o alias para esse ou qualquer outro registro.<br>\nExemplos de como utilizar essa secção: Residência do Fulano, Tio do Ciclano, Comercio/Residência Beltrano.\n</html>");
        edtReferencia.setName("edtReferencia"); // NOI18N

        jLabel2.setText(bundle.getString("EnderecoForm.jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        edtComplemento.setText(bundle.getString("EnderecoForm.edtComplemento.text")); // NOI18N
        edtComplemento.setName("edtComplemento"); // NOI18N
        edtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtComplementoActionPerformed(evt);
            }
        });

        jLabel5.setText(bundle.getString("EnderecoForm.jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        edtObs.setColumns(20);
        edtObs.setRows(5);
        edtObs.setName("edtObs"); // NOI18N
        jScrollPane2.setViewportView(edtObs);

        btnBusscar.setBackground(new java.awt.Color(183, 28, 28));
        btnBusscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBusscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/filtro6.png"))); // NOI18N
        btnBusscar.setText(bundle.getString("EnderecoForm.btnBusscar.text")); // NOI18N
        btnBusscar.setToolTipText(bundle.getString("EnderecoForm.btnBusscar.toolTipText")); // NOI18N
        btnBusscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusscar.setName("btnBusscar"); // NOI18N
        btnBusscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusscarActionPerformed(evt);
            }
        });

        btnRemoverFiltro.setBackground(new java.awt.Color(224, 224, 224));
        btnRemoverFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/removeFiltro1.png"))); // NOI18N
        btnRemoverFiltro.setText(bundle.getString("EnderecoForm.btnRemoverFiltro.text")); // NOI18N
        btnRemoverFiltro.setToolTipText(bundle.getString("EnderecoForm.btnRemoverFiltro.toolTipText")); // NOI18N
        btnRemoverFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoverFiltro.setName("btnRemoverFiltro"); // NOI18N
        btnRemoverFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFiltroActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel3)
                    .add(jLabel8)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(cbbCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jLabel9)
                                .add(18, 18, 18)
                                .add(cbbBairro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 217, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(19, 19, 19)
                                .add(jLabel14))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(112, 112, 112)
                                    .add(jLabel1)
                                    .add(18, 18, 18)
                                    .add(edtReferencia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(jLabel4))
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(edtEndereco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 391, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)
                                    .add(jLabel2))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(edtData, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(45, 45, 45)
                                .add(cbxStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(edtComplemento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, edtCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 657, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
            .add(jPanel1Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel10)
                .add(18, 18, 18)
                .add(edtID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(jPanel1Layout.createSequentialGroup()
                .add(249, 249, 249)
                .add(btnBusscar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(40, 40, 40)
                .add(btnRemoverFiltro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(jLabel10))
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(edtID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel1)
                        .add(edtReferencia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel4)
                        .add(edtCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(edtEndereco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2)
                    .add(edtComplemento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(cbbCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel9)
                    .add(cbbBairro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel14)
                    .add(edtData, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cbxStatus))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(27, 27, 27)
                        .add(jLabel5))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnBusscar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnRemoverFiltro))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Referência", "Endereço", "Complemento", "Bairro", "Ativo"
            }
        ));
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1)
                            .add(jSeparator3))))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(160, 160, 160)
                .add(btnNovo1)
                .add(18, 18, 18)
                .add(btnSalvar1)
                .add(12, 12, 12)
                .add(btnCancelar1)
                .add(87, 87, 87)
                .add(btnSair1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnNovo1)
                    .add(btnSalvar1)
                    .add(btnCancelar1)
                    .add(btnSair1))
                .add(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed

        //sairForm();
       
        dispose();
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed

        //cancelarOperacao();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed

        //salvarCliente();
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed

    }//GEN-LAST:event_btnNovo1ActionPerformed

    private void edtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtIDFocusGained

    }//GEN-LAST:event_edtIDFocusGained

    private void edtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            //cancelarOperacao();

        }
    }//GEN-LAST:event_edtIDKeyPressed

    private void edtClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtClienteFocusGained

        //zerarTabela();
    }//GEN-LAST:event_edtClienteFocusGained

    private void edtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_edtClienteMouseClicked

    private void edtClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtClienteKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            //cancelarOperacao();
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            edtEndereco.requestFocus();
        }
    }//GEN-LAST:event_edtClienteKeyPressed

    private void edtEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtEnderecoFocusGained

        
    }//GEN-LAST:event_edtEnderecoFocusGained

    private void edtEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEnderecoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbbCidade.requestFocus();
        }
    }//GEN-LAST:event_edtEnderecoKeyPressed

    private void cbbCidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbCidadeItemStateChanged
        // TODO add your handling code here:

       
    }//GEN-LAST:event_cbbCidadeItemStateChanged

    private void cbbCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbbCidadeFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbbCidadeFocusGained

    private void cbbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbCidadeActionPerformed

    private void cbbCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbCidadeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbbBairro.requestFocus();
        }
    }//GEN-LAST:event_cbbCidadeKeyPressed

    private void edtDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtDataFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDataFocusGained

    private void edtDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtDataKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDataKeyPressed

    private void cbbBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbbBairroFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbbBairroFocusGained

    private void cbbBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbBairroKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //            edtTelefone.requestFocus();
        }
    }//GEN-LAST:event_cbbBairroKeyPressed

    private void edtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtComplementoActionPerformed

    private void btnBusscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBusscarActionPerformed

    private void btnRemoverFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverFiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusscar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnRemoverFiltro;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<String> cbbBairro;
    private javax.swing.JComboBox<String> cbbCidade;
    private javax.swing.JCheckBox cbxStatus;
    private javax.swing.JTextField edtCliente;
    private javax.swing.JTextField edtComplemento;
    private javax.swing.JTextField edtData;
    private javax.swing.JTextField edtEndereco;
    private javax.swing.JTextField edtID;
    private javax.swing.JTextArea edtObs;
    private javax.swing.JTextField edtReferencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
