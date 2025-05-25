package SimulacaoCabine;

import javax.swing.JFrame;

public class TelaPainelAcessoAmpliado extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaPainelAcessoAmpliado() {
        initComponents();
    }

    public TelaPainelAcessoAmpliado(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetaBaixoButton = new javax.swing.JButton();
        SetaBaixoButton1 = new javax.swing.JButton();
        PainelAcessoAmpliadoLabel = new javax.swing.JLabel();

        SetaBaixoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaBaixo.png"))); // NOI18N
        SetaBaixoButton.setContentAreaFilled(false);
        SetaBaixoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetaBaixoButton.setPreferredSize(new java.awt.Dimension(100, 100));
        SetaBaixoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetaBaixoButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Painel de Controle Ampliado");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SetaBaixoButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaBaixo.png"))); // NOI18N
        SetaBaixoButton1.setContentAreaFilled(false);
        SetaBaixoButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetaBaixoButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        SetaBaixoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetaBaixoButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(SetaBaixoButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, -1, -1));

        PainelAcessoAmpliadoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Painel externo aberto (1).png"))); // NOI18N
        getContentPane().add(PainelAcessoAmpliadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaBaixoButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SetaBaixoButtonActionPerformed

    private void SetaBaixoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaBaixoButton1ActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SetaBaixoButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPainelAcessoAmpliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPainelAcessoAmpliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPainelAcessoAmpliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPainelAcessoAmpliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPainelAcessoAmpliado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PainelAcessoAmpliadoLabel;
    private javax.swing.JButton SetaBaixoButton;
    private javax.swing.JButton SetaBaixoButton1;
    // End of variables declaration//GEN-END:variables
}
