package MenuTelasAdmin;

import Persistencia.DAO;
import Persistencia.Usuario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList; 


public class AlterarUsuario extends javax.swing.JFrame {
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
        usuariosComboBox = new javax.swing.JComboBox<>();
        confirmarButton = new javax.swing.JButton();
        senhaLabel = new javax.swing.JLabel();
        novaSenhaPasswordField = new javax.swing.JPasswordField();

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
        getContentPane().add(usuariosComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 480, 60));

        confirmarButton.setBackground(new java.awt.Color(0, 20, 137));
        confirmarButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        confirmarButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmarButton.setText("CONFIRMAR");
        getContentPane().add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 290, 60));

        senhaLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(0, 20, 137));
        senhaLabel.setText("Nova Senha:");
        getContentPane().add(senhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 150, -1));

        novaSenhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(novaSenhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 470, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

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
    private javax.swing.JButton confirmarButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField novaSenhaPasswordField;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JLabel tituloMenuLabel;
    private javax.swing.JComboBox<String> usuariosComboBox;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
