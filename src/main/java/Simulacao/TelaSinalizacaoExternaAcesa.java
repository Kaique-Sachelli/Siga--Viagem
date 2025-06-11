package Simulacao;

import javax.swing.JFrame;

public class TelaSinalizacaoExternaAcesa extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaSinalizacaoExternaAcesa() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }

    public TelaSinalizacaoExternaAcesa(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaEsquerdaButton = new javax.swing.JButton();
        sinalizacaoExternaAcesaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Sinalizacao Externa Acesa");
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
        getContentPane().add(setaEsquerdaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        sinalizacaoExternaAcesaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Sinalização externa acesa 1 (1).jpg"))); // NOI18N
        getContentPane().add(sinalizacaoExternaAcesaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaEsquerdaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaEsquerdaButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaEsquerdaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSinalizacaoExternaAcesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSinalizacaoExternaAcesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSinalizacaoExternaAcesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSinalizacaoExternaAcesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSinalizacaoExternaAcesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton setaEsquerdaButton;
    private javax.swing.JLabel sinalizacaoExternaAcesaLabel;
    // End of variables declaration//GEN-END:variables
}
