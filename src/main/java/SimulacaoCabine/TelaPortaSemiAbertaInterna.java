package SimulacaoCabine;

import javax.swing.JFrame;

public class TelaPortaSemiAbertaInterna extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaPortaSemiAbertaInterna() {
        initComponents();
    }

    public TelaPortaSemiAbertaInterna(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PortaSemiAbertaButton = new javax.swing.JButton();
        SetaDireitaButton = new javax.swing.JButton();
        PortSemiAbertaInternaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Porta Semi Aberta Interno");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PortaSemiAbertaButton.setContentAreaFilled(false);
        PortaSemiAbertaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PortaSemiAbertaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PortaSemiAbertaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PortaSemiAbertaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 117, 150, 520));

        SetaDireitaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaDireita.png"))); // NOI18N
        SetaDireitaButton.setContentAreaFilled(false);
        SetaDireitaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetaDireitaButton.setPreferredSize(new java.awt.Dimension(100, 100));
        SetaDireitaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetaDireitaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SetaDireitaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, -1, -1));

        PortSemiAbertaInternaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Porta semi aberta - interno.jpg"))); // NOI18N
        getContentPane().add(PortSemiAbertaInternaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PortaSemiAbertaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PortaSemiAbertaButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PortaSemiAbertaButtonActionPerformed

    private void SetaDireitaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaDireitaButtonActionPerformed
        TelaPaineisEmergencia janelaEmergencia = new TelaPaineisEmergencia(this);
        janelaEmergencia.setVisible(true);
    }//GEN-LAST:event_SetaDireitaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPortaSemiAbertaInterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPortaSemiAbertaInterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPortaSemiAbertaInterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPortaSemiAbertaInterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPortaSemiAbertaInterna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PortSemiAbertaInternaLabel;
    private javax.swing.JButton PortaSemiAbertaButton;
    private javax.swing.JButton SetaDireitaButton;
    // End of variables declaration//GEN-END:variables
}
