/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.DaoPaciente;
import modelo.Paciente;
import modelo.Pessoa;


/**
 *
 * @author dell
 */
public class FormularioPaciente_recepcionista extends javax.swing.JFrame {

    /**
     * Creates new form FormularioPaciente
     */
    public FormularioPaciente_recepcionista() {
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

        jLabelCadastroPaciente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNome_FormularioPaciente = new javax.swing.JLabel();
        jTextFieldNome_FormularioPaciente = new javax.swing.JTextField();
        jLabelRua_FormularioPaciente = new javax.swing.JLabel();
        jTextFieldCPF_FormularioPaciente = new javax.swing.JTextField();
        jLabelCPF_FormularioPaciente = new javax.swing.JLabel();
        jTextFieldRua_FormularioPaciente = new javax.swing.JTextField();
        jLabelDataNascimento_FormularioPaciente = new javax.swing.JLabel();
        jTextFieldDataNascimento_FormularioPaciente = new javax.swing.JTextField();
        jLabelSexo_FormularioPaciente = new javax.swing.JLabel();
        jComboBoxSexo_FormularioPaciente = new javax.swing.JComboBox<>();
        jLabelSUS_FormularioPaciente = new javax.swing.JLabel();
        jLabelMaeNomeMae_FormularioPaciente = new javax.swing.JLabel();
        jTextFieldNomeMae_FormularioPaciente = new javax.swing.JTextField();
        jLabelNomePai_FormularioPaciente = new javax.swing.JLabel();
        jTextFieldNomePai_FormularioPaciente = new javax.swing.JTextField();
        jLabelProfissao_FormularioPaciente = new javax.swing.JLabel();
        jTextFieldProfissao_FormularioPaciente = new javax.swing.JTextField();
        jLabelEstadoCivil_FormularioPaciente = new javax.swing.JLabel();
        jComboBoxEstadoCivil_FormularioPaciente = new javax.swing.JComboBox<>();
        jLabelNumero_FormularioPaciente = new javax.swing.JLabel();
        jTextFieldBairro_FormularioPaciente = new javax.swing.JTextField();
        jLabelBairro_FormularioPaciente = new javax.swing.JLabel();
        jLabelCidade_FormularioPaciente = new javax.swing.JLabel();
        jTextFieldCidade_FormularioPaciente = new javax.swing.JTextField();
        jLabelEstado_FormularioPaciente = new javax.swing.JLabel();
        jLabelCEP_FormularioPaciente = new javax.swing.JLabel();
        jTextFieldCEP_FormularioPaciente = new javax.swing.JTextField();
        jLabelTelefone_FormularioPaciente = new javax.swing.JLabel();
        jTextFieldTelefone_FormularioPaciente = new javax.swing.JTextField();
        jTextFieldObservacao_FormularioPaciente = new javax.swing.JTextField();
        jComboBoxEstado_FormularioPaciente = new javax.swing.JComboBox<>();
        jButtonSalvar_FormularioPaciente = new javax.swing.JButton();
        jButtonCancelar_FormularioPaciente = new javax.swing.JButton();
        jTextFieldSUS_FormularioPaciente = new javax.swing.JTextField();
        jTextFieldNumero_FormularioPaciente = new javax.swing.JTextField();
        jLabelObservacao_FormularioPaciente = new javax.swing.JLabel();
        jButtonLimpar_FormularioPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelCadastroPaciente.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabelCadastroPaciente.setText("Cadastro de Paciente");
        getContentPane().add(jLabelCadastroPaciente);
        jLabelCadastroPaciente.setBounds(10, 0, 210, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabelNome_FormularioPaciente.setText("Nome");
        jPanel1.add(jLabelNome_FormularioPaciente);
        jLabelNome_FormularioPaciente.setBounds(20, 4, 130, 20);

        jTextFieldNome_FormularioPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNome_FormularioPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNome_FormularioPaciente);
        jTextFieldNome_FormularioPaciente.setBounds(20, 30, 580, 30);

        jLabelRua_FormularioPaciente.setText("Rua");
        jPanel1.add(jLabelRua_FormularioPaciente);
        jLabelRua_FormularioPaciente.setBounds(20, 240, 70, 30);
        jPanel1.add(jTextFieldCPF_FormularioPaciente);
        jTextFieldCPF_FormularioPaciente.setBounds(20, 90, 210, 30);

        jLabelCPF_FormularioPaciente.setText("CPF");
        jPanel1.add(jLabelCPF_FormularioPaciente);
        jLabelCPF_FormularioPaciente.setBounds(20, 60, 80, 30);
        jPanel1.add(jTextFieldRua_FormularioPaciente);
        jTextFieldRua_FormularioPaciente.setBounds(20, 270, 350, 30);

        jLabelDataNascimento_FormularioPaciente.setText("Data de Nascimento");
        jPanel1.add(jLabelDataNascimento_FormularioPaciente);
        jLabelDataNascimento_FormularioPaciente.setBounds(280, 60, 100, 30);
        jPanel1.add(jTextFieldDataNascimento_FormularioPaciente);
        jTextFieldDataNascimento_FormularioPaciente.setBounds(280, 90, 210, 30);

        jLabelSexo_FormularioPaciente.setText("Sexo");
        jPanel1.add(jLabelSexo_FormularioPaciente);
        jLabelSexo_FormularioPaciente.setBounds(620, 30, 80, 30);

        jComboBoxSexo_FormularioPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro", " " }));
        jComboBoxSexo_FormularioPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexo_FormularioPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxSexo_FormularioPaciente);
        jComboBoxSexo_FormularioPaciente.setBounds(660, 30, 120, 30);

