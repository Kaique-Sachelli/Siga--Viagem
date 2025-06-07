package MenuTelasAdmin;

import Persistencia.DAO;
import Modelo.Usuario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList; 


public class AlterarUsuario extends javax.swing.JFrame {
    private boolean senhaAlterada;
    private void obterUsuarios(){
        try{
            var dao = new DAO();
            var usuarios = dao.obterUsuarios();
            usuariosComboBox.setModel(
                new DefaultComboBoxModel<Usuario>(usuarios.toArray(new Usuario[]{}))
            );
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Lista de usuarios não disponivel");
            
        }
    
    }

    
    private JFrame frame;
    
    public AlterarUsuario() {
        initComponents();
        setResizable(false);
        obterUsuarios();
        senhaTextField.setEditable(false);
        instrutorTextField.setEditable(false);
        loginTextField.setEditable(false);
        
        senhaTextField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener(){
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                senhaAlterada = true;
            }
            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                senhaAlterada = false;
            }
            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                senhaAlterada = true;
            }
            
        });   
    }

    public AlterarUsuario(JFrame frame) {
        this.frame = frame;
        this.frame.setVisible(false);
        initComponents();
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloMenuLabel = new javax.swing.JLabel();
        voltarMenuButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usuariosComboBox = new javax.swing.JComboBox<Usuario>();
        instrutorTextField = new javax.swing.JTextField();
        loginTextField = new javax.swing.JTextField();
        senhaTextField = new javax.swing.JTextField();
        alterarSenhaBotton = new javax.swing.JButton();
        alterarCategoriaButton = new javax.swing.JButton();
        apagarUsuarioButton = new javax.swing.JButton();
        confirmarButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar usuário");
        setMinimumSize(new java.awt.Dimension(620, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloMenuLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloMenuLabel.setForeground(new java.awt.Color(0, 20, 137));
        tituloMenuLabel.setText("ALTERAR USUÁRIO");
        tituloMenuLabel.setMaximumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setMinimumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setPreferredSize(new java.awt.Dimension(320, 75));
        getContentPane().add(tituloMenuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 430, 80));

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
        getContentPane().add(voltarMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 220, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImagens/logoMaua.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 230, 110));

        usuariosComboBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        usuariosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(usuariosComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 480, 60));

        instrutorTextField.setText("CATEGORIA");
        instrutorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrutorTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(instrutorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 280, 50));

        loginTextField.setBackground(new java.awt.Color(255, 255, 255));
        loginTextField.setText("LOGIN");
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 280, 50));

        senhaTextField.setText("SENHA");
        senhaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 280, 50));

        alterarSenhaBotton.setText("Alterar Senha");
        alterarSenhaBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaBottonActionPerformed(evt);
            }
        });
        getContentPane().add(alterarSenhaBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 200, 50));

        alterarCategoriaButton.setText("Alterar Categoria");
        alterarCategoriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCategoriaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alterarCategoriaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 200, 50));

        apagarUsuarioButton.setText("Apagar usuario");
        apagarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarUsuarioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(apagarUsuarioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 200, 50));

        confirmarButton1.setBackground(new java.awt.Color(0, 20, 137));
        confirmarButton1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        confirmarButton1.setForeground(new java.awt.Color(255, 255, 255));
        confirmarButton1.setText("CONFIRMAR");
        confirmarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 290, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

    private void instrutorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrutorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instrutorTextFieldActionPerformed

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void senhaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextFieldActionPerformed
        
    }//GEN-LAST:event_senhaTextFieldActionPerformed

    private void alterarSenhaBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaBottonActionPerformed
        senhaTextField.setEditable(true);
        senhaTextField.requestFocus();
        senhaTextField.setText("");
        
        
        
    }//GEN-LAST:event_alterarSenhaBottonActionPerformed

    private void alterarCategoriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCategoriaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alterarCategoriaButtonActionPerformed

    private void apagarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarUsuarioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apagarUsuarioButtonActionPerformed

    private void usuariosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosComboBoxActionPerformed
        var selecionado = (Usuario) usuariosComboBox.getSelectedItem();
        if (selecionado != null){
            try{
            var dao = new DAO();
            dao.buscarUsuario(selecionado.getId());
            loginTextField.setText(selecionado.getLogin());
            senhaTextField.setText(selecionado.getSenha());
            if(selecionado.getInstrutor()){
                instrutorTextField.setText("Instrutor");
            }
            else{
                instrutorTextField.setText("Operador");
            }
            
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Dados de usuarios não disponíveis");
            
            }
        }
                
               
    }//GEN-LAST:event_usuariosComboBoxActionPerformed

    private void confirmarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButton1ActionPerformed
        if(senhaAlterada = true){
            var novaSenha = senhaTextField.getText();
            var selecionado = (Usuario) usuariosComboBox.getSelectedItem();
           try{
               var dao = new DAO();
               var atualizou = dao.atualizaSenha(novaSenha,selecionado.getId());
               if(atualizou){
                    JOptionPane.showMessageDialog(null, "Atualização concluida com sucesso!");     
               }
                   
           }
           catch(Exception e){
               e.printStackTrace();
               JOptionPane.showMessageDialog(null, "Atualização de dados não disponivel."); 
               
           }
        }
    }//GEN-LAST:event_confirmarButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarUsuario().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarCategoriaButton;
    private javax.swing.JButton alterarSenhaBotton;
    private javax.swing.JButton apagarUsuarioButton;
    private javax.swing.JButton confirmarButton1;
    private javax.swing.JTextField instrutorTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JTextField senhaTextField;
    private javax.swing.JLabel tituloMenuLabel;
    private javax.swing.JComboBox<Usuario> usuariosComboBox;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
