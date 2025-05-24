package MenuTelas;
import javax.swing.JFrame;

public class TelaLogin extends javax.swing.JFrame {
    
    private JFrame frame;
    
    public TelaLogin() {
        initComponents();
        setResizable(false);
    }
    
    public TelaLogin(JFrame frame){
        this();
        frame.setVisible(false);
        this.frame = frame;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tituloMenuLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        areaLoginLabel = new javax.swing.JLabel();
        esqueceuSenhaButton = new javax.swing.JButton();
        senhaPasswordField = new javax.swing.JPasswordField();
        entrarButton = new javax.swing.JButton();
        criarContaButton = new javax.swing.JButton();
        mostrarSenhaButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 155, 37, -1));

        tituloMenuLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloMenuLabel.setForeground(new java.awt.Color(0, 20, 137));
        tituloMenuLabel.setText("SIGA VIAGEM");
        tituloMenuLabel.setMaximumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setMinimumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setPreferredSize(new java.awt.Dimension(320, 75));
        getContentPane().add(tituloMenuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 320, 80));

        loginLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(0, 20, 137));
        loginLabel.setText("LOGIN");
        getContentPane().add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, -1));

        loginTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginTextField.setMinimumSize(new java.awt.Dimension(75, 30));
        loginTextField.setPreferredSize(new java.awt.Dimension(75, 30));
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 240, 50));

        senhaLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(0, 20, 137));
        senhaLabel.setText("SENHA");
        getContentPane().add(senhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        areaLoginLabel.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        areaLoginLabel.setForeground(new java.awt.Color(0, 20, 137));
        areaLoginLabel.setText("ÁREA DE LOGIN");
        getContentPane().add(areaLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 210, 40));

        esqueceuSenhaButton.setBackground(new java.awt.Color(0, 152, 218));
        esqueceuSenhaButton.setFont(new java.awt.Font("Impact", 2, 16)); // NOI18N
        esqueceuSenhaButton.setForeground(new java.awt.Color(0, 20, 137));
        esqueceuSenhaButton.setText("ESQUECEU  A SENHA?");
        esqueceuSenhaButton.setContentAreaFilled(false);
        esqueceuSenhaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        esqueceuSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esqueceuSenhaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(esqueceuSenhaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 240, 50));

        senhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        senhaPasswordField.setPreferredSize(new java.awt.Dimension(75, 30));
        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 240, 50));

        entrarButton.setBackground(new java.awt.Color(0, 20, 137));
        entrarButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        entrarButton.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton.setText("ENTRAR");
        entrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(entrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 240, 50));

        criarContaButton.setBackground(new java.awt.Color(0, 20, 137));
        criarContaButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        criarContaButton.setForeground(new java.awt.Color(255, 255, 255));
        criarContaButton.setText("CRIAR CONTA");
        criarContaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        criarContaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarContaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(criarContaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 240, 50));

        mostrarSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenhaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarSenhaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 20, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImagens/login.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

    private void esqueceuSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqueceuSenhaButtonActionPerformed
        TelaEsqueceuSenha janelaEsqueceuSenha  = new TelaEsqueceuSenha();
        janelaEsqueceuSenha.setVisible(true);
    }//GEN-LAST:event_esqueceuSenhaButtonActionPerformed

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        TelaMenuUsuario janelaMenuUsuario = new TelaMenuUsuario(this);
        janelaMenuUsuario.setVisible(true);
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void criarContaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarContaButtonActionPerformed
        CriarConta janelaConta = new CriarConta(this);
        janelaConta.setVisible(true);
    }//GEN-LAST:event_criarContaButtonActionPerformed
private boolean mostrarSenha = false;
    private void mostrarSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenhaButtonActionPerformed
        // TODO add your handling code here:
        if(mostrarSenha){
            senhaPasswordField.setEchoChar('•');
            mostrarSenhaButton.setText("Mostrar Senha");
            mostrarSenha = false;
        } else{
           senhaPasswordField.setEchoChar((char)0);
            mostrarSenhaButton.setText("Ocultar Senha");
            mostrarSenha = true;
        }
    }//GEN-LAST:event_mostrarSenhaButtonActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaLoginLabel;
    private javax.swing.JButton criarContaButton;
    private javax.swing.JButton entrarButton;
    private javax.swing.JButton esqueceuSenhaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JButton mostrarSenhaButton;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JLabel tituloMenuLabel;
    // End of variables declaration//GEN-END:variables
}
