package Simulacao;

import Utilidades.Pontuacao;
import Utilidades.EstadoPorta;
import javax.swing.JFrame;

public class TelaVisaoGeral extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaVisaoGeral() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }

    public TelaVisaoGeral(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetaEsquerdaButton1 = new javax.swing.JButton();
        setaEsquerdaButton = new javax.swing.JButton();
        setaDireitaButton = new javax.swing.JButton();
        sinalizacaoAcessaButton = new javax.swing.JButton();
        visaoGeralLabel = new javax.swing.JLabel();

        SetaEsquerdaButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaEsquerda.png"))); // NOI18N
        SetaEsquerdaButton1.setContentAreaFilled(false);
        SetaEsquerdaButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetaEsquerdaButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        SetaEsquerdaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetaEsquerdaButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Visão Geral");
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

        sinalizacaoAcessaButton.setContentAreaFilled(false);
        sinalizacaoAcessaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sinalizacaoAcessaButton.setMaximumSize(new java.awt.Dimension(72, 50));
        sinalizacaoAcessaButton.setMinimumSize(new java.awt.Dimension(72, 50));
        sinalizacaoAcessaButton.setPreferredSize(new java.awt.Dimension(72, 50));
        sinalizacaoAcessaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinalizacaoAcessaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sinalizacaoAcessaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 72, 50));

        visaoGeralLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Visão geral do carro.jpg"))); // NOI18N
        getContentPane().add(visaoGeralLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetaEsquerdaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaEsquerdaButton1ActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SetaEsquerdaButton1ActionPerformed

    private void setaEsquerdaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaEsquerdaButtonActionPerformed
        TelaAreaExterna janelaAreaExterna = new TelaAreaExterna(this);
        janelaAreaExterna.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaEsquerdaButtonActionPerformed

    private void setaDireitaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaDireitaButtonActionPerformed
        if(Utilidades.EstadoPorta.getPosicaoAtual() == EstadoPorta.Posicao.ABERTA){
            TelaPortaSemiAberta janelaPortaSemiAberta = new TelaPortaSemiAberta(this);
            janelaPortaSemiAberta.setVisible(true);
            this.dispose();
        } else if(Utilidades.EstadoPorta.getPosicaoAtual() == EstadoPorta.Posicao.CINTURAO){
            TelaCinturaoInstalado janelaCinturaoInstalado = new TelaCinturaoInstalado(this);
            janelaCinturaoInstalado.setVisible(true);
        } else if(Utilidades.EstadoPorta.getPosicaoAtual() == EstadoPorta.Posicao.FECHADA){
            TelaPortaFechada janelaPortaFechada = new TelaPortaFechada(this);
            janelaPortaFechada.setVisible(true);
            this.dispose();
        } else{
            TelaVisaoPortaIsolada janelaPortaIsolada = new TelaVisaoPortaIsolada(this);
            janelaPortaIsolada.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_setaDireitaButtonActionPerformed

    private void sinalizacaoAcessaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinalizacaoAcessaButtonActionPerformed
        TelaSinalizacaoExternaAcesa janelaExternaAcessa = new TelaSinalizacaoExternaAcesa(this);
        janelaExternaAcessa.setVisible(true);
        if(Utilidades.SituacaoPontuacao.getInstance().isSituacaoLuz() == false){
            Pontuacao.registrarAtividade("LPE");
            Utilidades.SituacaoPontuacao.getInstance().setSituacaoLuz(true);
        } else {
            Pontuacao.registrarErro("LPE");
        }
    }//GEN-LAST:event_sinalizacaoAcessaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVisaoGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVisaoGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVisaoGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVisaoGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVisaoGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SetaEsquerdaButton1;
    private javax.swing.JButton setaDireitaButton;
    private javax.swing.JButton setaEsquerdaButton;
    private javax.swing.JButton sinalizacaoAcessaButton;
    private javax.swing.JLabel visaoGeralLabel;
    // End of variables declaration//GEN-END:variables
}