        jLabelSUS_FormularioPaciente.setText("Nº SUS");
        jPanel1.add(jLabelSUS_FormularioPaciente);
        jLabelSUS_FormularioPaciente.setBounds(280, 120, 50, 30);

        jLabelMaeNomeMae_FormularioPaciente.setText("Nome da mãe");
        jPanel1.add(jLabelMaeNomeMae_FormularioPaciente);
        jLabelMaeNomeMae_FormularioPaciente.setBounds(400, 180, 100, 30);
        jPanel1.add(jTextFieldNomeMae_FormularioPaciente);
        jTextFieldNomeMae_FormularioPaciente.setBounds(400, 210, 380, 30);

        jLabelNomePai_FormularioPaciente.setText("Nome do pai");
        jPanel1.add(jLabelNomePai_FormularioPaciente);
        jLabelNomePai_FormularioPaciente.setBounds(20, 180, 90, 30);
        jPanel1.add(jTextFieldNomePai_FormularioPaciente);
        jTextFieldNomePai_FormularioPaciente.setBounds(20, 210, 350, 30);

        jLabelProfissao_FormularioPaciente.setText("Profissão");
        jPanel1.add(jLabelProfissao_FormularioPaciente);
        jLabelProfissao_FormularioPaciente.setBounds(20, 120, 70, 30);
        jPanel1.add(jTextFieldProfissao_FormularioPaciente);
        jTextFieldProfissao_FormularioPaciente.setBounds(20, 150, 210, 30);

        jLabelEstadoCivil_FormularioPaciente.setText("Estado Civil");
        jPanel1.add(jLabelEstadoCivil_FormularioPaciente);
        jLabelEstadoCivil_FormularioPaciente.setBounds(520, 120, 130, 30);

        jComboBoxEstadoCivil_FormularioPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Solteiro (a)", "Casado (a)", "Divorciado (a)", "Viuvo (a)" }));
        jPanel1.add(jComboBoxEstadoCivil_FormularioPaciente);
        jComboBoxEstadoCivil_FormularioPaciente.setBounds(520, 150, 260, 30);

