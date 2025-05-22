package Telas;

import javax.swing.JFrame;

public class CriarConta extends javax.swing.JFrame {

    private JFrame frame;
    
    public CriarConta() {
        super("Criar conta!");
        initComponents();
        setResizable(false);
        
    }

    public CriarConta(JFrame frame){
        this.frame = frame;
        this.frame.setVisible(false);
        initComponents();
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        criarContaLabel = new javax.swing.JLabel();
        voltarMenuButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        LoginTextField = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        confirmarSenhaPasswordField = new javax.swing.JPasswordField();
        senhaLabel1 = new javax.swing.JLabel();
        novaSenhaPasswordField1 = new javax.swing.JPasswordField();
        confirmarButton = new javax.swing.JButton();
        mostrarSenhaButton = new javax.swing.JButton();
        confirmarSenhaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar Conta!");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        criarContaLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        criarContaLabel.setForeground(new java.awt.Color(0, 20, 137));
        criarContaLabel.setText("CRIAR CONTA");
        getContentPane().add(criarContaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 0, -1, 80));

        voltarMenuButton.setBackground(new java.awt.Color(246, 246, 246));
        voltarMenuButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        voltarMenuButton.setForeground(new java.awt.Color(0, 20, 137));
        voltarMenuButton.setText("VOLTAR");
        voltarMenuButton.setBorder(null);
        voltarMenuButton.setContentAreaFilled(false);
        voltarMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarMenuButton.setMaximumSize(new java.awt.Dimension(75, 25));
        voltarMenuButton.setMinimumSize(new java.awt.Dimension(75, 25));
        voltarMenuButton.setPreferredSize(new java.awt.Dimension(75, 25));
        voltarMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, 220, 60));

        loginLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(0, 20, 137));
        loginLabel.setText("LOGIN:");
        getContentPane().add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, -1));

        LoginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(LoginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 510, 50));

        senhaLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(0, 20, 137));
        senhaLabel.setText("Nova Senha:");
        getContentPane().add(senhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

        confirmarSenhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarSenhaPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarSenhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 510, 50));

        senhaLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        senhaLabel1.setForeground(new java.awt.Color(0, 20, 137));
        senhaLabel1.setText("Confirmar Senha: ");
        getContentPane().add(senhaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));

        novaSenhaPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaSenhaPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(novaSenhaPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 510, 50));

        confirmarButton.setBackground(new java.awt.Color(0, 20, 137));
        confirmarButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        confirmarButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmarButton.setText("CONFIRMAR");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 220, 60));

        mostrarSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenhaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarSenhaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 20, 20));

        confirmarSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarSenhaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarSenhaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 20, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

    private void LoginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginTextFieldActionPerformed
        dispose();
    }//GEN-LAST:event_LoginTextFieldActionPerformed

    private void confirmarSenhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarSenhaPasswordFieldActionPerformed
        dispose();
    }//GEN-LAST:event_confirmarSenhaPasswordFieldActionPerformed

    private void novaSenhaPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaSenhaPasswordField1ActionPerformed
        dispose();
    }//GEN-LAST:event_novaSenhaPasswordField1ActionPerformed

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        TelaLogin loginUsuario = new TelaLogin(this);
        loginUsuario.setVisible(true);
    }//GEN-LAST:event_confirmarButtonActionPerformed
private boolean mostrarSenha = false;
    private void mostrarSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenhaButtonActionPerformed
        // TODO add your handling code here:
        if(mostrarSenha){
            novaSenhaPasswordField1.setEchoChar('•');
            mostrarSenhaButton.setText("Mostrar Senha");
            mostrarSenha = false;
        } else{
            novaSenhaPasswordField1.setEchoChar((char)0);
            mostrarSenhaButton.setText("Ocultar Senha");
            mostrarSenha = true;
        }
    }//GEN-LAST:event_mostrarSenhaButtonActionPerformed
private boolean confirmarSenha = false;
    private void confirmarSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarSenhaButtonActionPerformed
        if(confirmarSenha){
            confirmarSenhaPasswordField.setEchoChar('•');
            confirmarSenhaButton.setText("Mostrar Senha");
            confirmarSenha = false;
        } else{
            confirmarSenhaPasswordField.setEchoChar((char)0);
            confirmarSenhaButton.setText("Ocultar Senha");
            confirmarSenha = true;
        }
    }//GEN-LAST:event_confirmarSenhaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LoginTextField;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JButton confirmarSenhaButton;
    private javax.swing.JPasswordField confirmarSenhaPasswordField;
    private javax.swing.JLabel criarContaLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JButton mostrarSenhaButton;
    private javax.swing.JPasswordField novaSenhaPasswordField1;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JLabel senhaLabel1;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
