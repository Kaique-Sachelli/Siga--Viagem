package SimulacaoCabine;

import Simulacao.Pontuacao;
import javax.swing.JFrame;

public class TelaCabineTras extends javax.swing.JFrame {
    
    private JFrame frame;
    
    public TelaCabineTras() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }

    public TelaCabineTras(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaBaixoButton = new javax.swing.JButton();
        fitaButton = new javax.swing.JButton();
        cabineTrasLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Cabine parte de Trás");
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

        fitaButton.setContentAreaFilled(false);
        fitaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fitaButton.setMaximumSize(new java.awt.Dimension(110, 120));
        fitaButton.setMinimumSize(new java.awt.Dimension(110, 120));
        fitaButton.setPreferredSize(new java.awt.Dimension(110, 120));
        fitaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fitaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fitaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 110, 120));

        cabineTrasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Cabine - parte de trás.jpg"))); // NOI18N
        getContentPane().add(cabineTrasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaBaixoButtonActionPerformed

    private void fitaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fitaButtonActionPerformed
        Utilidades.EstadoItem.getInstance().setFitaCinturao(true);
        TelaCabineTrasVazia janelaCabineTrasVazia = new TelaCabineTrasVazia(this);
        janelaCabineTrasVazia.setVisible(true);
        this.dispose();
        if(Utilidades.EstadoItem.getInstance().isChaveServico()){
            Pontuacao.registrarAtividade("CACS");
            Utilidades.EstadoItem.getInstance().setChaveFitaCinturao(true);
        }
    }//GEN-LAST:event_fitaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCabineTras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCabineTras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCabineTras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCabineTras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCabineTras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cabineTrasLabel;
    private javax.swing.JButton fitaButton;
    private javax.swing.JButton setaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
