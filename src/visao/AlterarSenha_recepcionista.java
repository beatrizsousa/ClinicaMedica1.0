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
public class AlterarSenha_recepcionista extends javax.swing.JFrame {

    /**
     * Creates new form AlterarSenha_recepcionista
     */
    public AlterarSenha_recepcionista() {
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

        jLabelAlterarSenha_recepcionista = new javax.swing.JLabel();
        jLabelSenhaAtual_AlterarSenha_recepcionista = new javax.swing.JLabel();
        jTextFieldSenhaAtual_AlterarSenha_recepcionista = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabelNovaSenha_AlterarSenha_medico = new javax.swing.JLabel();
        jLabelConfirmarNovaSenha_AlterarSenha_medico = new javax.swing.JLabel();
        jTextFieldConfirmarNovaSenha_AlterarSenha_medico = new javax.swing.JTextField();
        jButtonSalvar_AlterarSenha_medico = new javax.swing.JButton();
        jButtonCancelar_AlterarSenha_medico = new javax.swing.JButton();
        jButtonLimpar_AlterarSenha_medico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelAlterarSenha_recepcionista.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabelAlterarSenha_recepcionista.setText("Alterar Senha");
        getContentPane().add(jLabelAlterarSenha_recepcionista);
        jLabelAlterarSenha_recepcionista.setBounds(10, 0, 150, 40);

        jLabelSenhaAtual_AlterarSenha_recepcionista.setText("Senha Atual:");
        getContentPane().add(jLabelSenhaAtual_AlterarSenha_recepcionista);
        jLabelSenhaAtual_AlterarSenha_recepcionista.setBounds(10, 40, 80, 30);

        jTextFieldSenhaAtual_AlterarSenha_recepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSenhaAtual_AlterarSenha_recepcionistaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSenhaAtual_AlterarSenha_recepcionista);
        jTextFieldSenhaAtual_AlterarSenha_recepcionista.setBounds(10, 70, 380, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(10, 130, 380, 30);

        jLabelNovaSenha_AlterarSenha_medico.setText("Nova Senha:");
        getContentPane().add(jLabelNovaSenha_AlterarSenha_medico);
        jLabelNovaSenha_AlterarSenha_medico.setBounds(10, 100, 140, 30);

        jLabelConfirmarNovaSenha_AlterarSenha_medico.setText("Confirmar Nova Senha:");
        getContentPane().add(jLabelConfirmarNovaSenha_AlterarSenha_medico);
        jLabelConfirmarNovaSenha_AlterarSenha_medico.setBounds(10, 170, 190, 30);
        getContentPane().add(jTextFieldConfirmarNovaSenha_AlterarSenha_medico);
        jTextFieldConfirmarNovaSenha_AlterarSenha_medico.setBounds(10, 200, 380, 30);

        jButtonSalvar_AlterarSenha_medico.setText("Salvar");
        getContentPane().add(jButtonSalvar_AlterarSenha_medico);
        jButtonSalvar_AlterarSenha_medico.setBounds(130, 260, 80, 30);

        jButtonCancelar_AlterarSenha_medico.setText("Cancelar");
        getContentPane().add(jButtonCancelar_AlterarSenha_medico);
        jButtonCancelar_AlterarSenha_medico.setBounds(310, 260, 80, 30);

        jButtonLimpar_AlterarSenha_medico.setText("Limpar");
        getContentPane().add(jButtonLimpar_AlterarSenha_medico);
        jButtonLimpar_AlterarSenha_medico.setBounds(220, 260, 80, 30);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSenhaAtual_AlterarSenha_recepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSenhaAtual_AlterarSenha_recepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSenhaAtual_AlterarSenha_recepcionistaActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarSenha_recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarSenha_recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarSenha_recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarSenha_recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarSenha_recepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar_AlterarSenha_medico;
    private javax.swing.JButton jButtonLimpar_AlterarSenha_medico;
    private javax.swing.JButton jButtonSalvar_AlterarSenha_medico;
    private javax.swing.JLabel jLabelAlterarSenha_recepcionista;
    private javax.swing.JLabel jLabelConfirmarNovaSenha_AlterarSenha_medico;
    private javax.swing.JLabel jLabelNovaSenha_AlterarSenha_medico;
    private javax.swing.JLabel jLabelSenhaAtual_AlterarSenha_recepcionista;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldConfirmarNovaSenha_AlterarSenha_medico;
    private javax.swing.JTextField jTextFieldSenhaAtual_AlterarSenha_recepcionista;
    // End of variables declaration//GEN-END:variables
}
