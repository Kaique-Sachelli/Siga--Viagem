package Simulacao;

import Utilidades.Pontuacao;
import javax.swing.JFrame;
import Utilidades.EstadoReversora;

public class TelaReversoraFrente extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaReversoraFrente() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }

    public TelaReversoraFrente(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaBaixoButton = new javax.swing.JButton();
        reversoraFrenteButton = new javax.swing.JButton();
        reversoraFrenteLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela  Reversora Frente");
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

        reversoraFrenteButton.setContentAreaFilled(false);
        reversoraFrenteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reversoraFrenteButton.setMaximumSize(new java.awt.Dimension(530, 350));
        reversoraFrenteButton.setMinimumSize(new java.awt.Dimension(530, 350));
        reversoraFrenteButton.setPreferredSize(new java.awt.Dimension(530, 350));
        reversoraFrenteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reversoraFrenteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(reversoraFrenteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 130, 530, 350));

        reversoraFrenteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Reversora em frente.jpg"))); // NOI18N
        getContentPane().add(reversoraFrenteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        EstadoReversora.setPosicaoAtual(EstadoReversora.Posicao.FRENTE); 
        frame.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_setaBaixoButtonActionPerformed

    private void reversoraFrenteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reversoraFrenteButtonActionPerformed
        EstadoReversora.setPosicaoAtual(EstadoReversora.Posicao.NEUTRO);
        TelaReversoraNeutro janelaNeutro = new TelaReversoraNeutro(frame); 
        janelaNeutro.setVisible(true);
        if(Utilidades.EstadoPorta.getPosicaoAtual() == Utilidades.EstadoPorta.Posicao.ABERTA){
            Pontuacao.registrarAtividade("R");
            if(Utilidades.EstadoCBTC.getPosicaoAtual() == Utilidades.EstadoCBTC.Posicao.AM){
                Pontuacao.registrarErro("RN");
            }
        } else{
            Pontuacao.registrarErro("RN");
        }
        this.dispose(); // <- fecha a janela atual
    }//GEN-LAST:event_reversoraFrenteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaReversoraFrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaReversoraFrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaReversoraFrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaReversoraFrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaReversoraFrente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton reversoraFrenteButton;
    private javax.swing.JLabel reversoraFrenteLabel;
    private javax.swing.JButton setaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
