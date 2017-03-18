
package GUI;

import Beans.ClienteBeans;
import Beans.LoginBeans;
import Controller.ClienteController;
import Controller.ConfiguracaoMaster;
import static GUI.Principal.controleInternal;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.RowSorterEvent;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;


public class ClienteForm extends javax.swing.JInternalFrame {

    MaskFormatter FormatoTel;
    
    MaskFormatter FormatoDoc;

    SimpleDateFormat FormatoData;

    Date DataAtual;

    ClienteBeans ClienteB = new ClienteBeans();

    ClienteController ClienteC = new ClienteController();

    EnderecoForm enderecoForm = new EnderecoForm();
    
    DefaultTableModel Modelo;
    
    
   
    public ClienteForm() {
        
        initComponents();
        habilitarCampos(false);
        btnNovoCliente.setVisible(false);
        btnNovo.requestFocus();
        Modelo = (DefaultTableModel) tblCliente.getModel();
        ClienteC.controlePesquisa(Modelo);
        tblCliente.setRowSorter(new TableRowSorter(Modelo));
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rgpSexo = new javax.swing.ButtonGroup();
        pnlPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        edtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edtCadastro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnBusscar = new javax.swing.JButton();
        btnRemoverFiltro = new javax.swing.JButton();
        btnNovoCliente = new javax.swing.JButton();
        lblCel = new javax.swing.JLabel();
        try {
            FormatoTel = new MaskFormatter("##/##/####");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        edtNascimento = new JFormattedTextField(FormatoTel)
        ;
        lblEmail = new javax.swing.JLabel();
        edtEmail = new javax.swing.JTextField();
        cbxStatus = new javax.swing.JCheckBox();
        try {
            FormatoDoc = new MaskFormatter("##.###.###-A");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        edtRG = new JFormattedTextField(FormatoDoc)
        ;
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        try {         
            FormatoDoc = new MaskFormatter("###.###.###-##");                
        } catch (Exception e) {           
            JOptionPane.showMessageDialog(null, e.getMessage());         }
        edtCPF = new JFormattedTextField(FormatoDoc) ;
        btnEndereco = new javax.swing.JButton();
        btnTelefone = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        edtSobrenome = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        edtReferencia = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        edtOperador = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtObs = new javax.swing.JTextArea();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblCel1 = new javax.swing.JLabel();
        pnlSexo = new javax.swing.JPanel();
        rbtnFem = new javax.swing.JRadioButton();
        rbtnMasc = new javax.swing.JRadioButton();

        setIconifiable(true);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("GUI/Bundle"); // NOI18N
        setTitle(bundle.getString("ClienteForm.title")); // NOI18N
        setName("frmClientes"); // NOI18N
        setPreferredSize(new java.awt.Dimension(990, 740));
        getContentPane().setLayout(null);

        pnlPrincipal.setName("pnlPrincipal"); // NOI18N
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(966, 740));

        jLabel1.setText(bundle.getString("ClienteForm.jLabel1.text_1")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jSeparator2.setName("jSeparator2"); // NOI18N

        edtID.setEditable(false);
        edtID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edtID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtID.setName("edtID"); // NOI18N

        jLabel2.setText(bundle.getString("ClienteForm.jLabel2.text_1")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        edtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtNome.setName("edtNome"); // NOI18N

        jLabel5.setText(bundle.getString("ClienteForm.jLabel5.text_1")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText(bundle.getString("ClienteForm.jLabel6.text_1")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        edtCadastro.setEditable(false);
        edtCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtCadastro.setName("edtCadastro"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N

        btnBusscar.setBackground(new java.awt.Color(183, 28, 28));
        btnBusscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBusscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/filtro6.png"))); // NOI18N
        btnBusscar.setText(bundle.getString("ClienteForm.btnBusscar.text_1")); // NOI18N
        btnBusscar.setToolTipText(bundle.getString("ClienteForm.btnBusscar.toolTipText")); // NOI18N
        btnBusscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusscar.setName("btnBusscar"); // NOI18N
        btnBusscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusscarActionPerformed(evt);
            }
        });

        btnRemoverFiltro.setBackground(new java.awt.Color(224, 224, 224));
        btnRemoverFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/removeFiltro1.png"))); // NOI18N
        btnRemoverFiltro.setText(bundle.getString("ClienteForm.btnRemoverFiltro.text_1")); // NOI18N
        btnRemoverFiltro.setToolTipText(bundle.getString("ClienteForm.btnRemoverFiltro.toolTipText")); // NOI18N
        btnRemoverFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoverFiltro.setName("btnRemoverFiltro"); // NOI18N
        btnRemoverFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFiltroActionPerformed(evt);
            }
        });

        btnNovoCliente.setBackground(new java.awt.Color(176, 190, 197));
        btnNovoCliente.setForeground(new java.awt.Color(51, 51, 51));
        btnNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/novobtn1.png"))); // NOI18N
        btnNovoCliente.setText(bundle.getString("ClienteForm.btnNovoCliente.text_1")); // NOI18N
        btnNovoCliente.setToolTipText(bundle.getString("ClienteForm.btnNovoCliente.toolTipText_1")); // NOI18N
        btnNovoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoCliente.setName("btnNovoCliente"); // NOI18N
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        lblCel.setText(bundle.getString("ClienteForm.lblCel.text_1")); // NOI18N
        lblCel.setName("lblCel"); // NOI18N

        edtNascimento.setToolTipText(bundle.getString("ClienteForm.edtNascimento.toolTipText_1")); // NOI18N
        edtNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtNascimento.setName("edtNascimento"); // NOI18N

        lblEmail.setText(bundle.getString("ClienteForm.lblEmail.text_1")); // NOI18N
        lblEmail.setName("lblEmail"); // NOI18N

        edtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtEmail.setName("edtEmail"); // NOI18N

        cbxStatus.setSelected(true);
        cbxStatus.setText(bundle.getString("ClienteForm.cbxStatus.text_1")); // NOI18N
        cbxStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxStatus.setName("cbxStatus"); // NOI18N
        cbxStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxStatusItemStateChanged(evt);
            }
        });

        edtRG.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtRG.setName("edtRG"); // NOI18N

        jLabel11.setText(bundle.getString("ClienteForm.jLabel11.text_1")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        jLabel7.setText(bundle.getString("ClienteForm.jLabel7.text_1")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        edtCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edtCPF.setName("edtCPF"); // NOI18N

        btnEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/view3.png"))); // NOI18N
        btnEndereco.setText(bundle.getString("ClienteForm.btnEndereco.text_1")); // NOI18N
        btnEndereco.setName("btnEndereco"); // NOI18N
        btnEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnderecoActionPerformed(evt);
            }
        });

        btnTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/view3.png"))); // NOI18N
        btnTelefone.setText(bundle.getString("ClienteForm.btnTelefone.text_1")); // NOI18N
        btnTelefone.setName("btnTelefone"); // NOI18N

        jLabel12.setText(bundle.getString("ClienteForm.jLabel12.text_1")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        edtSobrenome.setName("edtSobrenome"); // NOI18N

        jLabel13.setText(bundle.getString("ClienteForm.jLabel13.text_1")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N

        edtReferencia.setToolTipText(bundle.getString("ClienteForm.edtReferencia.toolTipText_1")); // NOI18N
        edtReferencia.setName("edtReferencia"); // NOI18N

        jLabel15.setText(bundle.getString("ClienteForm.jLabel15.text_1")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N

        edtOperador.setName("edtOperador"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        tblCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Referência", "Nome", "Sobrenome", "Endereço", "Telefone", "Email", "Operador", "RG", "CPF", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCliente.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tblCliente.setName("tblCliente"); // NOI18N
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblClienteMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);

        jLabel3.setText(bundle.getString("ClienteForm.jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText(bundle.getString("ClienteForm.jScrollPane1.toolTipText")); // NOI18N
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        edtObs.setColumns(20);
        edtObs.setRows(5);
        edtObs.setAutoscrolls(false);
        edtObs.setName("edtObs"); // NOI18N
        jScrollPane1.setViewportView(edtObs);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/inserir2.png"))); // NOI18N
        btnNovo.setToolTipText(bundle.getString("ClienteForm.btnNovo.toolTipText_1")); // NOI18N
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setName("btnNovo"); // NOI18N
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/salvar.png"))); // NOI18N
        btnSalvar.setToolTipText(bundle.getString("ClienteForm.btnSalvar.toolTipText_1")); // NOI18N
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setDisabledIcon(null);
        btnSalvar.setEnabled(false);
        btnSalvar.setName("btnSalvar"); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cancel-1.png"))); // NOI18N
        btnCancelar.setToolTipText(bundle.getString("ClienteForm.btnCancelar.toolTipText_1")); // NOI18N
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setDisabledIcon(null);
        btnCancelar.setEnabled(false);
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sair-1.png"))); // NOI18N
        btnSair.setToolTipText(bundle.getString("ClienteForm.btnSair.toolTipText_1")); // NOI18N
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setDisabledIcon(null);
        btnSair.setName("btnSair"); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblCel1.setText(bundle.getString("ClienteForm.lblCel1.text_1")); // NOI18N
        lblCel1.setName("lblCel1"); // NOI18N

        pnlSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), bundle.getString("ClienteForm.pnlSexo.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP)); // NOI18N
        pnlSexo.setName("pnlSexo"); // NOI18N

        rgpSexo.add(rbtnFem);
        rbtnFem.setText(bundle.getString("ClienteForm.rbtnFem.text")); // NOI18N
        rbtnFem.setName("rbtnFem"); // NOI18N

        rgpSexo.add(rbtnMasc);
        rbtnMasc.setSelected(true);
        rbtnMasc.setText(bundle.getString("ClienteForm.rbtnMasc.text")); // NOI18N
        rbtnMasc.setName("rbtnMasc"); // NOI18N
        rbtnMasc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnMascItemStateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlSexoLayout = new org.jdesktop.layout.GroupLayout(pnlSexo);
        pnlSexo.setLayout(pnlSexoLayout);
        pnlSexoLayout.setHorizontalGroup(
            pnlSexoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlSexoLayout.createSequentialGroup()
                .add(pnlSexoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(rbtnFem)
                    .add(rbtnMasc))
                .add(0, 10, Short.MAX_VALUE))
        );
        pnlSexoLayout.setVerticalGroup(
            pnlSexoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlSexoLayout.createSequentialGroup()
                .add(rbtnMasc)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 10, Short.MAX_VALUE)
                .add(rbtnFem))
        );

        rbtnFem.getAccessibleContext().setAccessibleParent(this);
        rbtnMasc.getAccessibleContext().setAccessibleDescription(bundle.getString("ClienteForm.rbtnMasc.AccessibleContext.accessibleDescription")); // NOI18N
        rbtnMasc.getAccessibleContext().setAccessibleParent(this);

        org.jdesktop.layout.GroupLayout pnlPrincipalLayout = new org.jdesktop.layout.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlPrincipalLayout.createSequentialGroup()
                .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(pnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1024, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(pnlPrincipalLayout.createSequentialGroup()
                            .add(49, 49, 49)
                            .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(pnlPrincipalLayout.createSequentialGroup()
                                    .add(jLabel1)
                                    .add(20, 20, 20)
                                    .add(btnNovoCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(edtID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(pnlPrincipalLayout.createSequentialGroup()
                                    .add(6, 6, 6)
                                    .add(lblEmail)))
                            .add(14, 14, 14)
                            .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel13)
                                .add(edtReferencia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(6, 6, 6)
                            .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(pnlPrincipalLayout.createSequentialGroup()
                                    .add(edtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(12, 12, 12)
                                    .add(edtSobrenome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(pnlPrincipalLayout.createSequentialGroup()
                                    .add(4, 4, 4)
                                    .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(pnlPrincipalLayout.createSequentialGroup()
                                            .add(jLabel2)
                                            .add(132, 132, 132)
                                            .add(jLabel12))
                                        .add(pnlPrincipalLayout.createSequentialGroup()
                                            .add(lblCel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(25, 25, 25)
                                            .add(jLabel6)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                            .add(lblCel1)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .add(jLabel7)
                                            .add(25, 25, 25)))))
                            .add(21, 21, 21)
                            .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(btnEndereco))
                            .add(18, 18, 18)
                            .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel5)
                                .add(btnTelefone)))
                        .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1030, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1030, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(pnlPrincipalLayout.createSequentialGroup()
                            .add(167, 167, 167)
                            .add(btnNovo)
                            .add(18, 18, 18)
                            .add(btnSalvar)
                            .add(18, 18, 18)
                            .add(btnCancelar)
                            .add(285, 285, 285)
                            .add(btnSair, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(pnlPrincipalLayout.createSequentialGroup()
                            .add(50, 50, 50)
                            .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(pnlPrincipalLayout.createSequentialGroup()
                                    .add(edtEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 157, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(12, 12, 12)
                                    .add(edtOperador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 184, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(6, 6, 6)
                                    .add(edtNascimento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 79, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(6, 6, 6)
                                    .add(edtCadastro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 97, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                    .add(edtRG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 95, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(edtCPF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)
                                    .add(cbxStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(pnlPrincipalLayout.createSequentialGroup()
                                    .add(pnlSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(43, 43, 43)
                                    .add(btnBusscar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(40, 40, 40)
                                    .add(btnRemoverFiltro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(77, 77, 77)
                                    .add(jLabel3)
                                    .add(12, 12, 12)
                                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 326, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                .add(10, 10, 10))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlPrincipalLayout.createSequentialGroup()
                .add(10, 10, 10)
                .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlPrincipalLayout.createSequentialGroup()
                        .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(btnNovoCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                .add(jLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                        .add(edtID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(lblEmail))
                    .add(pnlPrincipalLayout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(jLabel13)
                        .add(6, 6, 6)
                        .add(edtReferencia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(jLabel15))
                    .add(pnlPrincipalLayout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(pnlPrincipalLayout.createSequentialGroup()
                                .add(2, 2, 2)
                                .add(jLabel12)))
                        .add(4, 4, 4)
                        .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(edtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(edtSobrenome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(6, 6, 6)
                        .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblCel)
                            .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jLabel6)
                                .add(lblCel1))
                            .add(jLabel7)))
                    .add(pnlPrincipalLayout.createSequentialGroup()
                        .add(16, 16, 16)
                        .add(jLabel11)
                        .add(4, 4, 4)
                        .add(btnEndereco))
                    .add(pnlPrincipalLayout.createSequentialGroup()
                        .add(16, 16, 16)
                        .add(jLabel5)
                        .add(4, 4, 4)
                        .add(btnTelefone)))
                .add(6, 6, 6)
                .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(edtEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(edtOperador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(edtNascimento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(edtCadastro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(edtRG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(edtCPF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlPrincipalLayout.createSequentialGroup()
                        .add(5, 5, 5)
                        .add(cbxStatus)))
                .add(6, 6, 6)
                .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlPrincipalLayout.createSequentialGroup()
                        .add(45, 45, 45)
                        .add(btnBusscar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pnlPrincipalLayout.createSequentialGroup()
                        .add(45, 45, 45)
                        .add(btnRemoverFiltro))
                    .add(pnlPrincipalLayout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(jLabel3))
                    .add(pnlPrincipalLayout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(9, 9, 9)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 203, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(3, 3, 3)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(pnlPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnNovo)
                    .add(btnSalvar)
                    .add(btnCancelar)
                    .add(btnSair)))
        );

        getContentPane().add(pnlPrincipal);
        pnlPrincipal.setBounds(-3, 6, 1030, 610);

        getAccessibleContext().setAccessibleName(bundle.getString("ClienteForm.AccessibleContext.accessibleName")); // NOI18N

        setBounds(0, 0, 1042, 649);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        habilitarCampos(true);
        limparCampos();
        edtNome.requestFocus();
        edtOperador.setText(new LoginBeans().get$funcionario());
        habilitarButton(true);
        FormatoData = new SimpleDateFormat("dd/MM/yyyy");
        DataAtual = new Date();
        edtCadastro.setText(FormatoData.format(DataAtual));
        Modelo.setNumRows(0);
        edtID.setText(ClienteC.controleID());
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(null, "É um novo cliente?", "Mudar Cliente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);

        if (resp == 0) {
            edtID.setText(ClienteC.controleID());
            btnNovoCliente.setVisible(false);
            btnNovo.setEnabled(false);
        }
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        salvarCliente();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbxStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxStatusItemStateChanged
        // TODO add your handling code here:
        if (cbxStatus.isSelected()) {
            cbxStatus.setText("Ativo");
        } else {
            cbxStatus.setText("Inativo");
        }
    }//GEN-LAST:event_cbxStatusItemStateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        cancelarOperacao();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        sairForm();
    }//GEN-LAST:event_btnSairActionPerformed

    private void tblClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMousePressed
        // TODO add your handling code here:
        acaoTbl();
    }//GEN-LAST:event_tblClienteMousePressed

    private void btnRemoverFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverFiltroActionPerformed

    private void btnBusscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBusscarActionPerformed

    private void btnEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnderecoActionPerformed
        // TODO add your handling code here:
       if(controleInternal(enderecoForm)){  
            enderecoForm = new EnderecoForm();
            Principal.getTela().add(enderecoForm);
            enderecoForm.show();
            enderecoForm.setLocation(170, 0);
            
        }
         
        
    }//GEN-LAST:event_btnEnderecoActionPerformed

    public JRadioButton getRbtnFem() {
        return rbtnFem;
    }

    public void setRbtnFem(JRadioButton rbtnFem) {
        this.rbtnFem = rbtnFem;
    }

    public JRadioButton getRbtnMasc() {
        return rbtnMasc;
    }

    public void setRbtnMasc(JRadioButton rbtnMasc) {
        this.rbtnMasc = rbtnMasc;
    }

    public ButtonGroup getRgpSexo() {
        return rgpSexo;
    }

    public void setRgpSexo(ButtonGroup rgpSexo) {
        this.rgpSexo = rgpSexo;
    }
        
    private void rbtnMascItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnMascItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_rbtnMascItemStateChanged

    public  JPanel getPnl(){
        return pnlPrincipal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEndereco;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnRemoverFiltro;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnTelefone;
    private javax.swing.JCheckBox cbxStatus;
    private javax.swing.JTextField edtCPF;
    private javax.swing.JTextField edtCadastro;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtID;
    private javax.swing.JTextField edtNascimento;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextArea edtObs;
    private javax.swing.JTextField edtOperador;
    private javax.swing.JTextField edtRG;
    private javax.swing.JTextField edtReferencia;
    private javax.swing.JTextField edtSobrenome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSexo;
    private javax.swing.JRadioButton rbtnFem;
    private javax.swing.JRadioButton rbtnMasc;
    private javax.swing.ButtonGroup rgpSexo;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables

    private void habilitarCampos(boolean valor) {
        
        edtID.setEnabled(valor);  btnNovoCliente.setEnabled(valor); edtReferencia.setEnabled(valor);
        edtNome.setEnabled(valor); edtSobrenome.setEnabled(valor);
        btnEndereco.setEnabled(valor); btnTelefone.setEnabled(valor);
        edtEmail.setEnabled(valor); edtOperador.setEnabled(valor);
        edtNascimento.setEnabled(valor); edtCadastro.setEnabled(valor);
        edtRG.setEnabled(valor); edtCPF.setEnabled(valor);
        edtObs.setEnabled(valor);
        cbxStatus.setEnabled(valor);
        
    }

    private void limparCampos() {
        limpar(edtID);
        limpar(edtCPF);
        limpar(edtCadastro);
        limpar(edtEmail);
        limpar(edtNascimento);
        limpar(edtNome);
        limpar(edtOperador);
        limpar(edtRG);
        limpar(edtReferencia);
        limpar(edtSobrenome);
        cbxStatus.setText("Ativo"); cbxStatus.setSelected(true);
    }
    
    public void limpar(JTextField txt) {
        txt.setText(null);
    }

    private void habilitarButton(boolean valor) {
        
        btnNovo.setEnabled(!valor);
        btnSalvar.setEnabled(valor);
        btnBusscar.setEnabled(!valor);
        btnRemoverFiltro.setEnabled(!valor);
        btnCancelar.setEnabled(valor);        
        if(!edtNome.getText().equals("")){
            btnNovoCliente.setVisible(valor);
        } else {
            btnNovoCliente.setVisible(!valor); 
        }
    }

    private void salvarCliente() {
        popularClienteBeans();
        if (ClienteC.verificarDados(ClienteB)) {
            habilitarCampos(false);
            habilitarButton(false);
            limparCampos();
            ClienteC.controlePesquisa(Modelo);
        }
    }

    private void popularClienteBeans() {
        
        ClienteB.setCodigo(Integer.parseInt(edtID.getText())); ClienteB.setReferencia(edtReferencia.getText());
        ClienteB.setNome(edtNome.getText(),0); ClienteB.setNome(edtSobrenome.getText(), 1);
        ClienteB.setEmail(edtEmail.getText()); ClienteB.setOperador(edtOperador.getText());
        ClienteB.setDataNasc(edtNascimento.getText()); ClienteB.setDataCad(edtCadastro.getText());
        ClienteB.setRg(edtRG.getText()); ClienteB.setCpf(edtCPF.getText());
        ClienteB.setAtivo(cbxStatus.isSelected());
        
    }

    private void cancelarOperacao() {
        Object[] options = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(null, "Deseja Cancelar a inclusão?", "Abortar Operação", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);

        if (resp == 0) {
            habilitarCampos(false);
            habilitarButton(false);
            ClienteC.controlePesquisa(Modelo);
            limparCampos();
            btnNovoCliente.setVisible(false);
            cbxStatus.setText("Ativo");
        } else {
            edtNome.requestFocus();
        }
    }

    private void sairForm() {
        ConfiguracaoMaster.fecharForm(this);
    }

    private void acaoTbl() {
        ClienteB = ClienteC.controlePreencherCampos(Integer.parseInt(Modelo.getValueAt(tblCliente.getSelectedRow(), 0).toString()));
        habilitarCampos(true);
        limparCampos();            
        busscarRegistros();
    }

    private void busscarRegistros() {
        edtID.setText(Integer.toString(ClienteB.getCodigo())); edtReferencia.setText(ClienteB.getReferencia());
        edtNome.setText(ClienteB.getNome()[0]); edtSobrenome.setText(ClienteB.getNome()[1]);
        edtEmail.setText(ClienteB.getEmail()); edtOperador.setText(ClienteB.getOperador());
        edtNascimento.setText(ClienteB.getDataNasc()); edtCadastro.setText(ClienteB.getDataCad());
        edtRG.setText(ClienteB.getRg()); edtCPF.setText(ClienteB.getCpf());
        cbxStatus.setSelected(ClienteB.getAtivo());
       
        if (cbxStatus.isSelected()) {
            cbxStatus.setText("Ativo");
        } else {
            cbxStatus.setText("Inativo");
        }
    }
   
}
