package Simulacao;

import javax.swing.JFrame;

public class TelaINFOPASS extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaINFOPASS() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }

    public TelaINFOPASS(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        preparaButton = new javax.swing.JButton();
        feButton = new javax.swing.JButton();
        infopassLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela INFOPASS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        preparaButton.setContentAreaFilled(false);
        preparaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        preparaButton.setMaximumSize(new java.awt.Dimension(40, 40));
        preparaButton.setMinimumSize(new java.awt.Dimension(40, 40));
        preparaButton.setPreferredSize(new java.awt.Dimension(40, 40));
        preparaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preparaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(preparaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 40, 40));

        feButton.setContentAreaFilled(false);
        feButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        feButton.setMaximumSize(new java.awt.Dimension(40, 40));
        feButton.setMinimumSize(new java.awt.Dimension(40, 40));
        feButton.setPreferredSize(new java.awt.Dimension(40, 40));
        feButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feButtonActionPerformed(evt);
            }
        });
        getContentPane().add(feButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 40, 40));

        infopassLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/DDU - tela INFOPASS.jpg"))); // NOI18N
        getContentPane().add(infopassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void preparaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preparaButtonActionPerformed
        TelaDDU janelaDDU = new TelaDDU(this);
        janelaDDU.setVisible(true);
    }//GEN-LAST:event_preparaButtonActionPerformed

    private void feButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feButtonActionPerformed
        TelaFE janelaFe = new TelaFE(this);
        janelaFe.setVisible(true);
    }//GEN-LAST:event_feButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaINFOPASS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaINFOPASS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaINFOPASS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaINFOPASS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaINFOPASS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton feButton;
    private javax.swing.JLabel infopassLabel;
    private javax.swing.JButton preparaButton;
    // End of variables declaration//GEN-END:variables
}
