package SimulacaoCabine;

import javax.swing.JFrame;

public class TelaPainelDeControle extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaPainelDeControle() {
        initComponents();
    }

    public TelaPainelDeControle(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetaBaixoButton = new javax.swing.JButton();
        PainelAmpliadoButton = new javax.swing.JButton();
        PainelDeControleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Painel de Controle");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SetaBaixoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaBaixo.png"))); // NOI18N
        SetaBaixoButton.setContentAreaFilled(false);
        SetaBaixoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetaBaixoButton.setPreferredSize(new java.awt.Dimension(100, 100));
        SetaBaixoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetaBaixoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SetaBaixoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, -1, -1));

        PainelAmpliadoButton.setContentAreaFilled(false);
        PainelAmpliadoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PainelAmpliadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PainelAmpliadoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PainelAmpliadoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 60, 60));

        PainelDeControleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Painel_de_Controle_em_Metal_Industrial.png"))); // NOI18N
        getContentPane().add(PainelDeControleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaBaixoButtonActionPerformed
        TelaPainelDeAcesso janelaPainelDeAcesso = new TelaPainelDeAcesso(this);
        janelaPainelDeAcesso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SetaBaixoButtonActionPerformed

    private void PainelAmpliadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PainelAmpliadoButtonActionPerformed
        TelaPainelAcessoAmpliado janelaAcessoAmpliado = new TelaPainelAcessoAmpliado(this);
        janelaAcessoAmpliado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PainelAmpliadoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPainelDeControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPainelDeControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPainelDeControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPainelDeControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPainelDeControle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PainelAmpliadoButton;
    private javax.swing.JLabel PainelDeControleLabel;
    private javax.swing.JButton SetaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
