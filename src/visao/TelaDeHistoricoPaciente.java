/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author dell
 */
public class TelaDeHistoricoPaciente extends javax.swing.JFrame {

    /**
     * Creates new form TelaPaciente
     */
    public TelaDeHistoricoPaciente() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabelBuscarPaciente_HistoricoPaciente = new javax.swing.JLabel();
        jTextFieldBuscarPaciente_HistoricoPaciente = new javax.swing.JTextField();
        jButtonBusca_HistoricoPaciente = new javax.swing.JButton();
        jLabelHistorico_HistoricoPaciente = new javax.swing.JLabel();
        jTextFieldHistorico_HistoricoPaciente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelTelaDeHistorico_HistoricoPaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(740, 400));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabelBuscarPaciente_HistoricoPaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelBuscarPaciente_HistoricoPaciente.setText("Nome Paciente:");
        jPanel1.add(jLabelBuscarPaciente_HistoricoPaciente);
        jLabelBuscarPaciente_HistoricoPaciente.setBounds(10, 40, 87, 15);
        jPanel1.add(jTextFieldBuscarPaciente_HistoricoPaciente);
        jTextFieldBuscarPaciente_HistoricoPaciente.setBounds(115, 40, 440, 20);

        jButtonBusca_HistoricoPaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonBusca_HistoricoPaciente.setText("Buscar");
        jPanel1.add(jButtonBusca_HistoricoPaciente);
        jButtonBusca_HistoricoPaciente.setBounds(560, 30, 67, 27);

        jLabelHistorico_HistoricoPaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelHistorico_HistoricoPaciente.setText("Histórico:");
        jPanel1.add(jLabelHistorico_HistoricoPaciente);
        jLabelHistorico_HistoricoPaciente.setBounds(20, 80, 80, 20);
        jPanel1.add(jTextFieldHistorico_HistoricoPaciente);
        jTextFieldHistorico_HistoricoPaciente.setBounds(10, 110, 630, 230);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Voltar");
        jPanel1.add(jButton1);
        jButton1.setBounds(530, 360, 65, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 63, 683, 390);

        jLabelTelaDeHistorico_HistoricoPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTelaDeHistorico_HistoricoPaciente.setText("Histórico Paciente");
        getContentPane().add(jLabelTelaDeHistorico_HistoricoPaciente);
        jLabelTelaDeHistorico_HistoricoPaciente.setBounds(280, 10, 150, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaDeHistoricoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeHistoricoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeHistoricoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeHistoricoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeHistoricoPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBusca_HistoricoPaciente;
    private javax.swing.JLabel jLabelBuscarPaciente_HistoricoPaciente;
    private javax.swing.JLabel jLabelHistorico_HistoricoPaciente;
    private javax.swing.JLabel jLabelTelaDeHistorico_HistoricoPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBuscarPaciente_HistoricoPaciente;
    private javax.swing.JTextField jTextFieldHistorico_HistoricoPaciente;
    // End of variables declaration//GEN-END:variables
}
