package SimulacaoCabine;

import Simulacao.Pontuacao;
import javax.swing.JFrame;
import Utilidades.EstadoCBTC;

public class TelaCBTC_RM extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaCBTC_RM() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }

    public TelaCBTC_RM(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaBaixoButton = new javax.swing.JButton();
        cbtcRMButton = new javax.swing.JButton();
        cbtcRMLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela CBTC RM");
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

        cbtcRMButton.setContentAreaFilled(false);
        cbtcRMButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbtcRMButton.setMaximumSize(new java.awt.Dimension(230, 230));
        cbtcRMButton.setMinimumSize(new java.awt.Dimension(230, 230));
        cbtcRMButton.setPreferredSize(new java.awt.Dimension(230, 230));
        cbtcRMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtcRMButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cbtcRMButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 230, 230));

        cbtcRMLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Chave do CBTC - RM.jpg"))); // NOI18N
        getContentPane().add(cbtcRMLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        if(Utilidades.EstadoItem.getInstance().isChaveServico()){
            TelaColunaLateral janelaColunaLateral = new TelaColunaLateral(this);
            janelaColunaLateral.setVisible(true);
            this.dispose();
        } else{
            TelaColunaLateralChave janelaColunaLateralChave = new TelaColunaLateralChave(this);
            janelaColunaLateralChave.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_setaBaixoButtonActionPerformed

    private void cbtcRMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtcRMButtonActionPerformed
        EstadoCBTC.setPosicaoAtual(EstadoCBTC.Posicao.AM);
        TelaCBTC_AM telaAM = new TelaCBTC_AM(this);
        telaAM.setVisible(true);
        this.dispose();
        Pontuacao.registrarAtividade("AM");
    }//GEN-LAST:event_cbtcRMButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCBTC_RM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCBTC_RM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCBTC_RM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCBTC_RM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCBTC_RM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cbtcRMButton;
    private javax.swing.JLabel cbtcRMLabel;
    private javax.swing.JButton setaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
