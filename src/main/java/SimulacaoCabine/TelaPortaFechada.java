package SimulacaoCabine;

import Simulacao.Pontuacao;
import Utilidades.EstadoPorta;
import javax.swing.JFrame;

public class TelaPortaFechada extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaPortaFechada() {
        initComponents();
        setResizable(false);
    }

    public TelaPortaFechada(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaEsquerdaButton = new javax.swing.JButton();
        colocarFitaButton = new javax.swing.JButton();
        portaFechadaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Porta Fechada");
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
        getContentPane().add(setaEsquerdaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        colocarFitaButton.setContentAreaFilled(false);
        colocarFitaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colocarFitaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colocarFitaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(colocarFitaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 97, 690, 540));

        portaFechadaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Porta fechada.jpg"))); // NOI18N
        getContentPane().add(portaFechadaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaEsquerdaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaEsquerdaButtonActionPerformed
        Utilidades.EstadoPorta.setPosicaoAtual(EstadoPorta.Posicao.FECHADA);
        TelaVisaoGeral janelaVisaoGeral = new TelaVisaoGeral(this);
        janelaVisaoGeral.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaEsquerdaButtonActionPerformed

    private void colocarFitaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colocarFitaButtonActionPerformed
        Utilidades.EstadoPorta.setPosicaoAtual(EstadoPorta.Posicao.FITA);
        TelaVisaoPortaIsolada janelaPortaIsolada = new TelaVisaoPortaIsolada(this);
        janelaPortaIsolada.setVisible(true);
        this.dispose();
        Pontuacao.registrarAtividade("ADE");
    }//GEN-LAST:event_colocarFitaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPortaFechada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPortaFechada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPortaFechada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPortaFechada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPortaFechada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colocarFitaButton;
    private javax.swing.JLabel portaFechadaLabel;
    private javax.swing.JButton setaEsquerdaButton;
    // End of variables declaration//GEN-END:variables
}
