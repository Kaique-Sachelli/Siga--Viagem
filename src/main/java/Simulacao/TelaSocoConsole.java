package Simulacao;

import javax.swing.JFrame;

public class TelaSocoConsole extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaSocoConsole() {
        initComponents();
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }

    public TelaSocoConsole(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaBaixoButton = new javax.swing.JButton();
        socoConsoleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Console");
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

        socoConsoleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Botão soco do console.jpg"))); // NOI18N
        getContentPane().add(socoConsoleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaBaixoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSocoConsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSocoConsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSocoConsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSocoConsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSocoConsole().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton setaBaixoButton;
    private javax.swing.JLabel socoConsoleLabel;
    // End of variables declaration//GEN-END:variables
}
