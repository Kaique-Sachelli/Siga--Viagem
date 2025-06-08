package SimulacaoCabine;

import Simulacao.Pontuacao;
import javax.swing.JFrame;
import Utilidades.EstadoReversora;


public class TelaReversoraNeutro extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaReversoraNeutro() {
        initComponents();
    }

    public TelaReversoraNeutro(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaBaixoButton = new javax.swing.JButton();
        reversoraNeutroButton = new javax.swing.JButton();
        reversoraNeutroLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Reversora Neutro");
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

        reversoraNeutroButton.setContentAreaFilled(false);
        reversoraNeutroButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reversoraNeutroButton.setMaximumSize(new java.awt.Dimension(530, 350));
        reversoraNeutroButton.setMinimumSize(new java.awt.Dimension(530, 350));
        reversoraNeutroButton.setPreferredSize(new java.awt.Dimension(530, 350));
        reversoraNeutroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reversoraNeutroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(reversoraNeutroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 530, 350));

        reversoraNeutroLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Reversora em neutro.jpg"))); // NOI18N
        getContentPane().add(reversoraNeutroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        EstadoReversora.setPosicaoAtual(EstadoReversora.Posicao.NEUTRO); 
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaBaixoButtonActionPerformed

    private void reversoraNeutroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reversoraNeutroButtonActionPerformed
        if(Simulacao.Pontuacao.contarAtividadesRealizadas() >= 19){
            TelaFimJogo janelaFimJogo = new TelaFimJogo();
            janelaFimJogo.setVisible(true);
            this.dispose();
        } else{
            EstadoReversora.setPosicaoAtual(EstadoReversora.Posicao.FRENTE);
            TelaReversoraFrente janelaFrente = new TelaReversoraFrente(frame);
            janelaFrente.setVisible(true);
            this.dispose();    
            Pontuacao.registrarAtividade("R");
        }
    }//GEN-LAST:event_reversoraNeutroButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaReversoraNeutro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaReversoraNeutro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaReversoraNeutro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaReversoraNeutro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaReversoraNeutro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton reversoraNeutroButton;
    private javax.swing.JLabel reversoraNeutroLabel;
    private javax.swing.JButton setaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
