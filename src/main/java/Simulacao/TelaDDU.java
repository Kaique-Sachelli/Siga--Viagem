package Simulacao;

import javax.swing.JFrame;

public class TelaDDU extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaDDU() {
        initComponents();
    }

    public TelaDDU(JFrame frame) {
        this.frame = frame;
        this.frame.setVisible(false);
        initComponents();
        setResizable(false);
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaBaixoButton = new javax.swing.JButton();
        feButton = new javax.swing.JButton();
        infopassButton = new javax.swing.JButton();
        dduImagemLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DDU Com Fachada Aberta");
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
        getContentPane().add(feButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 40, 40));

        infopassButton.setContentAreaFilled(false);
        infopassButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infopassButton.setMaximumSize(new java.awt.Dimension(30, 40));
        infopassButton.setMinimumSize(new java.awt.Dimension(30, 40));
        infopassButton.setPreferredSize(new java.awt.Dimension(30, 40));
        infopassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infopassButtonActionPerformed(evt);
            }
        });
        getContentPane().add(infopassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 480, 30, 40));

        dduImagemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/telaDDU.jpg"))); // NOI18N
        getContentPane().add(dduImagemLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        TelaCabine janelaCabine = new TelaCabine(this);
        janelaCabine.setVisible(true);
    }//GEN-LAST:event_setaBaixoButtonActionPerformed

    private void feButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feButtonActionPerformed
        TelaFE janelaFe = new TelaFE(this);
        janelaFe.setVisible(true);
    }//GEN-LAST:event_feButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDDU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDDU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDDU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDDU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDDU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dduImagemLabel;
    private javax.swing.JButton feButton;
    private javax.swing.JButton infopassButton;
    private javax.swing.JButton setaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
