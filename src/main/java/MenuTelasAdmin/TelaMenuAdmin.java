package MenuTelasAdmin;
import javax.swing.JFrame;

public class TelaMenuAdmin extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaMenuAdmin() {
        initComponents();
        setResizable(false);
    }

    public TelaMenuAdmin(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tituloMenuLabel = new javax.swing.JLabel();
        alterarUsuarioButton = new javax.swing.JButton();
        configuracoesButton = new javax.swing.JButton();
        estatisticasButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        jogarButton = new javax.swing.JButton();
        imagemAdministradorLabel = new javax.swing.JLabel();
        selecionarFaseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Admin");
        setMinimumSize(new java.awt.Dimension(960, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Imagens/logoMaua.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 230, 110));

        tituloMenuLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloMenuLabel.setForeground(new java.awt.Color(0, 20, 137));
        tituloMenuLabel.setText("SIGA VIAGEM");
        tituloMenuLabel.setMaximumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setMinimumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setPreferredSize(new java.awt.Dimension(320, 75));
        getContentPane().add(tituloMenuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 80));

        alterarUsuarioButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        alterarUsuarioButton.setForeground(new java.awt.Color(0, 20, 137));
        alterarUsuarioButton.setText("ALTERAR USUÁRIO");
        alterarUsuarioButton.setBorder(null);
        alterarUsuarioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alterarUsuarioButton.setMaximumSize(new java.awt.Dimension(75, 25));
        alterarUsuarioButton.setMinimumSize(new java.awt.Dimension(75, 25));
        alterarUsuarioButton.setPreferredSize(new java.awt.Dimension(75, 25));
        alterarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarUsuarioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alterarUsuarioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 220, 60));

        configuracoesButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        configuracoesButton.setForeground(new java.awt.Color(0, 20, 137));
        configuracoesButton.setText("CONFIGURAÇÕES");
        configuracoesButton.setBorder(null);
        configuracoesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configuracoesButton.setMaximumSize(new java.awt.Dimension(75, 25));
        configuracoesButton.setMinimumSize(new java.awt.Dimension(75, 25));
        configuracoesButton.setPreferredSize(new java.awt.Dimension(75, 25));
        configuracoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracoesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(configuracoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 220, 60));

        estatisticasButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        estatisticasButton.setForeground(new java.awt.Color(0, 20, 137));
        estatisticasButton.setText("ESTATÍSTICAS");
        estatisticasButton.setBorder(null);
        estatisticasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estatisticasButton.setMaximumSize(new java.awt.Dimension(75, 25));
        estatisticasButton.setMinimumSize(new java.awt.Dimension(75, 25));
        estatisticasButton.setPreferredSize(new java.awt.Dimension(75, 25));
        estatisticasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estatisticasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(estatisticasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 220, 60));

        sairButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        sairButton.setForeground(new java.awt.Color(0, 20, 137));
        sairButton.setText("SAIR");
        sairButton.setBorder(null);
        sairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairButton.setMaximumSize(new java.awt.Dimension(75, 25));
        sairButton.setMinimumSize(new java.awt.Dimension(75, 25));
        sairButton.setPreferredSize(new java.awt.Dimension(75, 25));
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sairButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 220, 60));

        jogarButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jogarButton.setForeground(new java.awt.Color(0, 20, 137));
        jogarButton.setText("JOGAR");
        jogarButton.setBorder(null);
        jogarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jogarButton.setMaximumSize(new java.awt.Dimension(75, 25));
        jogarButton.setMinimumSize(new java.awt.Dimension(75, 25));
        jogarButton.setPreferredSize(new java.awt.Dimension(75, 25));
        jogarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jogarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 220, 60));

        imagemAdministradorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuAdmin.png"))); // NOI18N
        getContentPane().add(imagemAdministradorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 580, 450));

        selecionarFaseButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        selecionarFaseButton.setForeground(new java.awt.Color(0, 20, 137));
        selecionarFaseButton.setText("SELECIONAR FASE");
        selecionarFaseButton.setBorder(null);
        selecionarFaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecionarFaseButton.setMaximumSize(new java.awt.Dimension(75, 25));
        selecionarFaseButton.setMinimumSize(new java.awt.Dimension(75, 25));
        selecionarFaseButton.setPreferredSize(new java.awt.Dimension(75, 25));
        selecionarFaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarFaseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(selecionarFaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 220, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jogarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jogarButtonActionPerformed

    private void alterarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarUsuarioButtonActionPerformed
        AlterarUsuario janelaAlterar = new AlterarUsuario(this);
        janelaAlterar.setVisible(true);
    }//GEN-LAST:event_alterarUsuarioButtonActionPerformed

    private void configuracoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracoesButtonActionPerformed
        TelaConfiguracoesAdmin janelaConfiguracoes = new TelaConfiguracoesAdmin(this);
        janelaConfiguracoes.setVisible(true);
    }//GEN-LAST:event_configuracoesButtonActionPerformed

    private void estatisticasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estatisticasButtonActionPerformed
        TelaEstatisticaAdmin janelaEstatistica = new TelaEstatisticaAdmin(this);
        janelaEstatistica.setVisible(true);
    }//GEN-LAST:event_estatisticasButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void selecionarFaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarFaseButtonActionPerformed
        SelecionarFaseAdmin janelaSelecionar  = new SelecionarFaseAdmin(this);
        janelaSelecionar.setVisible(true);
    }//GEN-LAST:event_selecionarFaseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarUsuarioButton;
    private javax.swing.JButton configuracoesButton;
    private javax.swing.JButton estatisticasButton;
    private javax.swing.JLabel imagemAdministradorLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jogarButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton selecionarFaseButton;
    private javax.swing.JLabel tituloMenuLabel;
    // End of variables declaration//GEN-END:variables
}
