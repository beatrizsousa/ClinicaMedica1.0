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
public class FormularioRecepcionista extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FormularioRecepcionista() {
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

        CadastroDeEnfermeiros = new javax.swing.JPanel();
        jLabelNome_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelCPF_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelEndereco_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelNumero_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelBairro_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelNascimento_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelCEP_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelCidade_FormularioRecepcionista = new javax.swing.JLabel();
        jLabelTelefone_FormularioRecepcionista = new javax.swing.JLabel();
        jTextFieldNome_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldCPF_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldEndereco_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldNumero_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldBairro_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldCEP_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldNascimento_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldTelefone_FormularioRecepcionista = new javax.swing.JTextField();
        jTextFieldCidade_FormularioRecepcionista = new javax.swing.JTextField();
        jLabelEstado_FormularioRecepcionista = new javax.swing.JLabel();
        jComboBoxEstado_FormularioRecepcionista = new javax.swing.JComboBox<>();
        jLabelSexo_FormularioRecepcionista = new javax.swing.JLabel();
        jComboBoxSexo_FormularioRecepcionista = new javax.swing.JComboBox<>();
        jButtonSalvar_FormularioRecepcionista = new javax.swing.JButton();
        jButtonCancelar_FormularioRecepcionista = new javax.swing.JButton();
        jButtonLimpar_FormularioRecepcionista = new javax.swing.JButton();
        jLabelCadastroPacientes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        CadastroDeEnfermeiros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CadastroDeEnfermeiros.setLayout(null);

        jLabelNome_FormularioRecepcionista.setText("Nome:");
        CadastroDeEnfermeiros.add(jLabelNome_FormularioRecepcionista);
        jLabelNome_FormularioRecepcionista.setBounds(10, 0, 60, 30);

        jLabelCPF_FormularioRecepcionista.setText("CPF:");
        CadastroDeEnfermeiros.add(jLabelCPF_FormularioRecepcionista);
        jLabelCPF_FormularioRecepcionista.setBounds(10, 60, 60, 30);

        jLabelEndereco_FormularioRecepcionista.setText("Endereço:");
        CadastroDeEnfermeiros.add(jLabelEndereco_FormularioRecepcionista);
        jLabelEndereco_FormularioRecepcionista.setBounds(240, 60, 100, 30);

        jLabelNumero_FormularioRecepcionista.setText("Nº");
        CadastroDeEnfermeiros.add(jLabelNumero_FormularioRecepcionista);
        jLabelNumero_FormularioRecepcionista.setBounds(260, 120, 30, 30);

        jLabelBairro_FormularioRecepcionista.setText("Bairro:");
        CadastroDeEnfermeiros.add(jLabelBairro_FormularioRecepcionista);
        jLabelBairro_FormularioRecepcionista.setBounds(10, 120, 60, 30);

        jLabelNascimento_FormularioRecepcionista.setText("Nascimento:");
        CadastroDeEnfermeiros.add(jLabelNascimento_FormularioRecepcionista);
        jLabelNascimento_FormularioRecepcionista.setBounds(10, 240, 120, 30);

        jLabelCEP_FormularioRecepcionista.setText("CEP:");
        CadastroDeEnfermeiros.add(jLabelCEP_FormularioRecepcionista);
        jLabelCEP_FormularioRecepcionista.setBounds(340, 120, 80, 30);

        jLabelCidade_FormularioRecepcionista.setText("Cidade:");
        CadastroDeEnfermeiros.add(jLabelCidade_FormularioRecepcionista);
        jLabelCidade_FormularioRecepcionista.setBounds(10, 180, 120, 30);

        jLabelTelefone_FormularioRecepcionista.setText("Telefone:");
        CadastroDeEnfermeiros.add(jLabelTelefone_FormularioRecepcionista);
        jLabelTelefone_FormularioRecepcionista.setBounds(250, 240, 140, 30);
        CadastroDeEnfermeiros.add(jTextFieldNome_FormularioRecepcionista);
        jTextFieldNome_FormularioRecepcionista.setBounds(10, 30, 690, 27);
        CadastroDeEnfermeiros.add(jTextFieldCPF_FormularioRecepcionista);
        jTextFieldCPF_FormularioRecepcionista.setBounds(10, 90, 220, 30);
        CadastroDeEnfermeiros.add(jTextFieldEndereco_FormularioRecepcionista);
        jTextFieldEndereco_FormularioRecepcionista.setBounds(240, 90, 470, 30);
        CadastroDeEnfermeiros.add(jTextFieldNumero_FormularioRecepcionista);
        jTextFieldNumero_FormularioRecepcionista.setBounds(260, 150, 70, 30);
        CadastroDeEnfermeiros.add(jTextFieldBairro_FormularioRecepcionista);
        jTextFieldBairro_FormularioRecepcionista.setBounds(10, 150, 240, 30);
        CadastroDeEnfermeiros.add(jTextFieldCEP_FormularioRecepcionista);
        jTextFieldCEP_FormularioRecepcionista.setBounds(340, 150, 370, 30);

