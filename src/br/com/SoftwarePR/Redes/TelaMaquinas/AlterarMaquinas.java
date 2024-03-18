/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.SoftwarePR.Redes.TelaMaquinas;

import br.com.SoftwarePR.Redes.Banco.ConexaoBanco;
import br.com.SoftwarePR.Redes.Construtor.ConstrutorMaquinas;

/**
 *
 * @author Paulo Ricardo
 */
public class AlterarMaquinas extends javax.swing.JFrame {

    /**
     * Creates new form AlterarNotebook
     */
    private String equipamento;
    private String sistema;
    private String ssd;
    private String ram;

    public AlterarMaquinas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupEquipamento = new javax.swing.ButtonGroup();
        GroupSistema = new javax.swing.ButtonGroup();
        GroupSsd = new javax.swing.ButtonGroup();
        GroupRam = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtColaborador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUa = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        BoxWindows11 = new javax.swing.JCheckBox();
        BoxWindows10 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        Box120GB = new javax.swing.JCheckBox();
        Box240GB = new javax.swing.JCheckBox();
        Box512GB = new javax.swing.JCheckBox();
        Box1TB = new javax.swing.JCheckBox();
        Box420GB = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        Box8GB = new javax.swing.JCheckBox();
        Box16GB = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPatrimonio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHostName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BoxNotebook = new javax.swing.JCheckBox();
        BoxComputador = new javax.swing.JCheckBox();
        Box32GB = new javax.swing.JCheckBox();
        btnAlterar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Maquinas");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Colaborador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Colaborador :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cidade:");

        txtUa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local 01", "Local 02", "Local 03", "Local 04", "Local 05" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtColaborador)
                    .addComponent(txtUa, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Maquina", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Modelo :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Sistema :");

        GroupSistema.add(BoxWindows11);
        BoxWindows11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BoxWindows11.setText("Windows 11");
        BoxWindows11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxWindows11ActionPerformed(evt);
            }
        });

        GroupSistema.add(BoxWindows10);
        BoxWindows10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BoxWindows10.setText("Windows 10");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("SSD :");

        GroupSsd.add(Box120GB);
        Box120GB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box120GB.setText("120 GB");

        GroupSsd.add(Box240GB);
        Box240GB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box240GB.setText("240 GB");

        GroupSsd.add(Box512GB);
        Box512GB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box512GB.setText("512 GB");

        GroupSsd.add(Box1TB);
        Box1TB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box1TB.setText("1 TB");
        Box1TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box1TBActionPerformed(evt);
            }
        });

        GroupSsd.add(Box420GB);
        Box420GB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box420GB.setText("420 GB");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("RAM :");

        GroupRam.add(Box8GB);
        Box8GB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box8GB.setText("8 GB");

        GroupRam.add(Box16GB);
        Box16GB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box16GB.setText("16 GB");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Serial :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Patrimonio :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("HostName :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Equipamento:");

        GroupEquipamento.add(BoxNotebook);
        BoxNotebook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BoxNotebook.setText("Notebook");

        GroupEquipamento.add(BoxComputador);
        BoxComputador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BoxComputador.setText("Computador");

        Box32GB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box32GB.setText("32 GB");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatrimonio))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHostName)
                                    .addComponent(txtModelo)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BoxNotebook)
                                .addGap(18, 18, 18)
                                .addComponent(BoxComputador)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BoxWindows11)
                                    .addComponent(Box120GB)
                                    .addComponent(Box8GB))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BoxWindows10)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Box240GB)
                                            .addComponent(Box16GB))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Box32GB)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(Box420GB)
                                                .addGap(18, 18, 18)
                                                .addComponent(Box512GB)
                                                .addGap(18, 18, 18)
                                                .addComponent(Box1TB)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSerial)
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtHostName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(BoxNotebook)
                    .addComponent(BoxComputador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BoxWindows11)
                    .addComponent(BoxWindows10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Box120GB)
                        .addComponent(Box240GB)
                        .addComponent(Box512GB)
                        .addComponent(Box1TB)
                        .addComponent(Box420GB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Box8GB)
                        .addComponent(Box16GB))
                    .addComponent(jLabel6)
                    .addComponent(Box32GB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("ID :");

        txtId.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel12.setText("PR Soaftwares");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addContainerGap())
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Box1TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box1TBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box1TBActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        AlterarDados();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void BoxWindows11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxWindows11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxWindows11ActionPerformed

    private void checkEquipamento() {

        if (BoxNotebook.isSelected()) {
            equipamento = "Notebook";
        } else if (BoxComputador.isSelected()) {
            equipamento = "Computador";
        }
    }

    private void checkSistema() {
        if (BoxWindows11.isSelected()) {
            sistema = "Windows11";
        } else if (BoxWindows10.isSelected()) {
            sistema = "Windows10";
        }
    }

    private void checkSSD() {
        if (Box120GB.isSelected()) {
            ssd = "120GB";
        } else if (Box240GB.isSelected()) {
            ssd = "240GB";
        } else if (Box420GB.isSelected()) {
            ssd = "420GB";
        } else if (Box512GB.isSelected()) {
            ssd = "520GB";
        } else if (Box1TB.isSelected()) {
            ssd = "1TB";
        }
    }

    private void checkRam() {

        if (Box8GB.isSelected()) {
            ram = "8GB";
        } else if (Box16GB.isSelected()) {
            ram = "16GB";
        }
        else if(Box32GB.isSelected()){
            ram="32GB";
        }
    }

    private void AlterarDados() {
        checkEquipamento();
        checkSistema();
        checkSSD();
        checkRam();

        ConexaoBanco banco = new ConexaoBanco();
        ConstrutorMaquinas maquinas = new ConstrutorMaquinas();

        maquinas.setId(Integer.parseInt(txtId.getText()));
        maquinas.setHostname(txtHostName.getText());
        maquinas.setColaborador(txtColaborador.getText());
        maquinas.setUa((String) txtUa.getSelectedItem());
        maquinas.setEquipamento(equipamento);
        maquinas.setModelo(txtModelo.getText());
        maquinas.setSistema(sistema);
        maquinas.setSsd(ssd);
        maquinas.setRam(ram);
        maquinas.setSerial(txtSerial.getText());
        maquinas.setPatrimonio(txtPatrimonio.getText());

        banco.AlterarMaquinas(maquinas);

        this.dispose();

    }

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
            java.util.logging.Logger.getLogger(AlterarMaquinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarMaquinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarMaquinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarMaquinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarMaquinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Box120GB;
    private javax.swing.JCheckBox Box16GB;
    private javax.swing.JCheckBox Box1TB;
    private javax.swing.JCheckBox Box240GB;
    private javax.swing.JCheckBox Box32GB;
    private javax.swing.JCheckBox Box420GB;
    private javax.swing.JCheckBox Box512GB;
    private javax.swing.JCheckBox Box8GB;
    private javax.swing.JCheckBox BoxComputador;
    private javax.swing.JCheckBox BoxNotebook;
    private javax.swing.JCheckBox BoxWindows10;
    private javax.swing.JCheckBox BoxWindows11;
    private javax.swing.ButtonGroup GroupEquipamento;
    private javax.swing.ButtonGroup GroupRam;
    private javax.swing.ButtonGroup GroupSistema;
    private javax.swing.ButtonGroup GroupSsd;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtColaborador;
    private javax.swing.JTextField txtHostName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPatrimonio;
    private javax.swing.JTextField txtSerial;
    private javax.swing.JComboBox<String> txtUa;
    // End of variables declaration//GEN-END:variables

    public void RecebendoDados(String id, String hostname, String colaborador, String ua, String equipamento, String modelo,
            String sistema, String ssd, String ram, String serial, String patrimonio) {

        txtId.setText(id);
        txtHostName.setText(hostname);
        txtColaborador.setText(colaborador);
        txtModelo.setText(modelo);
        txtPatrimonio.setText(patrimonio);
        txtSerial.setText(serial);
        txtUa.setSelectedItem(ua);

        switch (equipamento) {
            case "Notebook" ->
                BoxNotebook.setSelected(true);
            case "Computador" ->
                BoxComputador.setSelected(true);
            default -> {
                BoxNotebook.setSelected(false);
                BoxComputador.setSelected(false);
            }
        }

        switch (sistema) {
            case "Windows10" ->
                BoxWindows10.setSelected(true);
            case "Windows11" ->
                BoxWindows11.setSelected(true);
            default -> {
                BoxWindows10.setSelected(false);
                BoxWindows11.setSelected(false);
            }
        }

        switch (ssd) {
            case "120GB" ->
                Box120GB.setSelected(true);
            case "240GB" ->
                Box240GB.setSelected(true);
            case "420GB" ->
                Box420GB.setSelected(true);
            case "512GB" ->
                Box512GB.setSelected(true);
            case "1TB" ->
                Box1TB.setSelected(true);
            default -> {
                Box120GB.setSelected(false);
                Box240GB.setSelected(false);
                Box420GB.setSelected(false);
                Box512GB.setSelected(false);
                Box1TB.setSelected(false);
            }
        }

        switch (ram) {
            case "8GB" ->
                Box8GB.setSelected(true);
            case "16GB" ->
                Box16GB.setSelected(true);
            case "32GB" ->
                Box32GB.setSelected(true);
            default -> {
                Box8GB.setSelected(false);
                Box16GB.setSelected(false);
            }

        }
    }
}