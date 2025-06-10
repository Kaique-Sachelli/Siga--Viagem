package SimulacaoCabine;

import Simulacao.Pontuacao;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem; // Remover imports desnecessarios
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import Utilidades.TocadorSom;


public class TelaBotoeiraAcessa extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaBotoeiraAcessa() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }
    
    public TelaBotoeiraAcessa(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaBaixoButton = new javax.swing.JButton();
        portaFechandoButton = new javax.swing.JButton();
        botoeiraAcessaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Botoeira Acessa");
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
        getContentPane().add(setaBaixoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 650, -1, -1));

        portaFechandoButton.setContentAreaFilled(false);
        portaFechandoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        portaFechandoButton.setMaximumSize(new java.awt.Dimension(72, 80));
        portaFechandoButton.setMinimumSize(new java.awt.Dimension(72, 80));
        portaFechandoButton.setPreferredSize(new java.awt.Dimension(72, 80));
        portaFechandoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portaFechandoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(portaFechandoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 72, 80));

        botoeiraAcessaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/boteira acessa.jpg"))); // NOI18N
        getContentPane().add(botoeiraAcessaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaBaixoButtonActionPerformed

    private void portaFechandoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portaFechandoButtonActionPerformed
        TocadorSom.tocarSom("Sons/Porta-fechando.wav");
    }//GEN-LAST:event_portaFechandoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBotoeiraAcessa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBotoeiraAcessa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBotoeiraAcessa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBotoeiraAcessa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBotoeiraAcessa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botoeiraAcessaLabel;
    private javax.swing.JButton portaFechandoButton;
    private javax.swing.JButton setaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
