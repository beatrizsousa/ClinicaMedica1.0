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
public class FormularioPaciente extends javax.swing.JFrame {

    /**
     * Creates new form FormularioPaciente
     */
    public FormularioPaciente() {
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

        jLabelCadPaciente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome_CadPaciente = new javax.swing.JTextField();
        jLabelRua_CadPaciente = new javax.swing.JLabel();
        jTextFieldCPF_CadPaciente = new javax.swing.JTextField();
        jLabelCPF_CadPaciente = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabelNasc_CadPaciente = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelSUS_CadPaciente = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabelMae_CadPaciente = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabelPai_CadPaciente = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabelProfissao_CadPaciente = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabelEstCivil_CadPaciente = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabelNumCsa_CadPaciente = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabelBaairro_CadPaciente = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabelCidade_CadPaciente = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabelEstado_CadPaciente = new javax.swing.JLabel();
        jLabelCep_CadPaciente = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabelTelefone_CadPaciente = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabelObs_CadPaciente = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButtonSalvar_CadPaciente = new javax.swing.JButton();
        jButtonCancelar_CadPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelCadPaciente.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabelCadPaciente.setText("Cadastro de Pacientes");
        getContentPane().add(jLabelCadPaciente);
        jLabelCadPaciente.setBounds(290, 10, 190, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setText("Nome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 27, 14);
        jPanel1.add(jTextFieldNome_CadPaciente);
        jTextFieldNome_CadPaciente.setBounds(20, 30, 490, 20);

        jLabelRua_CadPaciente.setText("Rua");
        jPanel1.add(jLabelRua_CadPaciente);
        jLabelRua_CadPaciente.setBounds(10, 220, 19, 14);
        jPanel1.add(jTextFieldCPF_CadPaciente);
        jTextFieldCPF_CadPaciente.setBounds(20, 70, 180, 20);

        jLabelCPF_CadPaciente.setText("CPF");
        jPanel1.add(jLabelCPF_CadPaciente);
        jLabelCPF_CadPaciente.setBounds(20, 50, 19, 14);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(40, 210, 350, 20);

        jLabelNasc_CadPaciente.setText("Data de Nasc.");
        jPanel1.add(jLabelNasc_CadPaciente);
        jLabelNasc_CadPaciente.setBounds(250, 70, 100, 14);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(350, 60, 150, 20);

        jLabel5.setText("Sexo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(570, 30, 40, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(620, 20, 110, 20);

        jLabelSUS_CadPaciente.setText("Nº SUS");
        jPanel1.add(jLabelSUS_CadPaciente);
        jLabelSUS_CadPaciente.setBounds(260, 110, 50, 14);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(320, 100, 180, 20);

        jLabelMae_CadPaciente.setText("Nome da mãe");
        jPanel1.add(jLabelMae_CadPaciente);
        jLabelMae_CadPaciente.setBounds(10, 140, 100, 14);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(110, 140, 500, 20);

        jLabelPai_CadPaciente.setText("Nome do pai");
        jPanel1.add(jLabelPai_CadPaciente);
        jLabelPai_CadPaciente.setBounds(10, 180, 90, 14);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(110, 180, 500, 20);

        jLabelProfissao_CadPaciente.setText("Profissão");
        jPanel1.add(jLabelProfissao_CadPaciente);
        jLabelProfissao_CadPaciente.setBounds(10, 100, 70, 14);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(80, 100, 160, 20);

        jLabelEstCivil_CadPaciente.setText("Estado Civil");
        jPanel1.add(jLabelEstCivil_CadPaciente);
        jLabelEstCivil_CadPaciente.setBounds(520, 70, 80, 14);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Solteiro (a)", "Casado (a)", "Divorciado (a)", "Viuvo (a)" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(610, 60, 110, 20);

        jLabelNumCsa_CadPaciente.setText("Número");
        jPanel1.add(jLabelNumCsa_CadPaciente);
        jLabelNumCsa_CadPaciente.setBounds(400, 220, 37, 14);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9);
        jTextField9.setBounds(460, 210, 80, 20);

        jLabelBaairro_CadPaciente.setText("Bairro");
        jPanel1.add(jLabelBaairro_CadPaciente);
        jLabelBaairro_CadPaciente.setBounds(550, 220, 28, 14);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(600, 210, 130, 20);

        jLabelCidade_CadPaciente.setText("Cidade");
        jPanel1.add(jLabelCidade_CadPaciente);
        jLabelCidade_CadPaciente.setBounds(230, 250, 33, 14);
        jPanel1.add(jTextField11);
        jTextField11.setBounds(280, 240, 110, 20);

        jLabelEstado_CadPaciente.setText("Estado");
        jPanel1.add(jLabelEstado_CadPaciente);
        jLabelEstado_CadPaciente.setBounds(390, 250, 33, 14);

        jLabelCep_CadPaciente.setText("CEP");
        jPanel1.add(jLabelCep_CadPaciente);
        jLabelCep_CadPaciente.setBounds(10, 250, 40, 14);
        jPanel1.add(jTextField12);
        jTextField12.setBounds(40, 240, 180, 20);

        jLabelTelefone_CadPaciente.setText("Telefone");
        jPanel1.add(jLabelTelefone_CadPaciente);
        jLabelTelefone_CadPaciente.setBounds(510, 110, 70, 14);
        jPanel1.add(jTextField13);
        jTextField13.setBounds(580, 100, 140, 20);

        jLabelObs_CadPaciente.setText("Observação do Paciente");
        jPanel1.add(jLabelObs_CadPaciente);
        jLabelObs_CadPaciente.setBounds(10, 280, 117, 14);
        jPanel1.add(jTextField14);
        jTextField14.setBounds(10, 300, 720, 60);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(440, 240, 110, 20);

        jButtonSalvar_CadPaciente.setText("Salvar");
        jPanel1.add(jButtonSalvar_CadPaciente);
        jButtonSalvar_CadPaciente.setBounds(280, 370, 72, 20);

        jButtonCancelar_CadPaciente.setText("Cancelar");
        jPanel1.add(jButtonCancelar_CadPaciente);
        jButtonCancelar_CadPaciente.setBounds(360, 370, 75, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 740, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar_CadPaciente;
    private javax.swing.JButton jButtonSalvar_CadPaciente;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelBaairro_CadPaciente;
    private javax.swing.JLabel jLabelCPF_CadPaciente;
    private javax.swing.JLabel jLabelCadPaciente;
    private javax.swing.JLabel jLabelCep_CadPaciente;
    private javax.swing.JLabel jLabelCidade_CadPaciente;
    private javax.swing.JLabel jLabelEstCivil_CadPaciente;
    private javax.swing.JLabel jLabelEstado_CadPaciente;
    private javax.swing.JLabel jLabelMae_CadPaciente;
    private javax.swing.JLabel jLabelNasc_CadPaciente;
    private javax.swing.JLabel jLabelNumCsa_CadPaciente;
    private javax.swing.JLabel jLabelObs_CadPaciente;
    private javax.swing.JLabel jLabelPai_CadPaciente;
    private javax.swing.JLabel jLabelProfissao_CadPaciente;
    private javax.swing.JLabel jLabelRua_CadPaciente;
    private javax.swing.JLabel jLabelSUS_CadPaciente;
    private javax.swing.JLabel jLabelTelefone_CadPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldCPF_CadPaciente;
    private javax.swing.JTextField jTextFieldNome_CadPaciente;
    // End of variables declaration//GEN-END:variables
}
