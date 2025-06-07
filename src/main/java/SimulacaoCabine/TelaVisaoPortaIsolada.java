package SimulacaoCabine;

import Simulacao.Pontuacao;
import javax.swing.JFrame;

public class TelaVisaoPortaIsolada extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaVisaoPortaIsolada() {
        initComponents();
        setResizable(false);
    }

    public TelaVisaoPortaIsolada(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sinalizacaoExternaApagadaButton = new javax.swing.JButton();
        setaEsquerdaButton = new javax.swing.JButton();
        visaoPortaIsoladaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Visão Geral Porta Isolada");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sinalizacaoExternaApagadaButton.setContentAreaFilled(false);
        sinalizacaoExternaApagadaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sinalizacaoExternaApagadaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinalizacaoExternaApagadaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sinalizacaoExternaApagadaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 190, 130, 80));

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

        visaoPortaIsoladaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Adesivo de porta isolada instalado visão geral.jpg"))); // NOI18N
        getContentPane().add(visaoPortaIsoladaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sinalizacaoExternaApagadaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinalizacaoExternaApagadaButtonActionPerformed
        TelaSinalizacaoExternaAcesa janelaExternaAcesa = new TelaSinalizacaoExternaAcesa(this);
        janelaExternaAcesa.setVisible(true);
        Pontuacao.registrarAtividade("LPE");
    }//GEN-LAST:event_sinalizacaoExternaApagadaButtonActionPerformed

    private void setaEsquerdaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaEsquerdaButtonActionPerformed
        TelaAreaExterna janelaAreaExterna = new TelaAreaExterna(this);
        janelaAreaExterna.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaEsquerdaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVisaoPortaIsolada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVisaoPortaIsolada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVisaoPortaIsolada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVisaoPortaIsolada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVisaoPortaIsolada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton setaEsquerdaButton;
    private javax.swing.JButton sinalizacaoExternaApagadaButton;
    private javax.swing.JLabel visaoPortaIsoladaLabel;
    // End of variables declaration//GEN-END:variables
}
