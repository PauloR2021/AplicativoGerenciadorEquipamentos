/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.SoftwarePR.Redes.TelaRelatorios;

import br.com.SoftwarePR.Redes.Banco.ConexaoBanco;
import br.com.SoftwarePR.Redes.Construtor.ConstrutorCelular;
import br.com.SoftwarePR.Redes.Construtor.ConstrutorImpressora;
import br.com.SoftwarePR.Redes.Construtor.ConstrutorMaquinas;
import br.com.SoftwarePR.Redes.Construtor.ConstrutorRoteador;
import br.com.SoftwarePR.Redes.TelaMenu.TelaMenu;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Paulo Ricardo
 */
public class telaGerarRelatorios extends javax.swing.JFrame {

    /**
     * Creates new form telaGerarRelatorios
     */
    public telaGerarRelatorios() {
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

        jPanel1 = new javax.swing.JPanel();
        txtEscolhaRelatorio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Relatórios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txtEscolhaRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEscolhaRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celulares", "Impressoras", "Maquinas", "Roteadores", "" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tipo de Relatório :");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Gerar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenu.setText("MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText("PR Softwares");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEscolhaRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnMenu)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEscolhaRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String rel = txtEscolhaRelatorio.getSelectedItem().toString();

        switch (rel) {
            case "Celulares" ->
                relatoriosCelulares();
            case "Impressoras" ->
                relatoriosImpressoras();
            case "Maquinas" ->
                relatoriosMaquinas();
            case "Roteadores" ->
                realtoriosRoteadores();
            default ->
                JOptionPane.showMessageDialog(null, "Selecione um Relatorio", "Relatorio", 0);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        TelaMenu menu = new TelaMenu();
        menu.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void relatoriosCelulares() {
        ConexaoBanco Banco = new ConexaoBanco();

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Salvar Arquivos Como");
        int retorno = chooser.showSaveDialog(this);
        
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File CAMINHO_ARQUIVO = chooser.getSelectedFile();

            List<ConstrutorCelular> lista = Banco.RelatorioCelular();

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO));
                if (lista.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Não Foi Encontrado Nenhum Dados para o Relotorio ", "Relatorio", 2);

                } else {
                    for (ConstrutorCelular linha : lista) {

                        writer.write(
                                linha.getId() + " ; "
                                + linha.getNome() + " ; "
                                + linha.getFuncao() + " ; "
                                + linha.getUa() + " ; "
                                + linha.getCelular() + " ; "
                                + linha.getTelefone() + " ; "
                                + linha.getModelo() + " ; "
                                + linha.getSerial() + " ; "
                                + linha.getImei() + " ; "
                                + linha.getPatrimonio() + " ; "
                                + linha.getEmail() + " ; "
                                + linha.getSenhaemail() + " ; "
                                + linha.getSenha() + "\n"
                        );

                        writer.newLine();
                        writer.close();

                    }
                    JOptionPane.showMessageDialog(null, "Relatorio Gerado Com Sucesso", "Relatorio", 1);
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Gerar o Relataroio", "Relatorio", 0);

            }
        }

    }

    private void relatoriosImpressoras() {
        ConexaoBanco Banco = new ConexaoBanco();

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Salvar Arquivos Como");
        int retorno = chooser.showSaveDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            File CAMINHO_ARQUIVO = chooser.getSelectedFile();

            List<ConstrutorImpressora> lista = Banco.RelatorioImpressora();

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO));

                if (lista.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Não Foi Encontrado Nenhum Dados para o Relatorio ", "Relatorio", 2);

                } else {
                    for (ConstrutorImpressora linha : lista) {
                        writer.write(
                                linha.getId() + " ; "
                                + linha.getGest() + " ; "
                                + linha.getIp() + " ; "
                                + linha.getUa() + " ; "
                                + linha.getLocal() + "\n"
                        );

                        writer.newLine();
                        writer.close();

                    }
                    JOptionPane.showMessageDialog(null, "Relatorio Gerado Com Sucesso", "Relatorio", 1);

                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Gerar o Relataroio", "Relatorio", 0);

            }

        }

    }

    private void relatoriosMaquinas() {
        ConexaoBanco Banco = new ConexaoBanco();

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Salvar Arquivos Como");
        int retorno = chooser.showSaveDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            File CAMINHO_ARQUIVO = chooser.getSelectedFile();

            List<ConstrutorMaquinas> lista = Banco.RelatorioMaquinas();

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO));

                if (lista.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Não Foi Encontrado Nenhum Dados para o Relatorio ", "Relatorio", 2);

                } else {
                    for (ConstrutorMaquinas linha : lista) {
                        writer.write(
                                linha.getId() + " ; "
                                + linha.getHostname() + " ; "
                                + linha.getColaborador() + " ; "
                                + linha.getUa() + " ; "
                                + linha.getEquipamento() + " ; "
                                + linha.getModelo() + " ; "
                                + linha.getSistema() + " ; "
                                + linha.getSsd() + " ; "
                                + linha.getRam() + " ; "
                                + linha.getSerial() + " ; "
                                + linha.getPatrimonio() + "\n"
                        );

                        writer.newLine();
                        writer.close();

                    }
                    JOptionPane.showMessageDialog(null, "Relatorio Gerado Com Sucesso", "Relatorio", 1);

                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Gerar o Relataroio", "Relatorio", 0);

            }
        }
    }

    private void realtoriosRoteadores() {
        ConexaoBanco Banco = new ConexaoBanco();

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Salvar Arquivos Como");
        int retorno = chooser.showSaveDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            File CAMINHO_ARQUIVO = chooser.getSelectedFile();

            List<ConstrutorRoteador> lista = Banco.RelatorioRoteador();

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO));

                if (lista.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Não Foi Encontrado Nenhum Dados para o Relatorio ", "Relatorio", 2);

                } else {
                    for (ConstrutorRoteador linha : lista) {
                        writer.write(
                                linha.getId() + " ; "
                                + linha.getUa() + " ; "
                                + linha.getNomeRede() + " ; "
                                + linha.getUsuarioAdm() + " ; "
                                + linha.getSenhaAdm() + " ; "
                                + linha.getSenhaRede() + " ; "
                                + linha.getObservacao() + "\n"
                        );

                        writer.newLine();
                        writer.close();

                    }
                    JOptionPane.showMessageDialog(null, "Relatorio Gerado Com Sucesso", "Relatorio", 1);

                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Gerar o Relataroio", "Relatorio", 0);

            }

        }

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
            java.util.logging.Logger.getLogger(telaGerarRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGerarRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGerarRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGerarRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGerarRelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> txtEscolhaRelatorio;
    // End of variables declaration//GEN-END:variables
}
