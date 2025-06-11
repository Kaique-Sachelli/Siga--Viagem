package Simulacao;

import Utilidades.Pontuacao;
import javax.swing.JFrame;
import Utilidades.EstadoCBTC;

public class TelaColunaLateralChave extends javax.swing.JFrame {

    
    private JFrame frame;
    
    public TelaColunaLateralChave() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }
    
    public TelaColunaLateralChave(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaEsquerdaButton = new javax.swing.JButton();
        setaDireitaButton = new javax.swing.JButton();
        setaEsquerdaButton1 = new javax.swing.JButton();
        chaveCBTCButton = new javax.swing.JButton();
        chaveButton = new javax.swing.JButton();
        colunaLateralChaveLabel = new javax.swing.JLabel();

        setaEsquerdaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaEsquerda.png"))); // NOI18N
        setaEsquerdaButton.setContentAreaFilled(false);
        setaEsquerdaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setaEsquerdaButton.setPreferredSize(new java.awt.Dimension(100, 100));
        setaEsquerdaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaEsquerdaButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Coluna Latera Chave");
        setMinimumSize(new java.awt.Dimension(960, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        setaEsquerdaButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaEsquerda.png"))); // NOI18N
        setaEsquerdaButton1.setContentAreaFilled(false);
        setaEsquerdaButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setaEsquerdaButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        setaEsquerdaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaEsquerdaButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(setaEsquerdaButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        chaveCBTCButton.setContentAreaFilled(false);
        chaveCBTCButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chaveCBTCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaveCBTCButtonActionPerformed(evt);
            }
        });
        getContentPane().add(chaveCBTCButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 150, 160));

        chaveButton.setContentAreaFilled(false);
        chaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chaveButton.setMaximumSize(new java.awt.Dimension(76, 80));
        chaveButton.setMinimumSize(new java.awt.Dimension(76, 80));
        chaveButton.setPreferredSize(new java.awt.Dimension(76, 80));
        chaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(chaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 76, 80));

        colunaLateralChaveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Tela Coluna Lateral Chave (1).jpeg"))); // NOI18N
        getContentPane().add(colunaLateralChaveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaEsquerdaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaEsquerdaButtonActionPerformed
        TelaCabine janelaCabine = new TelaCabine(this);
        janelaCabine.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaEsquerdaButtonActionPerformed

    private void setaDireitaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaDireitaButtonActionPerformed
        TelaPortaDireita janelaPortaDireita = new TelaPortaDireita(this);
        janelaPortaDireita.setVisible(true);
    }//GEN-LAST:event_setaDireitaButtonActionPerformed

    private void setaEsquerdaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaEsquerdaButton1ActionPerformed
        TelaCabine janelaCabine = new TelaCabine(this);
        janelaCabine.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaEsquerdaButton1ActionPerformed

    private void chaveCBTCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaveCBTCButtonActionPerformed
        if (EstadoCBTC.getPosicaoAtual() == EstadoCBTC.Posicao.AM) {
            new TelaCBTC_AM(this).setVisible(true);
        } else {
            new TelaCBTC_RM(this).setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_chaveCBTCButtonActionPerformed

    private void chaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaveButtonActionPerformed
        Utilidades.EstadoItem.getInstance().setChaveServico(true);
        TelaColunaLateral janelaColunaLateral = new TelaColunaLateral(this);
        janelaColunaLateral.setVisible(true);
        this.dispose();
        if(Utilidades.EstadoItem.getInstance().isChaveFitaCinturao() == false){
            Utilidades.EstadoItem.getInstance().setChaveFitaCinturao(true);
            if(Utilidades.EstadoItem.getInstance().isFitaCinturao()){
                Pontuacao.registrarAtividade("CACS");
            }
        }
    }//GEN-LAST:event_chaveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaColunaLateralChave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaColunaLateralChave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaColunaLateralChave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaColunaLateralChave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaColunaLateralChave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chaveButton;
    private javax.swing.JButton chaveCBTCButton;
    private javax.swing.JLabel colunaLateralChaveLabel;
    private javax.swing.JButton setaDireitaButton;
    private javax.swing.JButton setaEsquerdaButton;
    private javax.swing.JButton setaEsquerdaButton1;
    // End of variables declaration//GEN-END:variables
}
