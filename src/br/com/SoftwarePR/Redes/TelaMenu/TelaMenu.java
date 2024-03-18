/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.SoftwarePR.Redes.TelaMenu;

import br.com.SoftwarePR.Redes.TelaCelulares.AdicionarCelular;
import br.com.SoftwarePR.Redes.TelaCelulares.ConsultarCelular;
import br.com.SoftwarePR.Redes.TelaImpressoras.AdicionarImpressora;
import br.com.SoftwarePR.Redes.TelaImpressoras.ConsultarImpressora;
import br.com.SoftwarePR.Redes.TelaMaquinas.AdicionarMaquinas;
import br.com.SoftwarePR.Redes.TelaMaquinas.ConsultarMaquinas;
import br.com.SoftwarePR.Redes.TelaRelatorios.telaGerarRelatorios;

import br.com.SoftwarePR.Redes.TelaRoteadores.AdicionarRoteador;
import br.com.SoftwarePR.Redes.TelaRoteadores.ConsultarRoteador;

/**
 *
 * @author Paulo Ricardo
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btnAdicionarImpressora = new javax.swing.JMenuItem();
        btnConsultarImpressora = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnAdicionarRoteador = new javax.swing.JMenuItem();
        btnConsultarRoteador = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnAdicionarCelular = new javax.swing.JMenuItem();
        btnConsultarCelular = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnAdicionarMaquinas = new javax.swing.JMenuItem();
        btnConsultarMaquinas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        btnGerarRelatorios = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(java.awt.SystemColor.activeCaptionBorder);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText("PR Softwares");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(426, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jMenuBar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuBar2KeyPressed(evt);
            }
        });

        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Impressoras");
        jMenu3.setAlignmentX(1.0F);
        jMenu3.setAutoscrolls(true);
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu3.setHideActionText(true);

        btnAdicionarImpressora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        btnAdicionarImpressora.setText("Adicionar Impressora");
        btnAdicionarImpressora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarImpressoraActionPerformed(evt);
            }
        });
        jMenu3.add(btnAdicionarImpressora);

        btnConsultarImpressora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        btnConsultarImpressora.setText("Consultar impressoras");
        btnConsultarImpressora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarImpressoraActionPerformed(evt);
            }
        });
        jMenu3.add(btnConsultarImpressora);

        jMenuBar2.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setForeground(new java.awt.Color(0, 0, 0));
        jMenu4.setText("Roteadores");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnAdicionarRoteador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnAdicionarRoteador.setText("Adicionar Roteador");
        btnAdicionarRoteador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarRoteadorActionPerformed(evt);
            }
        });
        jMenu4.add(btnAdicionarRoteador);

        btnConsultarRoteador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnConsultarRoteador.setText("Consultar Roteador");
        btnConsultarRoteador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarRoteadorActionPerformed(evt);
            }
        });
        jMenu4.add(btnConsultarRoteador);

        jMenuBar2.add(jMenu4);

        jMenu1.setText("Celulares");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnAdicionarCelular.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnAdicionarCelular.setText("Adicionar Celular");
        btnAdicionarCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCelularActionPerformed(evt);
            }
        });
        jMenu1.add(btnAdicionarCelular);

        btnConsultarCelular.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnConsultarCelular.setText("Consultar Celular");
        btnConsultarCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCelularActionPerformed(evt);
            }
        });
        jMenu1.add(btnConsultarCelular);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Maquinas");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnAdicionarMaquinas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnAdicionarMaquinas.setText("Adicionar Maquinas");
        btnAdicionarMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarMaquinasActionPerformed(evt);
            }
        });
        jMenu2.add(btnAdicionarMaquinas);

        btnConsultarMaquinas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnConsultarMaquinas.setText("Consultar Maquinas");
        btnConsultarMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMaquinasActionPerformed(evt);
            }
        });
        jMenu2.add(btnConsultarMaquinas);

        jMenuBar2.add(jMenu2);

        jMenu5.setText("Relatorios");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnGerarRelatorios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnGerarRelatorios.setText("Gerar Relatorios");
        btnGerarRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatoriosActionPerformed(evt);
            }
        });
        jMenu5.add(btnGerarRelatorios);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuBar2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuBar2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar2KeyPressed

    private void btnConsultarImpressoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarImpressoraActionPerformed
        ConsultarImpressora consul = new ConsultarImpressora();
        consul.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultarImpressoraActionPerformed

    private void btnAdicionarImpressoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarImpressoraActionPerformed
        AdicionarImpressora adic = new AdicionarImpressora();
        adic.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnAdicionarImpressoraActionPerformed

    private void btnAdicionarRoteadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarRoteadorActionPerformed
        AdicionarRoteador roteador = new AdicionarRoteador();
        roteador.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnAdicionarRoteadorActionPerformed

    private void btnConsultarRoteadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarRoteadorActionPerformed
        ConsultarRoteador consult = new ConsultarRoteador();
        consult.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnConsultarRoteadorActionPerformed

    private void btnAdicionarCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCelularActionPerformed
        AdicionarCelular celular = new AdicionarCelular();
        celular.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnAdicionarCelularActionPerformed

    private void btnConsultarCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCelularActionPerformed
        ConsultarCelular consulta = new ConsultarCelular();
        consulta.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnConsultarCelularActionPerformed

    private void btnAdicionarMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarMaquinasActionPerformed
        AdicionarMaquinas maquina = new  AdicionarMaquinas();
        maquina.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnAdicionarMaquinasActionPerformed

    private void btnConsultarMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMaquinasActionPerformed
        ConsultarMaquinas consultMaq = new ConsultarMaquinas();
        consultMaq.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnConsultarMaquinasActionPerformed

    private void btnGerarRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatoriosActionPerformed
        telaGerarRelatorios rel = new telaGerarRelatorios();
        rel.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnGerarRelatoriosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAdicionarCelular;
    private javax.swing.JMenuItem btnAdicionarImpressora;
    private javax.swing.JMenuItem btnAdicionarMaquinas;
    private javax.swing.JMenuItem btnAdicionarRoteador;
    private javax.swing.JMenuItem btnConsultarCelular;
    private javax.swing.JMenuItem btnConsultarImpressora;
    private javax.swing.JMenuItem btnConsultarMaquinas;
    private javax.swing.JMenuItem btnConsultarRoteador;
    private javax.swing.JMenuItem btnGerarRelatorios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
