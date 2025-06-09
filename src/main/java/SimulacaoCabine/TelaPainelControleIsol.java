package SimulacaoCabine;

import javax.swing.JFrame;
import Utilidades.EstadoPainelControle;

public class TelaPainelControleIsol extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaPainelControleIsol() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }

    public TelaPainelControleIsol(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaBaixoButton = new javax.swing.JButton();
        painelAmpliadoButton = new javax.swing.JButton();
        painelDeControleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Painel de Controle");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setaBaixoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaBaixo.png"))); // NOI18N
        setaBaixoButton.setContentAreaFilled(false);
        setaBaixoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setaBaixoButton.setPreferredSize(new java.awt.Dimension(100, 100));
        setaBaixoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaBaixoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(setaBaixoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, -1, -1));

        painelAmpliadoButton.setContentAreaFilled(false);
        painelAmpliadoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelAmpliadoButton.setMaximumSize(new java.awt.Dimension(60, 60));
        painelAmpliadoButton.setMinimumSize(new java.awt.Dimension(60, 60));
        painelAmpliadoButton.setPreferredSize(new java.awt.Dimension(60, 60));
        painelAmpliadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelAmpliadoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(painelAmpliadoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 60, 60));

        painelDeControleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Painel_de_Controle_em_Metal_Industrial.png"))); // NOI18N
        getContentPane().add(painelDeControleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        TelaPainelDeAcesso janelaPainelDeAcesso = new TelaPainelDeAcesso(this);
        janelaPainelDeAcesso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaBaixoButtonActionPerformed

    private void painelAmpliadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelAmpliadoButtonActionPerformed
        EstadoPainelControle.setPosicaoAtual(EstadoPainelControle.Posicao.NORMAL);
        TelaPainelControleNormal janelaPainelControleNormal = new TelaPainelControleNormal(this);
        janelaPainelControleNormal.setVisible(true);
        this.dispose();// <- fecha a janela atual
    }//GEN-LAST:event_painelAmpliadoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPainelControleIsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPainelControleIsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPainelControleIsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPainelControleIsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPainelControleIsol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton painelAmpliadoButton;
    private javax.swing.JLabel painelDeControleLabel;
    private javax.swing.JButton setaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
