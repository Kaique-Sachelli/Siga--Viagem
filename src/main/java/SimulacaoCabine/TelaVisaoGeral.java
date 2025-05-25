package SimulacaoCabine;

import javax.swing.JFrame;

public class TelaVisaoGeral extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaVisaoGeral() {
        initComponents();
    }

    public TelaVisaoGeral(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetaEsquerdaButton1 = new javax.swing.JButton();
        SetaEsquerdaButton2 = new javax.swing.JButton();
        SetaDireitaButton = new javax.swing.JButton();
        VisaoGeralLabel = new javax.swing.JLabel();

        SetaEsquerdaButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaEsquerda.png"))); // NOI18N
        SetaEsquerdaButton1.setContentAreaFilled(false);
        SetaEsquerdaButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetaEsquerdaButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        SetaEsquerdaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetaEsquerdaButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Visão Geral");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SetaEsquerdaButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaEsquerda.png"))); // NOI18N
        SetaEsquerdaButton2.setContentAreaFilled(false);
        SetaEsquerdaButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetaEsquerdaButton2.setPreferredSize(new java.awt.Dimension(100, 100));
        SetaEsquerdaButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetaEsquerdaButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(SetaEsquerdaButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

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

        VisaoGeralLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/13 - Visão geral do carro 5 (1).jpg"))); // NOI18N
        getContentPane().add(VisaoGeralLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetaEsquerdaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaEsquerdaButton1ActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SetaEsquerdaButton1ActionPerformed

    private void SetaEsquerdaButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaEsquerdaButton2ActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SetaEsquerdaButton2ActionPerformed

    private void SetaDireitaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaDireitaButtonActionPerformed
        TelaPortaSemiAberta janelaPortaSemiAberta = new TelaPortaSemiAberta(this);
        janelaPortaSemiAberta.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaVisaoGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVisaoGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVisaoGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVisaoGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVisaoGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SetaDireitaButton;
    private javax.swing.JButton SetaEsquerdaButton1;
    private javax.swing.JButton SetaEsquerdaButton2;
    private javax.swing.JLabel VisaoGeralLabel;
    // End of variables declaration//GEN-END:variables
}
