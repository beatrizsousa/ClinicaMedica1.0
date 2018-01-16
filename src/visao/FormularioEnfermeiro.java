/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.DaoEnfermeiro;
import modelo.Enfermeiro;

/**
 *
 * @author Anderson
 */
public class FormularioEnfermeiro extends javax.swing.JFrame {

    /**
     * Creates new form FormularioEnfermeiro
     */
    public FormularioEnfermeiro() {
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
        jLabelNome_CadEnfermeiro = new javax.swing.JLabel();
        jLabelCPF_CadEnfermeiro = new javax.swing.JLabel();
        jLabelEndereco_CadEnfermeiro = new javax.swing.JLabel();
        jLabelNumero_CadEnfermeiro = new javax.swing.JLabel();
        jLabelBairro_CadEnfermeiro = new javax.swing.JLabel();
        jLabelNascimento_CadEnfermeiro = new javax.swing.JLabel();
        jLabelCEP_CadEnfermeiro = new javax.swing.JLabel();
        jLabelCidade_CadEnfermeiro = new javax.swing.JLabel();
        jLabelTelefone_CadEnfermeiro = new javax.swing.JLabel();
        jTextFieldNome_CadEnfermeiro = new javax.swing.JTextField();
        jTextFieldCPF_CadEnfermeiro = new javax.swing.JTextField();
        jTextFieldEndereco_CadEnfermeiro = new javax.swing.JTextField();
        jTextFieldNumero_CadEnfermeiro = new javax.swing.JTextField();
        jTextFieldBairro_CadEnfermeiro = new javax.swing.JTextField();
        jTextFieldCEP_CadEnfermeiro = new javax.swing.JTextField();
        jTextFieldNascimento_CadEnfermeiro = new javax.swing.JTextField();
        jTextFieldTelefone_CadEnfermeiro = new javax.swing.JTextField();
        jTextFieldCidade_CadEnfermeiro = new javax.swing.JTextField();
        jLabelEstado_CadEnfermeiro = new javax.swing.JLabel();
        jComboBoxEstado_CadEnfermeiro = new javax.swing.JComboBox<>();
        jLabelSexo_CadEnfermeiro = new javax.swing.JLabel();
        jComboBoxSexo_CadEnfermeiro = new javax.swing.JComboBox<>();
        jLabelCOREN_CadEnfermeiro = new javax.swing.JLabel();
        jTextFieldCOREN_CadEnfermeiro = new javax.swing.JTextField();
        jButtonSalvar_CadEnfermeiro = new javax.swing.JButton();
        jButtonCancelar_CadEnfermeiro = new javax.swing.JButton();
        jButtonLimpar_FormularioEnfermeiro = new javax.swing.JButton();
        jLabelCadastroDeEnfermeiros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        CadastroDeEnfermeiros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CadastroDeEnfermeiros.setLayout(null);

        jLabelNome_CadEnfermeiro.setText("Nome:");
        CadastroDeEnfermeiros.add(jLabelNome_CadEnfermeiro);
        jLabelNome_CadEnfermeiro.setBounds(20, 40, 60, 30);

        jLabelCPF_CadEnfermeiro.setText("CPF:");
        CadastroDeEnfermeiros.add(jLabelCPF_CadEnfermeiro);
        jLabelCPF_CadEnfermeiro.setBounds(20, 80, 60, 30);

        jLabelEndereco_CadEnfermeiro.setText("Endereço:");
        CadastroDeEnfermeiros.add(jLabelEndereco_CadEnfermeiro);
        jLabelEndereco_CadEnfermeiro.setBounds(20, 120, 100, 30);

        jLabelNumero_CadEnfermeiro.setText("Nº");
        CadastroDeEnfermeiros.add(jLabelNumero_CadEnfermeiro);
        jLabelNumero_CadEnfermeiro.setBounds(620, 120, 30, 30);

        jLabelBairro_CadEnfermeiro.setText("Bairro:");
        CadastroDeEnfermeiros.add(jLabelBairro_CadEnfermeiro);
        jLabelBairro_CadEnfermeiro.setBounds(20, 170, 60, 30);

        jLabelNascimento_CadEnfermeiro.setText("Nascimento:");
        CadastroDeEnfermeiros.add(jLabelNascimento_CadEnfermeiro);
        jLabelNascimento_CadEnfermeiro.setBounds(420, 220, 120, 30);

        jLabelCEP_CadEnfermeiro.setText("CEP:");
        CadastroDeEnfermeiros.add(jLabelCEP_CadEnfermeiro);
        jLabelCEP_CadEnfermeiro.setBounds(410, 170, 80, 30);

        jLabelCidade_CadEnfermeiro.setText("Cidade:");
        CadastroDeEnfermeiros.add(jLabelCidade_CadEnfermeiro);
        jLabelCidade_CadEnfermeiro.setBounds(20, 220, 120, 30);

        jLabelTelefone_CadEnfermeiro.setText("Telefone:");
        CadastroDeEnfermeiros.add(jLabelTelefone_CadEnfermeiro);
        jLabelTelefone_CadEnfermeiro.setBounds(240, 270, 140, 30);
        CadastroDeEnfermeiros.add(jTextFieldNome_CadEnfermeiro);
        jTextFieldNome_CadEnfermeiro.setBounds(60, 40, 650, 27);
        CadastroDeEnfermeiros.add(jTextFieldCPF_CadEnfermeiro);
        jTextFieldCPF_CadEnfermeiro.setBounds(60, 80, 220, 30);
        CadastroDeEnfermeiros.add(jTextFieldEndereco_CadEnfermeiro);
        jTextFieldEndereco_CadEnfermeiro.setBounds(80, 120, 500, 30);
        CadastroDeEnfermeiros.add(jTextFieldNumero_CadEnfermeiro);
        jTextFieldNumero_CadEnfermeiro.setBounds(640, 120, 70, 30);
        CadastroDeEnfermeiros.add(jTextFieldBairro_CadEnfermeiro);
        jTextFieldBairro_CadEnfermeiro.setBounds(60, 170, 240, 30);
        CadastroDeEnfermeiros.add(jTextFieldCEP_CadEnfermeiro);
        jTextFieldCEP_CadEnfermeiro.setBounds(440, 170, 270, 30);

        jTextFieldNascimento_CadEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNascimento_CadEnfermeiroActionPerformed(evt);
            }
        });
        CadastroDeEnfermeiros.add(jTextFieldNascimento_CadEnfermeiro);
        jTextFieldNascimento_CadEnfermeiro.setBounds(490, 220, 220, 30);
        CadastroDeEnfermeiros.add(jTextFieldTelefone_CadEnfermeiro);
        jTextFieldTelefone_CadEnfermeiro.setBounds(290, 270, 200, 30);
        CadastroDeEnfermeiros.add(jTextFieldCidade_CadEnfermeiro);
        jTextFieldCidade_CadEnfermeiro.setBounds(60, 220, 250, 30);

        jLabelEstado_CadEnfermeiro.setText("Estado:");
        CadastroDeEnfermeiros.add(jLabelEstado_CadEnfermeiro);
        jLabelEstado_CadEnfermeiro.setBounds(20, 270, 100, 30);

        jComboBoxEstado_CadEnfermeiro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));
        CadastroDeEnfermeiros.add(jComboBoxEstado_CadEnfermeiro);
        jComboBoxEstado_CadEnfermeiro.setBounds(70, 270, 100, 30);

        jLabelSexo_CadEnfermeiro.setText("Sexo:");
        CadastroDeEnfermeiros.add(jLabelSexo_CadEnfermeiro);
        jLabelSexo_CadEnfermeiro.setBounds(550, 270, 60, 30);

        jComboBoxSexo_CadEnfermeiro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "               ", "Masculino", "Feminino", "Outro" }));
        CadastroDeEnfermeiros.add(jComboBoxSexo_CadEnfermeiro);
        jComboBoxSexo_CadEnfermeiro.setBounds(580, 270, 130, 30);

        jLabelCOREN_CadEnfermeiro.setText("COREN:");
        CadastroDeEnfermeiros.add(jLabelCOREN_CadEnfermeiro);
        jLabelCOREN_CadEnfermeiro.setBounds(470, 320, 80, 30);
        CadastroDeEnfermeiros.add(jTextFieldCOREN_CadEnfermeiro);
        jTextFieldCOREN_CadEnfermeiro.setBounds(520, 320, 190, 30);

        jButtonSalvar_CadEnfermeiro.setText("Salvar");
        jButtonSalvar_CadEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar_CadEnfermeiroActionPerformed(evt);
            }
        });
        CadastroDeEnfermeiros.add(jButtonSalvar_CadEnfermeiro);
        jButtonSalvar_CadEnfermeiro.setBounds(320, 390, 110, 30);

        jButtonCancelar_CadEnfermeiro.setText("Cancelar");
        jButtonCancelar_CadEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar_CadEnfermeiroActionPerformed(evt);
            }
        });
        CadastroDeEnfermeiros.add(jButtonCancelar_CadEnfermeiro);
        jButtonCancelar_CadEnfermeiro.setBounds(590, 390, 110, 30);

        jButtonLimpar_FormularioEnfermeiro.setText("Limpar");
        jButtonLimpar_FormularioEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpar_FormularioEnfermeiroActionPerformed(evt);
            }
        });
        CadastroDeEnfermeiros.add(jButtonLimpar_FormularioEnfermeiro);
        jButtonLimpar_FormularioEnfermeiro.setBounds(450, 390, 110, 30);

        getContentPane().add(CadastroDeEnfermeiros);
        CadastroDeEnfermeiros.setBounds(10, 37, 733, 439);

        jLabelCadastroDeEnfermeiros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCadastroDeEnfermeiros.setText("Cadastro de Enfermeiros");
        getContentPane().add(jLabelCadastroDeEnfermeiros);
        jLabelCadastroDeEnfermeiros.setBounds(10, 0, 150, 40);

        setSize(new java.awt.Dimension(769, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNascimento_CadEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNascimento_CadEnfermeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNascimento_CadEnfermeiroActionPerformed

    private void jButtonSalvar_CadEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar_CadEnfermeiroActionPerformed
        Enfermeiro enfermeiro = new Enfermeiro();
        DaoEnfermeiro daoEnfermeiro = new DaoEnfermeiro();
        
        if(!jTextFieldNome_CadEnfermeiro.getText().isEmpty() 
                || !jTextFieldCPF_CadEnfermeiro.getText().isEmpty() 
                || !jTextFieldEndereco_CadEnfermeiro.getText().isEmpty() 
                || !jTextFieldNumero_CadEnfermeiro.getText().isEmpty() 
                || !jTextFieldBairro_CadEnfermeiro.getText().isEmpty() 
                || !jTextFieldCEP_CadEnfermeiro.getText().isEmpty() 
                || !jTextFieldCidade_CadEnfermeiro.getText().isEmpty() 
                || jComboBoxEstado_CadEnfermeiro.getSelectedItem() != null 
                || !jTextFieldNascimento_CadEnfermeiro.getText().isEmpty()
                || !jTextFieldTelefone_CadEnfermeiro.getText().isEmpty() 
                || jComboBoxSexo_CadEnfermeiro.getSelectedItem() != null
         ) {
            
            enfermeiro.setNome(jTextFieldNome_CadEnfermeiro.getText());
            enfermeiro.setCpf(jTextFieldCPF_CadEnfermeiro.getText());
            enfermeiro.setRua(jTextFieldEndereco_CadEnfermeiro.getText());
            enfermeiro.setNumero(jTextFieldNumero_CadEnfermeiro.getText());
            enfermeiro.setBairro(jTextFieldBairro_CadEnfermeiro.getText());
            enfermeiro.setCep(jTextFieldCEP_CadEnfermeiro.getText());
            enfermeiro.setCidade(jTextFieldCidade_CadEnfermeiro.getText());
            enfermeiro.setEstado(jComboBoxEstado_CadEnfermeiro.getSelectedItem().toString());
            enfermeiro.setNascimento(jTextFieldNascimento_CadEnfermeiro.getText());
            enfermeiro.setTelefone(jTextFieldTelefone_CadEnfermeiro.getText());
            enfermeiro.setSexo(jComboBoxSexo_CadEnfermeiro.getSelectedItem().toString());
            enfermeiro.setCoren(jTextFieldCOREN_CadEnfermeiro.getText());
            

            try {
                daoEnfermeiro.adicionaEnfermeiro(enfermeiro);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormularioEnfermeiro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        dispose();
        PrincipalAdm.main(null);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
        }
    }//GEN-LAST:event_jButtonSalvar_CadEnfermeiroActionPerformed

    private void jButtonCancelar_CadEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar_CadEnfermeiroActionPerformed
       PrincipalAdm.main(null);
       dispose();
    }//GEN-LAST:event_jButtonCancelar_CadEnfermeiroActionPerformed

    private void jButtonLimpar_FormularioEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpar_FormularioEnfermeiroActionPerformed
        jTextFieldBairro_CadEnfermeiro.setText("");
        jTextFieldCEP_CadEnfermeiro.setText("");
        jTextFieldCOREN_CadEnfermeiro.setText("");
        jTextFieldCPF_CadEnfermeiro.setText("");
        jTextFieldCidade_CadEnfermeiro.setText("");
        jTextFieldEndereco_CadEnfermeiro.setText("");
        jTextFieldNascimento_CadEnfermeiro.setText("");
        jTextFieldNome_CadEnfermeiro.setText("");
        jTextFieldNumero_CadEnfermeiro.setText("");
        jTextFieldNumero_CadEnfermeiro.setText("");
        jTextFieldTelefone_CadEnfermeiro.setText("");
    }//GEN-LAST:event_jButtonLimpar_FormularioEnfermeiroActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioEnfermeiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroDeEnfermeiros;
    private javax.swing.JButton jButtonCancelar_CadEnfermeiro;
    private javax.swing.JButton jButtonLimpar_FormularioEnfermeiro;
    private javax.swing.JButton jButtonSalvar_CadEnfermeiro;
    private javax.swing.JComboBox<String> jComboBoxEstado_CadEnfermeiro;
    private javax.swing.JComboBox<String> jComboBoxSexo_CadEnfermeiro;
    private javax.swing.JLabel jLabelBairro_CadEnfermeiro;
    private javax.swing.JLabel jLabelCEP_CadEnfermeiro;
    private javax.swing.JLabel jLabelCOREN_CadEnfermeiro;
    private javax.swing.JLabel jLabelCPF_CadEnfermeiro;
    private javax.swing.JLabel jLabelCadastroDeEnfermeiros;
    private javax.swing.JLabel jLabelCidade_CadEnfermeiro;
    private javax.swing.JLabel jLabelEndereco_CadEnfermeiro;
    private javax.swing.JLabel jLabelEstado_CadEnfermeiro;
    private javax.swing.JLabel jLabelNascimento_CadEnfermeiro;
    private javax.swing.JLabel jLabelNome_CadEnfermeiro;
    private javax.swing.JLabel jLabelNumero_CadEnfermeiro;
    private javax.swing.JLabel jLabelSexo_CadEnfermeiro;
    private javax.swing.JLabel jLabelTelefone_CadEnfermeiro;
    private javax.swing.JTextField jTextFieldBairro_CadEnfermeiro;
    private javax.swing.JTextField jTextFieldCEP_CadEnfermeiro;
    private javax.swing.JTextField jTextFieldCOREN_CadEnfermeiro;
    private javax.swing.JTextField jTextFieldCPF_CadEnfermeiro;
    private javax.swing.JTextField jTextFieldCidade_CadEnfermeiro;
    private javax.swing.JTextField jTextFieldEndereco_CadEnfermeiro;
    private javax.swing.JTextField jTextFieldNascimento_CadEnfermeiro;
    private javax.swing.JTextField jTextFieldNome_CadEnfermeiro;
    private javax.swing.JTextField jTextFieldNumero_CadEnfermeiro;
    private javax.swing.JTextField jTextFieldTelefone_CadEnfermeiro;
    // End of variables declaration//GEN-END:variables
}
