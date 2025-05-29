package SimulacaoCabine;

import javax.swing.JFrame;

public class TelaPainelControleNormal extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaPainelControleNormal() {
        initComponents();
    }

    public TelaPainelControleNormal(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetaBaixoButton = new javax.swing.JButton();
        setaBaixoButton = new javax.swing.JButton();
        painelDeControleButton = new javax.swing.JButton();
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
        setTitle("Tela Painel de Controle Normal");
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

        painelDeControleButton.setContentAreaFilled(false);
        painelDeControleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelDeControleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelDeControleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(painelDeControleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, 70));

        PainelAcessoAmpliadoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Painel_de_Controle_em_Metal_Industrial (2) (1).png"))); // NOI18N
        getContentPane().add(PainelAcessoAmpliadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaBaixoButtonActionPerformed
        TelaPainelDeControleIsol janelaPainelDeControle = new TelaPainelDeControleIsol(this);
        janelaPainelDeControle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SetaBaixoButtonActionPerformed

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        TelaPainelDeControleIsol janelaPainelDeControle = new TelaPainelDeControleIsol(this);
        janelaPainelDeControle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaBaixoButtonActionPerformed

    private void painelDeControleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelDeControleButtonActionPerformed
        TelaPainelDeControleIsol janelaPainelDeControle = new TelaPainelDeControleIsol(this);
        janelaPainelDeControle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_painelDeControleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPainelControleNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPainelControleNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPainelControleNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPainelControleNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPainelControleNormal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PainelAcessoAmpliadoLabel;
    private javax.swing.JButton SetaBaixoButton;
    private javax.swing.JButton painelDeControleButton;
    private javax.swing.JButton setaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
