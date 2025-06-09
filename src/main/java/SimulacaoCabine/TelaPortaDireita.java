package SimulacaoCabine;

import javax.swing.JFrame;

public class TelaPortaDireita extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaPortaDireita() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }

    public TelaPortaDireita(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaEsquerdaButton = new javax.swing.JButton();
        botoeirasSinaleirasButton = new javax.swing.JButton();
        portaDireitaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Porta Direita");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setaEsquerdaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaEsquerda.png"))); // NOI18N
        setaEsquerdaButton.setContentAreaFilled(false);
        setaEsquerdaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setaEsquerdaButton.setPreferredSize(new java.awt.Dimension(100, 100));
        setaEsquerdaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaEsquerdaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(setaEsquerdaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        botoeirasSinaleirasButton.setContentAreaFilled(false);
        botoeirasSinaleirasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoeirasSinaleirasButton.setMaximumSize(new java.awt.Dimension(70, 180));
        botoeirasSinaleirasButton.setMinimumSize(new java.awt.Dimension(70, 180));
        botoeirasSinaleirasButton.setPreferredSize(new java.awt.Dimension(70, 180));
        botoeirasSinaleirasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoeirasSinaleirasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botoeirasSinaleirasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 70, 180));

        portaDireitaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Porta de cabine lateral direita.jpg"))); // NOI18N
        getContentPane().add(portaDireitaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaEsquerdaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaEsquerdaButtonActionPerformed
        if(Utilidades.EstadoItem.getInstance().isChaveServico()){
            TelaColunaLateral janelaColunaLateral = new TelaColunaLateral(this);
            janelaColunaLateral.setVisible(true);
            this.dispose();
        } else{
            TelaColunaLateralChave janelaColunaLateralChave = new TelaColunaLateralChave(this);
            janelaColunaLateralChave.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_setaEsquerdaButtonActionPerformed

    private void botoeirasSinaleirasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoeirasSinaleirasButtonActionPerformed
        TelaBotoeirasSinaleiras janelaBotoeirasSinaleiras = new TelaBotoeirasSinaleiras(this);
        janelaBotoeirasSinaleiras.setVisible(true);
    }//GEN-LAST:event_botoeirasSinaleirasButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPortaDireita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPortaDireita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPortaDireita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPortaDireita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPortaDireita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoeirasSinaleirasButton;
    private javax.swing.JLabel portaDireitaLabel;
    private javax.swing.JButton setaEsquerdaButton;
    // End of variables declaration//GEN-END:variables
}
