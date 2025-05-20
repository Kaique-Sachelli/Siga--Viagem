package TelasAdmin;
import javax.swing.JFrame;

import Telas.*;

public class SelecionarFaseAdmin extends javax.swing.JFrame {

    private JFrame frame;
    
    public SelecionarFaseAdmin() {
        initComponents();
        setResizable(false);
    }

    public SelecionarFaseAdmin(JFrame frame) {
        this.frame = frame;
        this.frame.setVisible(false);
        initComponents();
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloMenuLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        voltarMenuButton = new javax.swing.JButton();
        selecaoFasesLabel = new javax.swing.JLabel();
        selecaoDeFasesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selecionar Fase");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloMenuLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloMenuLabel.setForeground(new java.awt.Color(0, 20, 137));
        tituloMenuLabel.setText("SELEÇÃO DE FASES");
        tituloMenuLabel.setMaximumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setMinimumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setPreferredSize(new java.awt.Dimension(320, 75));
        getContentPane().add(tituloMenuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 430, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMaua.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 230, 110));

        voltarMenuButton.setBackground(new java.awt.Color(246, 246, 246));
        voltarMenuButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        voltarMenuButton.setForeground(new java.awt.Color(0, 20, 137));
        voltarMenuButton.setText("VOLTAR");
        voltarMenuButton.setBorder(null);
        voltarMenuButton.setContentAreaFilled(false);
        voltarMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarMenuButton.setMaximumSize(new java.awt.Dimension(75, 25));
        voltarMenuButton.setMinimumSize(new java.awt.Dimension(75, 25));
        voltarMenuButton.setPreferredSize(new java.awt.Dimension(75, 25));
        voltarMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 220, 60));
        getContentPane().add(selecaoFasesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        selecaoDeFasesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SeleçãoFases.png"))); // NOI18N
        getContentPane().add(selecaoDeFasesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SelecionarFaseAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionarFaseAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionarFaseAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionarFaseAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecionarFaseAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel selecaoDeFasesLabel;
    private javax.swing.JLabel selecaoFasesLabel;
    private javax.swing.JLabel tituloMenuLabel;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
