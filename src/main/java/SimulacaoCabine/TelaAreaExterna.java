package SimulacaoCabine;

import Utilidades.EstadoPorta;
import javax.swing.JFrame;

public class TelaAreaExterna extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaAreaExterna() {
        initComponents();
    }

    public TelaAreaExterna(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaEsquerdaButton = new javax.swing.JButton();
        setaCimaButton = new javax.swing.JButton();
        painelDeAcessoButton = new javax.swing.JButton();
        areaExternaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Área Externa");
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

        setaCimaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaCima.png"))); // NOI18N
        setaCimaButton.setContentAreaFilled(false);
        setaCimaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setaCimaButton.setPreferredSize(new java.awt.Dimension(100, 100));
        setaCimaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaCimaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(setaCimaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        painelDeAcessoButton.setContentAreaFilled(false);
        painelDeAcessoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelDeAcessoButton.setMaximumSize(new java.awt.Dimension(72, 130));
        painelDeAcessoButton.setMinimumSize(new java.awt.Dimension(72, 130));
        painelDeAcessoButton.setPreferredSize(new java.awt.Dimension(72, 130));
        painelDeAcessoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelDeAcessoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(painelDeAcessoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 72, 130));

        areaExternaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Sinalização externa de portas fechadas.jpg"))); // NOI18N
        getContentPane().add(areaExternaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaEsquerdaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaEsquerdaButtonActionPerformed
        TelaPortaEsquerda janelaPortaEsquerda = new TelaPortaEsquerda(this);
        janelaPortaEsquerda.setVisible(true);
    }//GEN-LAST:event_setaEsquerdaButtonActionPerformed

    private void setaCimaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaCimaButtonActionPerformed
        if(Utilidades.EstadoPorta.getPosicaoAtual() == EstadoPorta.Posicao.FITA){
            TelaVisaoPortaIsolada janelaPortaIsolada = new TelaVisaoPortaIsolada(this);
            janelaPortaIsolada.setVisible(true);
            this.dispose();
        } else{
            TelaVisaoGeral janelaVisaoGeral = new TelaVisaoGeral(this);
            janelaVisaoGeral.setVisible(true);   
        }
    }//GEN-LAST:event_setaCimaButtonActionPerformed

    private void painelDeAcessoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelDeAcessoButtonActionPerformed
        TelaPainelDeAcesso janelaPainelDeAcesso = new TelaPainelDeAcesso(this);
        janelaPainelDeAcesso.setVisible(true);
    }//GEN-LAST:event_painelDeAcessoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAreaExterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAreaExterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAreaExterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAreaExterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAreaExterna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaExternaLabel;
    private javax.swing.JButton painelDeAcessoButton;
    private javax.swing.JButton setaCimaButton;
    private javax.swing.JButton setaEsquerdaButton;
    // End of variables declaration//GEN-END:variables
}
