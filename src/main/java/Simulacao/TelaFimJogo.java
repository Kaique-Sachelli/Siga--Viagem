package Simulacao;

import MenuTelas.TelaMenuUsuario;
import MenuTelasAdmin.TelaMenuAdmin;
import Modelo.Estatistica;
import Persistencia.DAO;
import Utilidades.AbandonouSimulacao;
import Utilidades.DetectarErroFatal;
import Utilidades.EstadoCBTC;
import Utilidades.EstadoPainelControle;
import Utilidades.EstadoPorta;
import Utilidades.EstadoReversora;
import Utilidades.EstadoSom;
import Utilidades.Pontuacao;
import Utilidades.TocadorSom;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaFimJogo extends javax.swing.JFrame {
    
    private JFrame frame;
    private boolean salvarEstatistica(Estatistica est){
        try{
            var dao = new DAO();
            boolean atualizou = dao.salvarEstatistica(est);
            return atualizou;
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Salvamento de estatísticas não disponivel no momento.");
            boolean atualizou = false;
            return atualizou;
        }
    }
   
    public TelaFimJogo() {
        initComponents();
        var estatistica = new Estatistica(Pontuacao.contarErrosCometidos(), 
                Pontuacao.calcularAcertos(), 
                Pontuacao.calcularPontuacao() + Pontuacao.calcularErros(), 
                DetectarErroFatal.getInstance().isErroFatal(),
                AbandonouSimulacao.getInstance().isAbandonou()
        );
        salvarEstatistica(estatistica);
    }
    
    public TelaFimJogo(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameOverLabel = new javax.swing.JLabel();
        reiniciarButton = new javax.swing.JButton();
        pontuacaoLabel = new javax.swing.JLabel();
        parabensLabel = new javax.swing.JLabel();
        errosLabel = new javax.swing.JLabel();
        acertosLabel = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        erroComumLabel = new javax.swing.JLabel();
        imagemFimJogoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Fim de Jogo");
        setMinimumSize(new java.awt.Dimension(345, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gameOverLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        gameOverLabel.setForeground(new java.awt.Color(255, 255, 255));
        gameOverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameOverLabel.setText("Fim de Jogo");
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
        pontuacaoLabel.setText("Sua pontuação foi de: " + Integer.toString(Utilidades.Pontuacao.calcularPontuacao() + Utilidades.Pontuacao.calcularErros()));
        getContentPane().add(pontuacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 960, 70));

        parabensLabel.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        parabensLabel.setForeground(new java.awt.Color(255, 255, 255));
        parabensLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parabensLabel.setText("Parabéns! Você concluiu a simulação");
        getContentPane().add(parabensLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 960, 70));

        errosLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        errosLabel.setForeground(new java.awt.Color(255, 255, 255));
        errosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errosLabel.setText("Sua quantidade de erros foi de: " + Integer.toString(Utilidades.Pontuacao.contarErrosCometidos()));
        getContentPane().add(errosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 960, 70));

        acertosLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        acertosLabel.setForeground(new java.awt.Color(255, 255, 255));
        acertosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acertosLabel.setText("Sua quantidade de acertos foi de: " + Integer.toString(Utilidades.Pontuacao.calcularAcertos()));
        getContentPane().add(acertosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 960, 70));

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

        erroComumLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        erroComumLabel.setForeground(new java.awt.Color(255, 255, 255));
        erroComumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erroComumLabel.setText("Seu(s) erro(s) mais comum foi: " + Utilidades.Pontuacao.getErroComum().toString());
        getContentPane().add(erroComumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 960, 60));

        imagemFimJogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/TelaFimJogo.png"))); // NOI18N
        getContentPane().add(imagemFimJogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reiniciarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarButtonActionPerformed
        Utilidades.AbandonouSimulacao.getInstance().setAbandonou(false);
        Utilidades.DetectarErroFatal.getInstance().setErroFatal(false);
        Utilidades.EstadoCBTC.setPosicaoAtual(EstadoCBTC.Posicao.AM);
        Utilidades.EstadoItem.getInstance().setChaveFitaCinturao(false);
        Utilidades.EstadoItem.getInstance().setFitaCinturao(false);
        Utilidades.EstadoItem.getInstance().setChaveServico(false);
        Utilidades.EstadoPainelControle.setPosicaoAtual(EstadoPainelControle.Posicao.NORMAL);
        Utilidades.EstadoPorta.setPosicaoAtual(EstadoPorta.Posicao.ABERTA);
        Utilidades.EstadoPortasCabine.getInstance().setEsquerdaAberta(true);
        Utilidades.EstadoReversora.setPosicaoAtual(EstadoReversora.Posicao.FRENTE);
        Utilidades.Pontuacao.zerarAtividadesRealizadas();
        Utilidades.Pontuacao.zerarErrosCometidos();
        Utilidades.Pontuacao.zerarErroMaisComum();
        Utilidades.SituacaoPontuacao.getInstance().setSituacaoPA(false);
        Utilidades.SituacaoPontuacao.getInstance().setSituacaoCCO(false);
        Utilidades.SituacaoPontuacao.getInstance().setSituacaoLuz(false);
        Utilidades.SituacaoPontuacao.getInstance().setSituacaoSoleira(false);
        Utilidades.SituacaoPontuacao.getInstance().setSituacaoEmergencia(false);
        TocadorSom.setVolume(EstadoSom.isSomDesligado() ? 0 : EstadoSom.getVolume());
        TocadorSom.tocarSom("Sons/Gongo.wav");
        TelaCabine janelaCabine = new TelaCabine(this);
        janelaCabine.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reiniciarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        if(Modelo.UsuarioLogado.getUsuario().getInstrutor()){
            TelaMenuAdmin janelaMenuAdmin = new TelaMenuAdmin();
            janelaMenuAdmin.setVisible(true);
            this.dispose();
        } else{
            TelaMenuUsuario janelaMenuUsuario = new TelaMenuUsuario(this);
            janelaMenuUsuario.setVisible(true);
            this.dispose();
        }
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
            java.util.logging.Logger.getLogger(TelaFimJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFimJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFimJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFimJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFimJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertosLabel;
    private javax.swing.JLabel erroComumLabel;
    private javax.swing.JLabel errosLabel;
    private javax.swing.JLabel gameOverLabel;
    private javax.swing.JLabel imagemFimJogoLabel;
    private javax.swing.JLabel parabensLabel;
    private javax.swing.JLabel pontuacaoLabel;
    private javax.swing.JButton reiniciarButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
