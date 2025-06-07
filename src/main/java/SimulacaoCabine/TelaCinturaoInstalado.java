package SimulacaoCabine;

import Simulacao.Pontuacao;
import javax.swing.JFrame;

public class TelaCinturaoInstalado extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaCinturaoInstalado() {
        initComponents();
    }

    public TelaCinturaoInstalado(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaBaixoButton = new javax.swing.JButton();
        setaEsquerdaButton = new javax.swing.JButton();
        fecharPortaButton = new javax.swing.JButton();
        cinturaoInstaladoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Cinturao Instalado");
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

        setaEsquerdaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaEsquerda.png"))); // NOI18N
        setaEsquerdaButton.setContentAreaFilled(false);
        setaEsquerdaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setaEsquerdaButton.setPreferredSize(new java.awt.Dimension(100, 100));
        setaEsquerdaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaEsquerdaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(setaEsquerdaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        fecharPortaButton.setContentAreaFilled(false);
        fecharPortaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fecharPortaButton.setMaximumSize(new java.awt.Dimension(700, 530));
        fecharPortaButton.setMinimumSize(new java.awt.Dimension(700, 530));
        fecharPortaButton.setPreferredSize(new java.awt.Dimension(700, 530));
        fecharPortaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharPortaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fecharPortaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 7, 700, 530));

        cinturaoInstaladoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Cinturão instalado - externo (1).jpg"))); // NOI18N
        getContentPane().add(cinturaoInstaladoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        TelaSoleira janelaSoleira = new TelaSoleira(this);
        janelaSoleira.setVisible(true);
        Pontuacao.registrarAtividade("OS");
    }//GEN-LAST:event_setaBaixoButtonActionPerformed

    private void setaEsquerdaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaEsquerdaButtonActionPerformed
        TelaVisaoGeral janelaVisaoGeral = new TelaVisaoGeral(this);
        janelaVisaoGeral.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaEsquerdaButtonActionPerformed

    private void fecharPortaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharPortaButtonActionPerformed
        TelaPortaFechada janelaPortaFechada = new TelaPortaFechada(this);
        janelaPortaFechada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fecharPortaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCinturaoInstalado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCinturaoInstalado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCinturaoInstalado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCinturaoInstalado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCinturaoInstalado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cinturaoInstaladoLabel;
    private javax.swing.JButton fecharPortaButton;
    private javax.swing.JButton setaBaixoButton;
    private javax.swing.JButton setaEsquerdaButton;
    // End of variables declaration//GEN-END:variables
}
