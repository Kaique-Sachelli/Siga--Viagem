package SimulacaoCabine;

import MenuTelas.TelaMenuUsuario;
import Utilidades.EstadoCBTC;
import Utilidades.EstadoPainelControle;
import Utilidades.EstadoPorta;
import Utilidades.EstadoReversora;
import javax.swing.JFrame;

public class TelaGameOver extends javax.swing.JFrame {
    
    private JFrame frame;
    
    public TelaGameOver() {
        initComponents();
    }
    
    public TelaGameOver(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acertosLabel = new javax.swing.JLabel();
        gameOverLabel = new javax.swing.JLabel();
        reiniciarButton = new javax.swing.JButton();
        pontuacaoLabel = new javax.swing.JLabel();
        erroFatalLabel = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        acertosLabel1 = new javax.swing.JLabel();
        imagemGameOverLabel = new javax.swing.JLabel();

        acertosLabel.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        acertosLabel.setForeground(new java.awt.Color(255, 255, 255));
        acertosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acertosLabel.setText("Sua quantidade de acertos foi de: " + Integer.toString(Simulacao.Pontuacao.calcularAcertos()));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Game Over");
        setMinimumSize(new java.awt.Dimension(345, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gameOverLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        gameOverLabel.setForeground(new java.awt.Color(255, 255, 255));
        gameOverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameOverLabel.setText("GAME OVER");
        getContentPane().add(gameOverLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 960, 70));

        reiniciarButton.setBackground(new java.awt.Color(255, 255, 255));
        reiniciarButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        reiniciarButton.setForeground(new java.awt.Color(0, 20, 137));
        reiniciarButton.setText("REINICIAR SIMULAÇÃO");
        reiniciarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reiniciarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 270, 80));

        pontuacaoLabel.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        pontuacaoLabel.setForeground(new java.awt.Color(255, 255, 255));
        pontuacaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pontuacaoLabel.setText("Sua pontuação foi de: " + Integer.toString(Simulacao.Pontuacao.calcularPontuacao() + Simulacao.Pontuacao.calcularErros()));
        getContentPane().add(pontuacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 960, 70));

        erroFatalLabel.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        erroFatalLabel.setForeground(new java.awt.Color(255, 255, 255));
        erroFatalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erroFatalLabel.setText("Você cometeu um erro fatal!");
        getContentPane().add(erroFatalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 960, 70));

        voltarButton.setBackground(new java.awt.Color(255, 255, 255));
        voltarButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        voltarButton.setForeground(new java.awt.Color(0, 20, 137));
        voltarButton.setText("VOLTAR AO MENU");
        voltarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 270, 80));

        acertosLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        acertosLabel1.setForeground(new java.awt.Color(255, 255, 255));
        acertosLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acertosLabel1.setText("Sua quantidade de acertos foi de: " + Integer.toString(Simulacao.Pontuacao.calcularAcertos()));
        getContentPane().add(acertosLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 960, 70));

        imagemGameOverLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/TelaGameOver.png"))); // NOI18N
        getContentPane().add(imagemGameOverLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reiniciarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarButtonActionPerformed
        Utilidades.DetectarErroFatal.getInstance().setErroFatal(false);
        Utilidades.EstadoCBTC.setPosicaoAtual(EstadoCBTC.Posicao.AM);
        Utilidades.EstadoItem.getInstance().setChaveFitaCinturao(false);
        Utilidades.EstadoItem.getInstance().setFitaCinturao(false);
        Utilidades.EstadoItem.getInstance().setChaveServico(false);
        Utilidades.EstadoPainelControle.setPosicaoAtual(EstadoPainelControle.Posicao.NORMAL);
        Utilidades.EstadoPorta.setPosicaoAtual(EstadoPorta.Posicao.ABERTA);
        Utilidades.EstadoReversora.setPosicaoAtual(EstadoReversora.Posicao.FRENTE);
        Simulacao.Pontuacao.zerarAtividadesRealizadas();
        TelaCabine janelaCabine = new TelaCabine(this);
        janelaCabine.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reiniciarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        TelaMenuUsuario janelaMenuUsuario = new TelaMenuUsuario();
        janelaMenuUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGameOver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertosLabel;
    private javax.swing.JLabel acertosLabel1;
    private javax.swing.JLabel erroFatalLabel;
    private javax.swing.JLabel gameOverLabel;
    private javax.swing.JLabel imagemGameOverLabel;
    private javax.swing.JLabel pontuacaoLabel;
    private javax.swing.JButton reiniciarButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
