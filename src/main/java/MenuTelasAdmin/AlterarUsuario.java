package MenuTelasAdmin;

import Persistencia.DAO;
import Modelo.Usuario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList; 

public class AlterarUsuario extends javax.swing.JFrame {
    private String categoriaSelecionada;
    private boolean categoriaAlterada; 
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
        loginTextField.setEditable(false);
        categoriaComboBox.addItem("Operario");
        categoriaComboBox.addItem("Instrutor");
        categoriaComboBox.setEnabled(false);
        confirmarButton.setEnabled(false);
        
        
        senhaTextField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener(){
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                senhaAlterada = true;
                var novaSenha = senhaTextField.getText();
                confirmarButton.setEnabled(novaSenha != null && !novaSenha.trim().isEmpty());
            }
            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                senhaAlterada = false;
            }
            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                senhaAlterada = false;
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
        logoMauaLabel = new javax.swing.JLabel();
        usuariosComboBox = new javax.swing.JComboBox<Usuario>();
        loginTextField = new javax.swing.JTextField();
        senhaTextField = new javax.swing.JTextField();
        alterarSenhaBotton = new javax.swing.JButton();
        alterarCategoriaButton = new javax.swing.JButton();
        apagarUsuarioButton = new javax.swing.JButton();
        confirmarButton = new javax.swing.JButton();
        categoriaComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar usuário");
        setMinimumSize(new java.awt.Dimension(620, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloMenuLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloMenuLabel.setForeground(new java.awt.Color(0, 20, 137));
        tituloMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        logoMauaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImagens/logoMaua.png"))); // NOI18N
        getContentPane().add(logoMauaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 230, 110));

        usuariosComboBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        usuariosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(usuariosComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 480, 60));

        loginTextField.setBackground(new java.awt.Color(255, 255, 255));
        loginTextField.setText("LOGIN");
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 280, 50));

        senhaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaTextField.setText("SENHA");
        senhaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 280, 50));

        alterarSenhaBotton.setText("Alterar Senha");
        alterarSenhaBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaBottonActionPerformed(evt);
            }
        });
        getContentPane().add(alterarSenhaBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 200, 50));

        alterarCategoriaButton.setText("Alterar Categoria");
        alterarCategoriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCategoriaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alterarCategoriaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 200, 50));

        apagarUsuarioButton.setText("Apagar usuario");
        apagarUsuarioButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        apagarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarUsuarioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(apagarUsuarioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 200, 50));

        confirmarButton.setBackground(new java.awt.Color(0, 20, 137));
        confirmarButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        confirmarButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmarButton.setText("CONFIRMAR");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 290, 60));

        categoriaComboBox.setEditable(true);
        categoriaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"CATEGORIA"}));
        categoriaComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoriaComboBoxItemStateChanged(evt);
            }
        });
        categoriaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(categoriaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 280, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        TelaMenuAdmin janelaMenuAdmin = new TelaMenuAdmin(this);
        janelaMenuAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

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
        categoriaComboBox.setEnabled(true);    
    }//GEN-LAST:event_alterarCategoriaButtonActionPerformed

    private void apagarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarUsuarioButtonActionPerformed
        var selecionado = (Usuario) usuariosComboBox.getSelectedItem();
        var escolha = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir usuario \"" + selecionado.getNome() +
                "\"? Todos os dados e estatisticas relacionados a este usuario serão perdidos.",
                "confirmar exclusão", JOptionPane.YES_NO_OPTION);
        
        if (escolha == JOptionPane.YES_OPTION ){
            
            try{
                var dao = new DAO();
                var deletou  = dao.deletaUsuario(selecionado.getId());
                
                if(deletou){
                    
                JOptionPane.showMessageDialog(null, "Usuario excluido da base de dados.");
                this.dispose();
                var tl = new AlterarUsuario();
                tl.setVisible(true);
                
                }
            }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Usuario não pode ser deletado no momento.");
            }
        }
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
                categoriaComboBox.setSelectedItem("Instrutor");
            }
            else{
                categoriaComboBox.setSelectedItem("Operador");
            }
            
            categoriaSelecionada = (String) categoriaComboBox.getSelectedItem(); 
            confirmarButton.setEnabled(false);
            categoriaComboBox.setEnabled(false);
            senhaAlterada = false;
            
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Dados de usuarios não disponíveis");
            
            }
        }
                
               
    }//GEN-LAST:event_usuariosComboBoxActionPerformed

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        if(senhaAlterada == true){
            var novaSenha = senhaTextField.getText();
            var selecionado = (Usuario) usuariosComboBox.getSelectedItem();
           try{
               var dao = new DAO();
               var atualizou = dao.atualizaSenha(novaSenha,selecionado.getId());
               if(atualizou){
                    JOptionPane.showMessageDialog(null, "Atualização de senha concluida com sucesso!");
                    this.dispose();
                    var tl = new AlterarUsuario();
                    tl.setVisible(true);
               }
                   
           }
           catch(Exception e){
               e.printStackTrace();
               JOptionPane.showMessageDialog(null, "Atualização de dados não disponivel."); 
               
           }
        }
        
        else if(categoriaAlterada == true){
            String novaCategoria = (String) categoriaComboBox.getSelectedItem();
            var selecionado = (Usuario) usuariosComboBox.getSelectedItem();
            boolean instrutor;
            // tratamento de dados para passar como parametro a dao.
            if (novaCategoria.toLowerCase().equals("instrutor")){
            instrutor = true; 
            }
            else{
                instrutor = false;
            }
                try{
                    var dao = new DAO();
                    var atualizou = dao.atualizaCategoria(instrutor, selecionado.getId());
                    if(atualizou){
                        JOptionPane.showMessageDialog(null, "Atualização de categoria concluida com sucesso");
                        this.dispose();
                        var tl = new AlterarUsuario();
                        tl.setVisible(true);
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Atualização de dados não disponivel."); 
                
                }
            
        }
    }//GEN-LAST:event_confirmarButtonActionPerformed

    private void categoriaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaComboBoxActionPerformed
        String novaCategoria = (String) categoriaComboBox.getSelectedItem();
        if(!novaCategoria.equals(categoriaSelecionada) && !novaCategoria.equals("CATEGORIA")){
            categoriaAlterada= true;
            confirmarButton.setEnabled(true);
     
        }
    }//GEN-LAST:event_categoriaComboBoxActionPerformed

    private void categoriaComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoriaComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaComboBoxItemStateChanged

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
    private javax.swing.JComboBox<String> categoriaComboBox;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JLabel logoMauaLabel;
    private javax.swing.JTextField senhaTextField;
    private javax.swing.JLabel tituloMenuLabel;
    private javax.swing.JComboBox<Usuario> usuariosComboBox;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
