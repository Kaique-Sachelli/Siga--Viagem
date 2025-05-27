package SimulacaoCabine;

import javax.swing.JFrame;

public class TelaReversoraNeutro extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaReversoraNeutro() {
        initComponents();
    }

    public TelaReversoraNeutro(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetaBaixoButton = new javax.swing.JButton();
        ReversoraNeutroButton = new javax.swing.JButton();
        ReversoraNeutroLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Reversora Neutro");
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

        ReversoraNeutroButton.setContentAreaFilled(false);
        ReversoraNeutroButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReversoraNeutroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReversoraNeutroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReversoraNeutroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 530, 350));

        ReversoraNeutroLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Reversora em neutro.jpg"))); // NOI18N
        getContentPane().add(ReversoraNeutroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaBaixoButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SetaBaixoButtonActionPerformed

    private void ReversoraNeutroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReversoraNeutroButtonActionPerformed
        TelaReversoraFrente janelaFrente = new TelaReversoraFrente(this);
        janelaFrente.setVisible(true);
    }//GEN-LAST:event_ReversoraNeutroButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaReversoraNeutro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaReversoraNeutro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaReversoraNeutro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaReversoraNeutro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaReversoraNeutro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReversoraNeutroButton;
    private javax.swing.JLabel ReversoraNeutroLabel;
    private javax.swing.JButton SetaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
