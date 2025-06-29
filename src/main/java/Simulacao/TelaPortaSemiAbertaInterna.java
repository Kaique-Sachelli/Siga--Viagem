package Simulacao;

import Utilidades.Pontuacao;
import Utilidades.EstadoPainelControle;
import Utilidades.EstadoPorta;
import javax.swing.JFrame;

public class TelaPortaSemiAbertaInterna extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaPortaSemiAbertaInterna() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }

    public TelaPortaSemiAbertaInterna(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        portaSemiAbertaButton = new javax.swing.JButton();
        setaDireitaButton = new javax.swing.JButton();
        colocarCinturaoButton = new javax.swing.JButton();
        portaSemiAbertaInternaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Porta Semi Aberta Interno");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        portaSemiAbertaButton.setContentAreaFilled(false);
        portaSemiAbertaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        portaSemiAbertaButton.setMaximumSize(new java.awt.Dimension(150, 520));
        portaSemiAbertaButton.setMinimumSize(new java.awt.Dimension(150, 520));
        portaSemiAbertaButton.setPreferredSize(new java.awt.Dimension(150, 520));
        portaSemiAbertaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portaSemiAbertaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(portaSemiAbertaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 117, 150, 520));

        setaDireitaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaDireita.png"))); // NOI18N
        setaDireitaButton.setContentAreaFilled(false);
        setaDireitaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setaDireitaButton.setPreferredSize(new java.awt.Dimension(100, 100));
        setaDireitaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaDireitaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(setaDireitaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, -1, -1));

        colocarCinturaoButton.setContentAreaFilled(false);
        colocarCinturaoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colocarCinturaoButton.setMaximumSize(new java.awt.Dimension(520, 530));
        colocarCinturaoButton.setMinimumSize(new java.awt.Dimension(520, 530));
        colocarCinturaoButton.setPreferredSize(new java.awt.Dimension(520, 530));
        colocarCinturaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colocarCinturaoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(colocarCinturaoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 107, 520, 530));

        portaSemiAbertaInternaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/telaPortaSemiAbertaInterna.jpg"))); // NOI18N
        getContentPane().add(portaSemiAbertaInternaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void portaSemiAbertaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portaSemiAbertaButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_portaSemiAbertaButtonActionPerformed

    private void setaDireitaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaDireitaButtonActionPerformed
        TelaPaineisEmergencia janelaEmergencia = new TelaPaineisEmergencia(this);
        janelaEmergencia.setVisible(true);
        if(Utilidades.SituacaoPontuacao.getInstance().isSituacaoEmergencia() == false){
            Pontuacao.registrarAtividade("EM");
            Utilidades.SituacaoPontuacao.getInstance().setSituacaoEmergencia(true);
            Utilidades.SituacaoPontuacao.getInstance().setSituacaoCCO(false);
        } else {
            Pontuacao.registrarErro("EM");
        }
    }//GEN-LAST:event_setaDireitaButtonActionPerformed

    private void colocarCinturaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colocarCinturaoButtonActionPerformed
        if(Utilidades.EstadoItem.getInstance().isFitaCinturao()){
            TelaCinturaoInstalado janelaCinturaoInstalado = new TelaCinturaoInstalado(this);
            janelaCinturaoInstalado.setVisible(true);
            Utilidades.EstadoPorta.setPosicaoAtual(EstadoPorta.Posicao.CINTURAO);
            this.dispose();
            if(Utilidades.EstadoPainelControle.getPosicaoAtual() == EstadoPainelControle.Posicao.ISOL){
                Pontuacao.registrarAtividade("ISO");
            }
        }
    }//GEN-LAST:event_colocarCinturaoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPortaSemiAbertaInterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPortaSemiAbertaInterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPortaSemiAbertaInterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPortaSemiAbertaInterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPortaSemiAbertaInterna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colocarCinturaoButton;
    private javax.swing.JButton portaSemiAbertaButton;
    private javax.swing.JLabel portaSemiAbertaInternaLabel;
    private javax.swing.JButton setaDireitaButton;
    // End of variables declaration//GEN-END:variables
}
