/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Anderson
 */
public class PrincipalRecepcionista extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalRecepcionista
     */
    public PrincipalRecepcionista() {
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

        jPanelPrincipalRecepcionista = new javax.swing.JPanel();
        jButtonAgendarConsulta_PrincipalRecepcionista = new javax.swing.JButton();
        jButtonEmitirRelatorio_PrincipalRecepcionista = new javax.swing.JButton();
        jButtonCadastroPaciente_PrincipalRecepcionista = new javax.swing.JButton();
        jButtonSair_PrincipalRecepcionista = new javax.swing.JButton();
        jButtonAlterarSenha_PrincipalRecepcionista = new javax.swing.JButton();
        jLabelBemVindo_PrincipalRecepcionista = new javax.swing.JLabel();
        jLabelGabiruLogo = new javax.swing.JLabel();
        jLabelFundoAzul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelPrincipalRecepcionista.setLayout(null);

        jButtonAgendarConsulta_PrincipalRecepcionista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/AgendarConsulta.png"))); // NOI18N
        jButtonAgendarConsulta_PrincipalRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarConsulta_PrincipalRecepcionistaActionPerformed(evt);
            }
        });
        jPanelPrincipalRecepcionista.add(jButtonAgendarConsulta_PrincipalRecepcionista);
        jButtonAgendarConsulta_PrincipalRecepcionista.setBounds(200, 30, 77, 70);

        jButtonEmitirRelatorio_PrincipalRecepcionista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/EmitirRelatorio.png"))); // NOI18N
        jPanelPrincipalRecepcionista.add(jButtonEmitirRelatorio_PrincipalRecepcionista);
        jButtonEmitirRelatorio_PrincipalRecepcionista.setBounds(160, 110, 73, 70);

        jButtonCadastroPaciente_PrincipalRecepcionista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadPaciente.png"))); // NOI18N
        jButtonCadastroPaciente_PrincipalRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroPaciente_PrincipalRecepcionistaActionPerformed(evt);
            }
        });
        jPanelPrincipalRecepcionista.add(jButtonCadastroPaciente_PrincipalRecepcionista);
        jButtonCadastroPaciente_PrincipalRecepcionista.setBounds(110, 30, 70, 70);

        jButtonSair_PrincipalRecepcionista.setText("Sair");
        jButtonSair_PrincipalRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSair_PrincipalRecepcionistaActionPerformed(evt);
            }
        });
        jPanelPrincipalRecepcionista.add(jButtonSair_PrincipalRecepcionista);
        jButtonSair_PrincipalRecepcionista.setBounds(300, 210, 70, 30);

        jButtonAlterarSenha_PrincipalRecepcionista.setText("Alterar Senha");
        jButtonAlterarSenha_PrincipalRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarSenha_PrincipalRecepcionistaActionPerformed(evt);
            }
        });
        jPanelPrincipalRecepcionista.add(jButtonAlterarSenha_PrincipalRecepcionista);
        jButtonAlterarSenha_PrincipalRecepcionista.setBounds(180, 210, 110, 30);

        getContentPane().add(jPanelPrincipalRecepcionista);
        jPanelPrincipalRecepcionista.setBounds(10, 40, 380, 250);

        jLabelBemVindo_PrincipalRecepcionista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBemVindo_PrincipalRecepcionista.setText("Bem-Vindo, ");
        getContentPane().add(jLabelBemVindo_PrincipalRecepcionista);
        jLabelBemVindo_PrincipalRecepcionista.setBounds(20, 0, 150, 40);

        jLabelGabiruLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RAT7.png"))); // NOI18N
        jLabelGabiruLogo.setToolTipText("Gabiru");
        getContentPane().add(jLabelGabiruLogo);
        jLabelGabiruLogo.setBounds(360, 0, 30, 40);

        jLabelFundoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2e8dd494ade012aa9bcb62519744b4a9.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoAzul);
        jLabelFundoAzul.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroPaciente_PrincipalRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroPaciente_PrincipalRecepcionistaActionPerformed
       
    }//GEN-LAST:event_jButtonCadastroPaciente_PrincipalRecepcionistaActionPerformed

    private void jButtonAgendarConsulta_PrincipalRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarConsulta_PrincipalRecepcionistaActionPerformed
        AgendarConsulta_recepcionista agend = new AgendarConsulta_recepcionista();
        agend.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAgendarConsulta_PrincipalRecepcionistaActionPerformed

    private void jButtonAlterarSenha_PrincipalRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarSenha_PrincipalRecepcionistaActionPerformed
      AlterarSenha_recepcionista altsenha = new AlterarSenha_recepcionista();
       altsenha.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonAlterarSenha_PrincipalRecepcionistaActionPerformed

    private void jButtonSair_PrincipalRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSair_PrincipalRecepcionistaActionPerformed
       Login lo = new Login();
       lo.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonSair_PrincipalRecepcionistaActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalRecepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendarConsulta_PrincipalRecepcionista;
    private javax.swing.JButton jButtonAlterarSenha_PrincipalRecepcionista;
    private javax.swing.JButton jButtonCadastroPaciente_PrincipalRecepcionista;
    private javax.swing.JButton jButtonEmitirRelatorio_PrincipalRecepcionista;
    private javax.swing.JButton jButtonSair_PrincipalRecepcionista;
    private javax.swing.JLabel jLabelBemVindo_PrincipalRecepcionista;
    private javax.swing.JLabel jLabelFundoAzul;
    private javax.swing.JLabel jLabelGabiruLogo;
    private javax.swing.JPanel jPanelPrincipalRecepcionista;
    // End of variables declaration//GEN-END:variables
}
