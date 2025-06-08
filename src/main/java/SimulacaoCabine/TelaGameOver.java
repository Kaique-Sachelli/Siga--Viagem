package SimulacaoCabine;

import MenuTelas.TelaMenuUsuario;
import javax.swing.JFrame;

public class TelaGameOver extends javax.swing.JFrame {
    
    private JFrame frame;
    
    public TelaGameOver() {
        initComponents();
    }
    
    public TelaGameOver(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameOverLabel = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        erroFatalLabel = new javax.swing.JLabel();
        imagemGameOverLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Game Over");
        setMinimumSize(new java.awt.Dimension(345, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gameOverLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        gameOverLabel.setForeground(new java.awt.Color(255, 255, 255));
        gameOverLabel.setText("GAME OVER");
        getContentPane().add(gameOverLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 270, 70));

        voltarButton.setBackground(new java.awt.Color(255, 255, 255));
        voltarButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        voltarButton.setForeground(new java.awt.Color(0, 20, 137));
        voltarButton.setText("VOLTAR AO MENU");
        voltarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 270, 80));

        erroFatalLabel.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        erroFatalLabel.setForeground(new java.awt.Color(255, 255, 255));
        erroFatalLabel.setText("Você cometeu um erro fatal!");
        getContentPane().add(erroFatalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 420, 70));

        imagemGameOverLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/TelaGameOver.png"))); // NOI18N
        getContentPane().add(imagemGameOverLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        TelaMenuUsuario janelaMenuUsuario = new TelaMenuUsuario(this);
        janelaMenuUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGameOver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel erroFatalLabel;
    private javax.swing.JLabel gameOverLabel;
    private javax.swing.JLabel imagemGameOverLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
