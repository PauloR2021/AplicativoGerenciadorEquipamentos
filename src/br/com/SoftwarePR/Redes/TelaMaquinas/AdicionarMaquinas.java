/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.SoftwarePR.Redes.TelaMaquinas;

import br.com.SoftwarePR.Redes.Banco.ConexaoBanco;
import br.com.SoftwarePR.Redes.Construtor.ConstrutorMaquinas;
import br.com.SoftwarePR.Redes.TelaMenu.TelaMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Ricardo
 */
public class AdicionarMaquinas extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarMaquinas
     */
    private String hostname;
    private String colaborador;
    private String ua;
    private String equipamento;
    private String modelo;
    private String sistema;
    private String ssd;
    private String ram;
    private String serial;
    private String patrimonio;

    public AdicionarMaquinas() {
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

        GroupBoxSistema = new javax.swing.ButtonGroup();
        GroupBoxSSD = new javax.swing.ButtonGroup();
        GroupBoxRam = new javax.swing.ButtonGroup();
        GroupBoxequipamento = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtColaborador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUa = new javax.swing.JComboBox<>();
        btnMenu = new javax.swing.JButton();
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
        btnAdicionar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adicionar Maquina");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Colaborador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Colaborador :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cidade:");

        txtUa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local 01", "Local 02", "Local 03", "Local 04", "Local 05" }));
        txtUa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUaActionPerformed(evt);
            }
        });

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
                .addContainerGap(63, Short.MAX_VALUE))
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

        btnMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenu.setText("MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Maquina", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Modelo :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Sistema :");

        GroupBoxSistema.add(BoxWindows11);
        BoxWindows11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BoxWindows11.setText("Windows 11");

        GroupBoxSistema.add(BoxWindows10);
        BoxWindows10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BoxWindows10.setText("Windows 10");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("SSD :");

        GroupBoxSSD.add(Box120GB);
        Box120GB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box120GB.setText("120 GB");

        GroupBoxSSD.add(Box240GB);
        Box240GB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box240GB.setText("240 GB");

        GroupBoxSSD.add(Box512GB);
        Box512GB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box512GB.setText("512 GB");

        GroupBoxSSD.add(Box1TB);
        Box1TB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box1TB.setText("1 TB");
        Box1TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box1TBActionPerformed(evt);
            }
        });

        GroupBoxSSD.add(Box420GB);
        Box420GB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box420GB.setText("420 GB");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("RAM :");

        GroupBoxRam.add(Box8GB);
        Box8GB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Box8GB.setText("8 GB");

        GroupBoxRam.add(Box16GB);
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

        GroupBoxequipamento.add(BoxNotebook);
        BoxNotebook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BoxNotebook.setText("Notebook");

        GroupBoxequipamento.add(BoxComputador);
        BoxComputador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BoxComputador.setText("Computador");

        GroupBoxRam.add(Box32GB);
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
                        .addComponent(Box16GB)
                        .addComponent(Box32GB))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel13.setText("PR Softwares");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(btnAdicionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMenu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Box1TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box1TBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box1TBActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        verificandoDados();

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        TelaMenu menu = new TelaMenu();
        menu.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtUaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUaActionPerformed

    private void checkEquipamento(){
        if(BoxNotebook.isSelected()){
            equipamento= "Notebook";
        }
        else if(BoxComputador.isSelected()){
            equipamento= "Computador";
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

    private void verificandoDados() {
        
        checkEquipamento();
        checkSistema();
        checkSSD();
        checkRam();

        hostname = txtHostName.getText();
        colaborador = txtColaborador.getText();
        ua = txtUa.getSelectedItem().toString();
        modelo = txtModelo.getText();
        serial = txtSerial.getText();
        patrimonio = txtPatrimonio.getText();
        
        if(colaborador.isEmpty() || ua.isEmpty()||hostname.isEmpty() || serial.isEmpty()||patrimonio.isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha os campos Colaborador,UA,HostName,Serial e Patrimonio", "erro", 0);
        }else{
            adicionarMaquina();
        }
        

    }
    
    private void adicionarMaquina(){
        ConexaoBanco banco = new ConexaoBanco();
        ConstrutorMaquinas maquina = new ConstrutorMaquinas();
        
        maquina.setColaborador(colaborador);
        maquina.setUa(ua);
        maquina.setHostname(hostname);
        maquina.setEquipamento(equipamento);
        maquina.setModelo(modelo);
        maquina.setSistema(sistema);
        maquina.setSsd(ssd);
        maquina.setRam(ram);
        maquina.setSerial(serial);
        maquina.setPatrimonio(patrimonio);
        
        banco.AdicionarMaquinas(maquina);
        
        limparDados();
    }
    
    private void limparDados(){
        txtColaborador.setText("");
        txtHostName.setText("");
        txtModelo.setText("");
        txtPatrimonio.setText("");
        txtSerial.setText("");
       
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
            java.util.logging.Logger.getLogger(AdicionarMaquinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarMaquinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarMaquinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarMaquinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarMaquinas().setVisible(true);
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
    private javax.swing.ButtonGroup GroupBoxRam;
    private javax.swing.ButtonGroup GroupBoxSSD;
    private javax.swing.ButtonGroup GroupBoxSistema;
    private javax.swing.ButtonGroup GroupBoxequipamento;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField txtColaborador;
    private javax.swing.JTextField txtHostName;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPatrimonio;
    private javax.swing.JTextField txtSerial;
    private javax.swing.JComboBox<String> txtUa;
    // End of variables declaration//GEN-END:variables
}
