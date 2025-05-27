package SimulacaoCabine;

import javax.swing.JFrame;

public class TelaPortaSemiAberta extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaPortaSemiAberta() {
        initComponents();
    }

    public TelaPortaSemiAberta(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetaEsquerdaButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        SetaBaixoButton = new javax.swing.JButton();
        PortaSemiAbertaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Porta Semi Aberta");
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

        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 90, 160, 420));

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

        PortaSemiAbertaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Porta semi aberta - externo.jpg"))); // NOI18N
        getContentPane().add(PortaSemiAbertaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetaEsquerdaButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaEsquerdaButton2ActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SetaEsquerdaButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaPortaSemiAbertaInterna janelaPortaSemiAbertaInterna = new TelaPortaSemiAbertaInterna(this);
        janelaPortaSemiAbertaInterna.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SetaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaBaixoButtonActionPerformed
        TelaSoleira janelaSoleira = new TelaSoleira(this);
        janelaSoleira.setVisible(true);
    }//GEN-LAST:event_SetaBaixoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPortaSemiAberta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPortaSemiAberta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPortaSemiAberta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPortaSemiAberta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPortaSemiAberta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PortaSemiAbertaLabel;
    private javax.swing.JButton SetaBaixoButton;
    private javax.swing.JButton SetaEsquerdaButton2;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