        jTextFieldNascimento_FormularioRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNascimento_FormularioRecepcionistaActionPerformed(evt);
            }
        });
        CadastroDeEnfermeiros.add(jTextFieldNascimento_FormularioRecepcionista);
        jTextFieldNascimento_FormularioRecepcionista.setBounds(10, 270, 220, 30);
        CadastroDeEnfermeiros.add(jTextFieldTelefone_FormularioRecepcionista);
        jTextFieldTelefone_FormularioRecepcionista.setBounds(250, 270, 260, 30);
        CadastroDeEnfermeiros.add(jTextFieldCidade_FormularioRecepcionista);
        jTextFieldCidade_FormularioRecepcionista.setBounds(10, 210, 320, 30);

        jLabelEstado_FormularioRecepcionista.setText("Estado:");
        CadastroDeEnfermeiros.add(jLabelEstado_FormularioRecepcionista);
        jLabelEstado_FormularioRecepcionista.setBounds(340, 180, 100, 30);

        jComboBoxEstado_FormularioRecepcionista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));
        CadastroDeEnfermeiros.add(jComboBoxEstado_FormularioRecepcionista);
        jComboBoxEstado_FormularioRecepcionista.setBounds(340, 210, 130, 30);

        jLabelSexo_FormularioRecepcionista.setText("Sexo:");
        CadastroDeEnfermeiros.add(jLabelSexo_FormularioRecepcionista);
        jLabelSexo_FormularioRecepcionista.setBounds(480, 180, 60, 30);

        jComboBoxSexo_FormularioRecepcionista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "               ", "Masculino", "Feminino", "Outro" }));
        CadastroDeEnfermeiros.add(jComboBoxSexo_FormularioRecepcionista);
        jComboBoxSexo_FormularioRecepcionista.setBounds(480, 210, 230, 30);

        jButtonSalvar_FormularioRecepcionista.setText("Salvar");
        jButtonSalvar_FormularioRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar_FormularioRecepcionistaActionPerformed(evt);
            }
        });
        CadastroDeEnfermeiros.add(jButtonSalvar_FormularioRecepcionista);
        jButtonSalvar_FormularioRecepcionista.setBounds(330, 380, 110, 40);

        jButtonCancelar_FormularioRecepcionista.setText("Cancelar");
        jButtonCancelar_FormularioRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar_FormularioRecepcionistaActionPerformed(evt);
            }
        });
        CadastroDeEnfermeiros.add(jButtonCancelar_FormularioRecepcionista);
        jButtonCancelar_FormularioRecepcionista.setBounds(590, 380, 100, 40);

        jButtonLimpar_FormularioRecepcionista.setText("Limpar");
        jButtonLimpar_FormularioRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpar_FormularioRecepcionistaActionPerformed(evt);
            }
        });
        CadastroDeEnfermeiros.add(jButtonLimpar_FormularioRecepcionista);
        jButtonLimpar_FormularioRecepcionista.setBounds(460, 380, 110, 40);

        getContentPane().add(CadastroDeEnfermeiros);
        CadastroDeEnfermeiros.setBounds(10, 40, 733, 439);

        jLabelCadastroPacientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCadastroPacientes.setText("Cadastro de Pacientes");
        getContentPane().add(jLabelCadastroPacientes);
        jLabelCadastroPacientes.setBounds(10, 0, 280, 40);

        setSize(new java.awt.Dimension(769, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNascimento_FormularioRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNascimento_FormularioRecepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNascimento_FormularioRecepcionistaActionPerformed

    private void jButtonSalvar_FormularioRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar_FormularioRecepcionistaActionPerformed
        Recepcionista recepcionista = new Recepcionista();
        DaoRecepcionista daoRecepcionista = new DaoRecepcionista();

        if(!jTextFieldNome_FormularioRecepcionista.getText().isEmpty()
            || !jTextFieldCPF_FormularioRecepcionista.getText().isEmpty()
            || !jTextFieldEndereco_FormularioRecepcionista.getText().isEmpty()
            || !jTextFieldNumero_FormularioRecepcionista.getText().isEmpty()
            || !jTextFieldBairro_FormularioRecepcionista.getText().isEmpty()
            || !jTextFieldCEP_FormularioRecepcionista.getText().isEmpty()
            || !jTextFieldCidade_FormularioRecepcionista.getText().isEmpty()
            || jComboBoxEstado_FormularioRecepcionista.getSelectedItem() != null
            || !jTextFieldNascimento_FormularioRecepcionista.getText().isEmpty()
            || !jTextFieldTelefone_FormularioRecepcionista.getText().isEmpty()
            || jComboBoxSexo_FormularioRecepcionista.getSelectedItem() != null
        ) {

            recepcionista.setNome(jTextFieldNome_FormularioRecepcionista.getText());
            recepcionista.setCpf(jTextFieldCPF_FormularioRecepcionista.getText());
            recepcionista.setRua(jTextFieldEndereco_FormularioRecepcionista.getText());
            recepcionista.setNumero(jTextFieldNumero_FormularioRecepcionista.getText());
            recepcionista.setBairro(jTextFieldBairro_FormularioRecepcionista.getText());
            recepcionista.setCep(jTextFieldCEP_FormularioRecepcionista.getText());
            recepcionista.setCidade(jTextFieldCidade_FormularioRecepcionista.getText());
            recepcionista.setEstado(jComboBoxEstado_FormularioRecepcionista.getSelectedItem().toString());
            recepcionista.setNascimento(jTextFieldNascimento_FormularioRecepcionista.getText());
            recepcionista.setTelefone(jTextFieldTelefone_FormularioRecepcionista.getText());
            recepcionista.setSexo(jComboBoxSexo_FormularioRecepcionista.getSelectedItem().toString());
            recepcionista.setCoren(jTextFieldCOREN_CadEnfermeiro.getText());

            try {
                daoEnfermeiro.adicionaEnfermeiro(recepcionista);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormularioEnfermeiro.class.getName()).log(Level.SEVERE, null, ex);
            }

            dispose();
            PrincipalAdm.main(null);
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
        }
    }//GEN-LAST:event_jButtonSalvar_FormularioRecepcionistaActionPerformed

    private void jButtonCancelar_FormularioRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar_FormularioRecepcionistaActionPerformed
        PrincipalAdm.main(null);
        dispose();
    }//GEN-LAST:event_jButtonCancelar_FormularioRecepcionistaActionPerformed

    private void jButtonLimpar_FormularioRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpar_FormularioRecepcionistaActionPerformed
        jTextFieldBairro_FormularioRecepcionista.setText("");
        jTextFieldCEP_FormularioRecepcionista.setText("");
        jTextFieldCPF_FormularioRecepcionista.setText("");
        jTextFieldCidade_FormularioRecepcionista.setText("");
        jTextFieldEndereco_FormularioRecepcionista.setText("");
        jTextFieldNascimento_FormularioRecepcionista.setText("");
        jTextFieldNome_FormularioRecepcionista.setText("");
        jTextFieldNumero_FormularioRecepcionista.setText("");
        jTextFieldNumero_FormularioRecepcionista.setText("");
        jTextFieldTelefone_FormularioRecepcionista.setText("");
    }//GEN-LAST:event_jButtonLimpar_FormularioRecepcionistaActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioRecepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroDeEnfermeiros;
    private javax.swing.JButton jButtonCancelar_FormularioRecepcionista;
    private javax.swing.JButton jButtonLimpar_FormularioRecepcionista;
    private javax.swing.JButton jButtonSalvar_FormularioRecepcionista;
    private javax.swing.JComboBox<String> jComboBoxEstado_FormularioRecepcionista;
    private javax.swing.JComboBox<String> jComboBoxSexo_FormularioRecepcionista;
    private javax.swing.JLabel jLabelBairro_FormularioRecepcionista;
    private javax.swing.JLabel jLabelCEP_FormularioRecepcionista;
    private javax.swing.JLabel jLabelCPF_FormularioRecepcionista;
    private javax.swing.JLabel jLabelCadastroPacientes;
    private javax.swing.JLabel jLabelCidade_FormularioRecepcionista;
    private javax.swing.JLabel jLabelEndereco_FormularioRecepcionista;
    private javax.swing.JLabel jLabelEstado_FormularioRecepcionista;
    private javax.swing.JLabel jLabelNascimento_FormularioRecepcionista;
    private javax.swing.JLabel jLabelNome_FormularioRecepcionista;
    private javax.swing.JLabel jLabelNumero_FormularioRecepcionista;
    private javax.swing.JLabel jLabelSexo_FormularioRecepcionista;
    private javax.swing.JLabel jLabelTelefone_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldBairro_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldCEP_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldCPF_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldCidade_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldEndereco_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldNascimento_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldNome_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldNumero_FormularioRecepcionista;
    private javax.swing.JTextField jTextFieldTelefone_FormularioRecepcionista;
    // End of variables declaration//GEN-END:variables
}
