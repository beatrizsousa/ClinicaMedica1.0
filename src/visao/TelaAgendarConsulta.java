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
public class TelaAgendarConsulta extends javax.swing.JFrame {

    /**
     * Creates new form TelaAgendarConsulta
     */
    public TelaAgendarConsulta() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabelEspecialidade_AgendarConsulta = new javax.swing.JLabel();
        jComboBoxSelecaoEspecialidade_AgendarConsulta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(740, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 400));
        jPanel1.setLayout(null);

        jLabel1.setText("Agendar Consulta");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(303, 21, 150, 31);

        jLabelEspecialidade_AgendarConsulta.setText("Especialidade");
        jPanel1.add(jLabelEspecialidade_AgendarConsulta);
        jLabelEspecialidade_AgendarConsulta.setBounds(167, 135, 64, 14);

        jComboBoxSelecaoEspecialidade_AgendarConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alergia e Imunologia", "Cardiologia", "Clinico Geral", "Dermatologia", "Gastroenterologia", "Geriatria", "Genecologia", "Mastologia", "Nefrologia", "Neurologia", "Obstetrícia", "Ortopedia e Traumatoligia", "Otorrinolaringologia", "Pediatria", "Pscicologia", "Psiquiatria" }));
        jComboBoxSelecaoEspecialidade_AgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelecaoEspecialidade_AgendarConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxSelecaoEspecialidade_AgendarConsulta);
        jComboBoxSelecaoEspecialidade_AgendarConsulta.setBounds(234, 132, 112, 20);

        jLabel2.setText("Nome do Médico");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(431, 135, 78, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(513, 132, 152, 20);

        jButton1.setText("Próximo");
        jPanel1.add(jButton1);
        jButton1.setBounds(554, 399, 71, 23);

        jButton2.setText("Cancelar");
        jPanel1.add(jButton2);
        jButton2.setBounds(643, 399, 75, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSelecaoEspecialidade_AgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelecaoEspecialidade_AgendarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSelecaoEspecialidade_AgendarConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgendarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSelecaoEspecialidade_AgendarConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEspecialidade_AgendarConsulta;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
