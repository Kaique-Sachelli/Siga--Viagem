package SimulacaoCabine;

import javax.swing.JFrame;

public class TelaPortaEsquerda extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaPortaEsquerda() {
        initComponents();
    }
    
    public TelaPortaEsquerda(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetaDireitaButton = new javax.swing.JButton();
        AreaExternaButton = new javax.swing.JButton();
        botoeiraAcessaButton = new javax.swing.JButton();
        PortaEsquerdaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Porta Esquerda");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SetaDireitaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaDireita.png"))); // NOI18N
        SetaDireitaButton.setContentAreaFilled(false);
        SetaDireitaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetaDireitaButton.setPreferredSize(new java.awt.Dimension(100, 100));
        SetaDireitaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetaDireitaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SetaDireitaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        AreaExternaButton.setContentAreaFilled(false);
        AreaExternaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AreaExternaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaExternaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AreaExternaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 170, 610));

        botoeiraAcessaButton.setContentAreaFilled(false);
        botoeiraAcessaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoeiraAcessaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoeiraAcessaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botoeiraAcessaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, 190));

        PortaEsquerdaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Porta de cabine lateral esquerda.jpg"))); // NOI18N
        getContentPane().add(PortaEsquerdaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetaDireitaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaDireitaButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SetaDireitaButtonActionPerformed

    private void AreaExternaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaExternaButtonActionPerformed
        TelaAreaExterna janelaAreaExterna = new TelaAreaExterna(this);
        janelaAreaExterna.setVisible(true);
    }//GEN-LAST:event_AreaExternaButtonActionPerformed

    private void botoeiraAcessaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoeiraAcessaButtonActionPerformed
        TelaBotoeiraAcessa janelaBotoeiraAcessa = new TelaBotoeiraAcessa(this);
        janelaBotoeiraAcessa.setVisible(true);
    }//GEN-LAST:event_botoeiraAcessaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPortaEsquerda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPortaEsquerda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPortaEsquerda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPortaEsquerda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPortaEsquerda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AreaExternaButton;
    private javax.swing.JLabel PortaEsquerdaLabel;
    private javax.swing.JButton SetaDireitaButton;
    private javax.swing.JButton botoeiraAcessaButton;
    // End of variables declaration//GEN-END:variables
}