        jLabelNumero_FormularioPaciente.setText("Número");
        jPanel1.add(jLabelNumero_FormularioPaciente);
        jLabelNumero_FormularioPaciente.setBounds(620, 300, 150, 30);

        jTextFieldBairro_FormularioPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairro_FormularioPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldBairro_FormularioPaciente);
        jTextFieldBairro_FormularioPaciente.setBounds(390, 330, 210, 30);

        jLabelBairro_FormularioPaciente.setText("Bairro");
        jPanel1.add(jLabelBairro_FormularioPaciente);
        jLabelBairro_FormularioPaciente.setBounds(390, 300, 90, 30);

        jLabelCidade_FormularioPaciente.setText("Cidade");
        jPanel1.add(jLabelCidade_FormularioPaciente);
        jLabelCidade_FormularioPaciente.setBounds(400, 240, 150, 30);
        jPanel1.add(jTextFieldCidade_FormularioPaciente);
        jTextFieldCidade_FormularioPaciente.setBounds(400, 270, 380, 30);

        jLabelEstado_FormularioPaciente.setText("Estado");
        jPanel1.add(jLabelEstado_FormularioPaciente);
        jLabelEstado_FormularioPaciente.setBounds(223, 300, 40, 30);

        jLabelCEP_FormularioPaciente.setText("CEP");
        jPanel1.add(jLabelCEP_FormularioPaciente);
        jLabelCEP_FormularioPaciente.setBounds(20, 300, 40, 30);
        jPanel1.add(jTextFieldCEP_FormularioPaciente);
        jTextFieldCEP_FormularioPaciente.setBounds(20, 330, 180, 30);

        jLabelTelefone_FormularioPaciente.setText("Telefone");
        jPanel1.add(jLabelTelefone_FormularioPaciente);
        jLabelTelefone_FormularioPaciente.setBounds(520, 60, 70, 30);
        jPanel1.add(jTextFieldTelefone_FormularioPaciente);
        jTextFieldTelefone_FormularioPaciente.setBounds(520, 90, 260, 30);
        jPanel1.add(jTextFieldObservacao_FormularioPaciente);
        jTextFieldObservacao_FormularioPaciente.setBounds(20, 390, 760, 60);

        jComboBoxEstado_FormularioPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jPanel1.add(jComboBoxEstado_FormularioPaciente);
        jComboBoxEstado_FormularioPaciente.setBounds(220, 330, 150, 30);

        jButtonSalvar_FormularioPaciente.setText("Salvar");
        jButtonSalvar_FormularioPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar_FormularioPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar_FormularioPaciente);
        jButtonSalvar_FormularioPaciente.setBounds(470, 470, 90, 30);

        jButtonCancelar_FormularioPaciente.setText("Cancelar");
        jButtonCancelar_FormularioPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar_FormularioPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar_FormularioPaciente);
        jButtonCancelar_FormularioPaciente.setBounds(680, 470, 100, 30);
        jPanel1.add(jTextFieldSUS_FormularioPaciente);
        jTextFieldSUS_FormularioPaciente.setBounds(280, 150, 210, 30);
        jPanel1.add(jTextFieldNumero_FormularioPaciente);
        jTextFieldNumero_FormularioPaciente.setBounds(620, 330, 160, 30);

        jLabelObservacao_FormularioPaciente.setText("Observação");
        jPanel1.add(jLabelObservacao_FormularioPaciente);
        jLabelObservacao_FormularioPaciente.setBounds(20, 360, 120, 30);

        jButtonLimpar_FormularioPaciente.setText("Limpar");
        jButtonLimpar_FormularioPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpar_FormularioPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpar_FormularioPaciente);
        jButtonLimpar_FormularioPaciente.setBounds(570, 470, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 800, 520);

        setSize(new java.awt.Dimension(832, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSexo_FormularioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexo_FormularioPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexo_FormularioPacienteActionPerformed

    private void jTextFieldBairro_FormularioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairro_FormularioPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairro_FormularioPacienteActionPerformed

    private void jButtonLimpar_FormularioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpar_FormularioPacienteActionPerformed

    jTextFieldNome_FormularioPaciente.setText("");
    jTextFieldCPF_FormularioPaciente.setText("");
    jTextFieldRua_FormularioPaciente.setText("");
    jTextFieldDataNascimento_FormularioPaciente.setText("");
    jTextFieldSUS_FormularioPaciente.setText("");
    jTextFieldNomeMae_FormularioPaciente.setText("");
    jTextFieldNomePai_FormularioPaciente.setText("");
    jTextFieldProfissao_FormularioPaciente.setText("");
    jTextFieldNumero_FormularioPaciente.setText("");
    jTextFieldBairro_FormularioPaciente.setText("");
    jTextFieldCidade_FormularioPaciente.setText("");
    jTextFieldCEP_FormularioPaciente.setText("");
    jTextFieldTelefone_FormularioPaciente.setText("");
    jTextFieldObservacao_FormularioPaciente.setText("");
    
   

    }//GEN-LAST:event_jButtonLimpar_FormularioPacienteActionPerformed

    private void jTextFieldNome_FormularioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNome_FormularioPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNome_FormularioPacienteActionPerformed

    private void jButtonSalvar_FormularioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar_FormularioPacienteActionPerformed
        
        Paciente pac = new Paciente();
        DaoPaciente daopaciente = new DaoPaciente();
       
        
        if(!jTextFieldBairro_FormularioPaciente.getText().isEmpty() 
                || !jTextFieldCEP_FormularioPaciente.getText().isEmpty() 
                || !jTextFieldCPF_FormularioPaciente.getText().isEmpty() 
                || !jTextFieldCidade_FormularioPaciente.getText().isEmpty() 
                || !jTextFieldDataNascimento_FormularioPaciente.getText().isEmpty() 
                || !jTextFieldNomeMae_FormularioPaciente.getText().isEmpty() 
                || !jTextFieldNomePai_FormularioPaciente.getText().isEmpty() 
                || !jTextFieldNome_FormularioPaciente.getText().isEmpty() 
                || !jTextFieldObservacao_FormularioPaciente.getText().isEmpty()
                || !jTextFieldNumero_FormularioPaciente.getText().isEmpty() 
                || !jTextFieldProfissao_FormularioPaciente.getText().isEmpty() 
                || jComboBoxEstado_FormularioPaciente.getSelectedItem() != null
                || jComboBoxEstadoCivil_FormularioPaciente.getSelectedItem() != null
                || jComboBoxSexo_FormularioPaciente.getSelectedItem() != null
                || !jTextFieldTelefone_FormularioPaciente.getText().isEmpty()
                || !jTextFieldSUS_FormularioPaciente.getText().isEmpty() ) {
            
           pac.setNome(jTextFieldBairro_FormularioPaciente.getText());
           pac.setSexo(jComboBoxSexo_FormularioPaciente.getSelectedItem().toString());
           pac.setCpf(jTextFieldCPF_FormularioPaciente.getText());
            pac.setNascimento(jTextFieldDataNascimento_FormularioPaciente.getText());
            pac.setTelefone(jTextFieldTelefone_FormularioPaciente.getText());
            pac.setProfissao(jTextFieldProfissao_FormularioPaciente.getText());
            pac.setSus(jTextFieldSUS_FormularioPaciente.getText());
            pac.setEstadoCivil(jComboBoxEstadoCivil_FormularioPaciente.getSelectedItem().toString());
            pac.setPai(jTextFieldNomePai_FormularioPaciente.getText());
            pac.setMae(jTextFieldNomeMae_FormularioPaciente.getText());
            pac.setRua(jTextFieldRua_FormularioPaciente.getText());
            pac.setCidade(jTextFieldCidade_FormularioPaciente.getText());
            pac.setCep(jTextFieldCEP_FormularioPaciente.getText());
            pac.setEstado(jComboBoxEstado_FormularioPaciente.getSelectedItem().toString());
            pac.setBairro(jTextFieldBairro_FormularioPaciente.getText());
            pac.setNumero(jTextFieldNumero_FormularioPaciente.getText());
            pac.setObservacao(jTextFieldObservacao_FormularioPaciente.getText());
            try {
                daopaciente.adicionaPaciente(pac);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormularioPaciente_recepcionista.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
         dispose();
        PrincipalAdm.main(null);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
        }
    }//GEN-LAST:event_jButtonSalvar_FormularioPacienteActionPerformed

    private void jButtonCancelar_FormularioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar_FormularioPacienteActionPerformed
         PrincipalRecepcionista prin = new PrincipalRecepcionista();
    prin.setVisible(true);
      dispose(); 
      
    }//GEN-LAST:event_jButtonCancelar_FormularioPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioPaciente_recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPaciente_recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPaciente_recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPaciente_recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPaciente_recepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar_FormularioPaciente;
    private javax.swing.JButton jButtonLimpar_FormularioPaciente;
    private javax.swing.JButton jButtonSalvar_FormularioPaciente;
    private javax.swing.JComboBox<String> jComboBoxEstadoCivil_FormularioPaciente;
    private javax.swing.JComboBox<String> jComboBoxEstado_FormularioPaciente;
    private javax.swing.JComboBox<String> jComboBoxSexo_FormularioPaciente;
    private javax.swing.JLabel jLabelBairro_FormularioPaciente;
    private javax.swing.JLabel jLabelCEP_FormularioPaciente;
    private javax.swing.JLabel jLabelCPF_FormularioPaciente;
    private javax.swing.JLabel jLabelCadastroPaciente;
    private javax.swing.JLabel jLabelCidade_FormularioPaciente;
    private javax.swing.JLabel jLabelDataNascimento_FormularioPaciente;
    private javax.swing.JLabel jLabelEstadoCivil_FormularioPaciente;
    private javax.swing.JLabel jLabelEstado_FormularioPaciente;
    private javax.swing.JLabel jLabelMaeNomeMae_FormularioPaciente;
    private javax.swing.JLabel jLabelNomePai_FormularioPaciente;
    private javax.swing.JLabel jLabelNome_FormularioPaciente;
    private javax.swing.JLabel jLabelNumero_FormularioPaciente;
    private javax.swing.JLabel jLabelObservacao_FormularioPaciente;
    private javax.swing.JLabel jLabelProfissao_FormularioPaciente;
    private javax.swing.JLabel jLabelRua_FormularioPaciente;
    private javax.swing.JLabel jLabelSUS_FormularioPaciente;
    private javax.swing.JLabel jLabelSexo_FormularioPaciente;
    private javax.swing.JLabel jLabelTelefone_FormularioPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBairro_FormularioPaciente;
    private javax.swing.JTextField jTextFieldCEP_FormularioPaciente;
    private javax.swing.JTextField jTextFieldCPF_FormularioPaciente;
    private javax.swing.JTextField jTextFieldCidade_FormularioPaciente;
    private javax.swing.JTextField jTextFieldDataNascimento_FormularioPaciente;
    private javax.swing.JTextField jTextFieldNomeMae_FormularioPaciente;
    private javax.swing.JTextField jTextFieldNomePai_FormularioPaciente;
    private javax.swing.JTextField jTextFieldNome_FormularioPaciente;
    private javax.swing.JTextField jTextFieldNumero_FormularioPaciente;
    private javax.swing.JTextField jTextFieldObservacao_FormularioPaciente;
    private javax.swing.JTextField jTextFieldProfissao_FormularioPaciente;
    private javax.swing.JTextField jTextFieldRua_FormularioPaciente;
    private javax.swing.JTextField jTextFieldSUS_FormularioPaciente;
    private javax.swing.JTextField jTextFieldTelefone_FormularioPaciente;
    // End of variables declaration//GEN-END:variables
}
