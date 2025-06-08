package SimulacaoCabine;

import javax.swing.JFrame;

public class TelaFE extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaFE() {
        initComponents();
    }

    public TelaFE(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        preparaButton = new javax.swing.JButton();
        infopassButton = new javax.swing.JButton();
        feLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela FE");
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
        getContentPane().add(preparaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 520, 40, 40));

        infopassButton.setContentAreaFilled(false);
        infopassButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infopassButton.setMaximumSize(new java.awt.Dimension(40, 40));
        infopassButton.setMinimumSize(new java.awt.Dimension(40, 40));
        infopassButton.setPreferredSize(new java.awt.Dimension(40, 40));
        infopassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infopassButtonActionPerformed(evt);
            }
        });
        getContentPane().add(infopassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 40, 40));

        feLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/DDU - tela FE- lista de emergência.jpg"))); // NOI18N
        getContentPane().add(feLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void preparaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preparaButtonActionPerformed
        TelaDDU janelaDDU = new TelaDDU(this);
        janelaDDU.setVisible(true);
    }//GEN-LAST:event_preparaButtonActionPerformed

    private void infopassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infopassButtonActionPerformed
        TelaINFOPASS janelaINFOPASS = new TelaINFOPASS(this);
        janelaINFOPASS.setVisible(true);
    }//GEN-LAST:event_infopassButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel feLabel;
    private javax.swing.JButton infopassButton;
    private javax.swing.JButton preparaButton;
    // End of variables declaration//GEN-END:variables
}
