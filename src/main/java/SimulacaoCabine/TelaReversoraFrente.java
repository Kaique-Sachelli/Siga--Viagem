package SimulacaoCabine;

import javax.swing.JFrame;

public class TelaReversoraFrente extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaReversoraFrente() {
        initComponents();
    }

    public TelaReversoraFrente(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetaBaixoButton = new javax.swing.JButton();
        ReversoraFrenteButton = new javax.swing.JButton();
        ReversoraFrenteLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela  Reversora Frente");
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

        ReversoraFrenteButton.setContentAreaFilled(false);
        ReversoraFrenteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReversoraFrenteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReversoraFrenteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReversoraFrenteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 130, 530, 350));

        ReversoraFrenteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Reversora em frente.jpg"))); // NOI18N
        getContentPane().add(ReversoraFrenteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaBaixoButtonActionPerformed
        TelaCabine telaCabine = new TelaCabine();
        telaCabine.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SetaBaixoButtonActionPerformed

    private void ReversoraFrenteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReversoraFrenteButtonActionPerformed
        TelaReversoraNeutro janelaNeutro = new TelaReversoraNeutro(this);
        janelaNeutro.setVisible(true);
    }//GEN-LAST:event_ReversoraFrenteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaReversoraFrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaReversoraFrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaReversoraFrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaReversoraFrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaReversoraFrente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReversoraFrenteButton;
    private javax.swing.JLabel ReversoraFrenteLabel;
    private javax.swing.JButton SetaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
