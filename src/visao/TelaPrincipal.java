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
public class TelaPrincipal extends javax.swing.JFrame {

   //ConexaoBD conecta = new ConexaoBD();
   
    public TelaPrincipal() {
        initComponents();
        //conecta.conexao();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelDoInternalFrame = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAgendaDoBemVindo = new javax.swing.JButton();
        jButtonEnfermeiroDoBemVindo = new javax.swing.JButton();
        jButtonMedicoDoBemVindo = new javax.swing.JButton();
        jButtonPacienteDoBemVindo = new javax.swing.JButton();
        jLabelDoInternalFrame = new javax.swing.JLabel();
        jButtonSairDoInternalFrame = new javax.swing.JButton();
        jLabelFundoTelaPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadMedico = new javax.swing.JMenuItem();
        jMenuItemCadPacientes = new javax.swing.JMenuItem();
        jMenuItemCadEnfermeiros = new javax.swing.JMenuItem();
        jMenuItemCadUsuarios = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        Ferramentas = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelDoInternalFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDoInternalFrame.setLayout(null);

        jLabel2.setText("Cadastros - ");
        jPanelDoInternalFrame.add(jLabel2);
        jLabel2.setBounds(10, 20, 100, 14);

        jButtonAgendaDoBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agenda.png"))); // NOI18N
        jButtonAgendaDoBemVindo.setToolTipText("Agenda");
        jPanelDoInternalFrame.add(jButtonAgendaDoBemVindo);
        jButtonAgendaDoBemVindo.setBounds(360, 150, 90, 80);

        jButtonEnfermeiroDoBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/enfermeiro.png"))); // NOI18N
        jButtonEnfermeiroDoBemVindo.setToolTipText("Cadastro de Enfermeiros");
        jButtonEnfermeiroDoBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnfermeiroDoBemVindoActionPerformed(evt);
            }
        });
        jPanelDoInternalFrame.add(jButtonEnfermeiroDoBemVindo);
        jButtonEnfermeiroDoBemVindo.setBounds(260, 150, 90, 80);

        jButtonMedicoDoBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/medico.png"))); // NOI18N
        jButtonMedicoDoBemVindo.setToolTipText("Cadastro de Médicos");
        jButtonMedicoDoBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedicoDoBemVindoActionPerformed(evt);
            }
        });
        jPanelDoInternalFrame.add(jButtonMedicoDoBemVindo);
        jButtonMedicoDoBemVindo.setBounds(360, 60, 90, 80);

        jButtonPacienteDoBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        jButtonPacienteDoBemVindo.setToolTipText("Cadastro de Pacientes");
        jPanelDoInternalFrame.add(jButtonPacienteDoBemVindo);
        jButtonPacienteDoBemVindo.setBounds(260, 60, 90, 80);

        jInternalFrameBemVindo.getContentPane().add(jPanelDoInternalFrame);
        jPanelDoInternalFrame.setBounds(0, 50, 730, 340);

        jLabelDoInternalFrame.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDoInternalFrame.setText("Sistema de Gerenciamento de:");
        jInternalFrameBemVindo.getContentPane().add(jLabelDoInternalFrame);
        jLabelDoInternalFrame.setBounds(10, -20, 250, 90);

        jButtonSairDoInternalFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar.png"))); // NOI18N
        jButtonSairDoInternalFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDoInternalFrameActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonSairDoInternalFrame);
        jButtonSairDoInternalFrame.setBounds(660, 0, 60, 50);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 40, 750, 420);

        jLabelFundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ae.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoTelaPrincipal);
        jLabelFundoTelaPrincipal.setBounds(0, 0, 750, 470);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadMedico.setText("Medicos");
        jMenuItemCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadMedico);

        jMenuItemCadPacientes.setText("Pacientes");
        jMenuItemCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPacientesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadPacientes);

        jMenuItemCadEnfermeiros.setText("Enfermeiros");
        jMenuItemCadEnfermeiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadEnfermeirosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadEnfermeiros);

        jMenuItemCadUsuarios.setText("Usuarios");
        jMenuCadastro.add(jMenuItemCadUsuarios);

        jMenuBar1.add(jMenuCadastro);

        jMenuRelatorios.setText("Relatorios");
        jMenuBar1.add(jMenuRelatorios);

        Ferramentas.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        Ferramentas.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(Ferramentas);

        jMenu1.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(769, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
       TelaPrincipal tela = new TelaPrincipal();
       tela.setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jButtonSairDoInternalFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDoInternalFrameActionPerformed
       jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonSairDoInternalFrameActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
       //conecta.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonMedicoDoBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedicoDoBemVindoActionPerformed
        FormularioMedico form = new FormularioMedico();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonMedicoDoBemVindoActionPerformed

    private void jMenuItemCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicoActionPerformed
        FormularioMedico form = new FormularioMedico();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemCadMedicoActionPerformed

    private void jButtonEnfermeiroDoBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnfermeiroDoBemVindoActionPerformed
        FormularioEnfermeiro form = new FormularioEnfermeiro();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonEnfermeiroDoBemVindoActionPerformed

    private void jMenuItemCadEnfermeirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadEnfermeirosActionPerformed
       FormularioEnfermeiro form_enf = new FormularioEnfermeiro();
       form_enf.setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuItemCadEnfermeirosActionPerformed

    private void jMenuItemCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPacientesActionPerformed
       FormularioPaciente form_pac = new FormularioPaciente();
       form_pac.setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuItemCadPacientesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ferramentas;
    private javax.swing.JButton jButtonAgendaDoBemVindo;
    private javax.swing.JButton jButtonEnfermeiroDoBemVindo;
    private javax.swing.JButton jButtonMedicoDoBemVindo;
    private javax.swing.JButton jButtonPacienteDoBemVindo;
    private javax.swing.JButton jButtonSairDoInternalFrame;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDoInternalFrame;
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCadEnfermeiros;
    private javax.swing.JMenuItem jMenuItemCadMedico;
    private javax.swing.JMenuItem jMenuItemCadPacientes;
    private javax.swing.JMenuItem jMenuItemCadUsuarios;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JPanel jPanelDoInternalFrame;
    // End of variables declaration//GEN-END:variables
}
