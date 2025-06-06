package MenuTelas;

import Persistencia.DAO;
import Modelo.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
        nomeLabel = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        confirmarSenhaPasswordField = new javax.swing.JPasswordField();
        confirmarSenhaLabel = new javax.swing.JLabel();
        senhaPasswordField = new javax.swing.JPasswordField();
        confirmarButton = new javax.swing.JButton();
        mostrarSenhaButton = new javax.swing.JButton();
        nomeTextField = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();

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

        nomeLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(0, 20, 137));
        nomeLabel.setText("Nome:");
        getContentPane().add(nomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, -1));

        loginTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 510, 50));

        senhaLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(0, 20, 137));
        senhaLabel.setText(" Senha:");
        getContentPane().add(senhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 30));

        confirmarSenhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        confirmarSenhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarSenhaPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarSenhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 510, 50));

        confirmarSenhaLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        confirmarSenhaLabel.setForeground(new java.awt.Color(0, 20, 137));
        confirmarSenhaLabel.setText("Confirmar Senha: ");
        getContentPane().add(confirmarSenhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 30));

        senhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 510, 50));

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
        getContentPane().add(mostrarSenhaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 20, 20));

        nomeTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 510, 50));

        loginLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(0, 20, 137));
        loginLabel.setText("Login:");
        getContentPane().add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        dispose();
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void confirmarSenhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarSenhaPasswordFieldActionPerformed
        dispose();
    }//GEN-LAST:event_confirmarSenhaPasswordFieldActionPerformed

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
        dispose();
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        try {
            var nome = nomeTextField.getText();
            var login = loginTextField.getText();
            var senha = new String (senhaPasswordField.getPassword());
            var confirmarSenha = new String (confirmarSenhaPasswordField.getPassword());
            
            if (senha.equals(confirmarSenha)){
                var u = new Usuario (nome, login, senha, false);
                var dao = new DAO();

                if(dao.cadastrar(u)) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    var dt = new TelaLogin();
                    dt.setVisible(true);
                    this.dispose();
                }
                else{
                        JOptionPane.showMessageDialog(null, "Cadastro inválido.");
                    }
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Senhas não coincidem");
                
            }
                
        }catch (Exception e){
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Sistema indisponível");
            }
            
    }//GEN-LAST:event_confirmarButtonActionPerformed
private boolean mostrarSenha = false;
    private void mostrarSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenhaButtonActionPerformed
        // TODO add your handling code here:
        if(mostrarSenha){
            senhaPasswordField.setEchoChar('•');
            confirmarSenhaPasswordField.setEchoChar('•');
            mostrarSenhaButton.setText("Mostrar Senha");
            mostrarSenha = false;
        } else{
            senhaPasswordField.setEchoChar((char)0);
            confirmarSenhaPasswordField.setEchoChar((char)0);
            mostrarSenhaButton.setText("Ocultar Senha");
            mostrarSenha = true;
        }
    }//GEN-LAST:event_mostrarSenhaButtonActionPerformed

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        dispose();
    }//GEN-LAST:event_nomeTextFieldActionPerformed

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
    private javax.swing.JButton confirmarButton;
    private javax.swing.JLabel confirmarSenhaLabel;
    private javax.swing.JPasswordField confirmarSenhaPasswordField;
    private javax.swing.JLabel criarContaLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JButton mostrarSenhaButton;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}


