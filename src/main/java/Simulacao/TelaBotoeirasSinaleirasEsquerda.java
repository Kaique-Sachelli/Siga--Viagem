package Simulacao;

import Utilidades.TocadorSom;
import javax.swing.JFrame;


public class TelaBotoeirasSinaleirasEsquerda extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaBotoeirasSinaleirasEsquerda() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }

    public TelaBotoeirasSinaleirasEsquerda(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaBaixoButton = new javax.swing.JButton();
        portaAbrindoButton = new javax.swing.JButton();
        botoeirasSinaleirasLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Botoeiras e Sinaleiras");
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

        portaAbrindoButton.setBorderPainted(false);
        portaAbrindoButton.setContentAreaFilled(false);
        portaAbrindoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        portaAbrindoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portaAbrindoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(portaAbrindoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 80, 80));

        botoeirasSinaleirasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/telaBotoeirasSinaleiras.jpg"))); // NOI18N
        getContentPane().add(botoeirasSinaleirasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        TelaPortaEsquerda janelaPortaEsquerda = new TelaPortaEsquerda(this);
        janelaPortaEsquerda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaBaixoButtonActionPerformed

    private void portaAbrindoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portaAbrindoButtonActionPerformed
        TocadorSom.tocarSom("Sons/Porta-abrindo.wav");
        Utilidades.EstadoPortasCabine.getInstance().setEsquerdaAberta(true);
        TelaBotoeiraAcesa janelaBotoeiraAcessa = new TelaBotoeiraAcesa(this);
        janelaBotoeiraAcessa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_portaAbrindoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBotoeirasSinaleirasEsquerda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBotoeirasSinaleirasEsquerda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBotoeirasSinaleirasEsquerda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBotoeirasSinaleirasEsquerda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBotoeirasSinaleirasEsquerda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botoeirasSinaleirasLabel;
    private javax.swing.JButton portaAbrindoButton;
    private javax.swing.JButton setaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
