package SimulacaoCabine;

import javax.swing.JFrame;

public class TelaPaineisEmergencia extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaPaineisEmergencia() {
        initComponents();
    }
    
    public TelaPaineisEmergencia(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetaEsquerdaButton1 = new javax.swing.JButton();
        PaineisEmergenciaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Paineis Emergencia");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SetaEsquerdaButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaEsquerda.png"))); // NOI18N
        SetaEsquerdaButton1.setContentAreaFilled(false);
        SetaEsquerdaButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetaEsquerdaButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        SetaEsquerdaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetaEsquerdaButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(SetaEsquerdaButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        PaineisEmergenciaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Paineis_de_Saida_de_Emergencia (1).png"))); // NOI18N
        getContentPane().add(PaineisEmergenciaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetaEsquerdaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetaEsquerdaButton1ActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SetaEsquerdaButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPaineisEmergencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPaineisEmergencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPaineisEmergencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPaineisEmergencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPaineisEmergencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PaineisEmergenciaLabel;
    private javax.swing.JButton SetaEsquerdaButton1;
    // End of variables declaration//GEN-END:variables
}
