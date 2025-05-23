package SimulacaoCabine;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class TelaCabine extends javax.swing.JFrame {

   private JFrame frame;
   
    public TelaCabine() {
        initComponents();
        setResizable(false);
    }

    public TelaCabine(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        ADUButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cabine");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ADUButton.setBorder(null);
        ADUButton.setContentAreaFilled(false);
        ADUButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADUButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADUButtonMouseExited(evt);
            }
        });
        ADUButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADUButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ADUButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 200, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/01 - Painel (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADUButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADUButtonActionPerformed
        TelaADU janelaADU  = new TelaADU(this);
        janelaADU.setVisible(true);
    }//GEN-LAST:event_ADUButtonActionPerformed

    private void ADUButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADUButtonMouseEntered
        ADUButton.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
    }//GEN-LAST:event_ADUButtonMouseEntered

    private void ADUButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADUButtonMouseExited
        ADUButton.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_ADUButtonMouseExited

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
            java.util.logging.Logger.getLogger(TelaCabine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCabine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCabine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCabine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCabine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADUButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
