package SimulacaoCabine;

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
        DDUButton = new javax.swing.JButton();
        ADUButton = new javax.swing.JButton();
        VDUButton = new javax.swing.JButton();
        ModuloComunicacaoButton = new javax.swing.JButton();
        ReversoraButton = new javax.swing.JButton();
        SocoConsoleButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cabine");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DDUButton.setContentAreaFilled(false);
        DDUButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DDUButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DDUButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DDUButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 170, 80));

        ADUButton.setContentAreaFilled(false);
        ADUButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ADUButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADUButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ADUButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 200, 110));

        VDUButton.setContentAreaFilled(false);
        VDUButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VDUButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VDUButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VDUButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 200, 100));

        ModuloComunicacaoButton.setContentAreaFilled(false);
        ModuloComunicacaoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModuloComunicacaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModuloComunicacaoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ModuloComunicacaoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 100, 50));

        ReversoraButton.setContentAreaFilled(false);
        ReversoraButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReversoraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReversoraButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReversoraButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, 60));

        SocoConsoleButton.setContentAreaFilled(false);
        SocoConsoleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SocoConsoleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SocoConsoleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SocoConsoleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 180, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/01 - Painel (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADUButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADUButtonActionPerformed
        TelaADU janelaADU  = new TelaADU(this);
        janelaADU.setVisible(true);
    }//GEN-LAST:event_ADUButtonActionPerformed

    private void DDUButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DDUButtonActionPerformed
        TelaDDU janelaDDU = new TelaDDU(this);
        janelaDDU.setVisible(true);
    }//GEN-LAST:event_DDUButtonActionPerformed

    private void VDUButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VDUButtonActionPerformed
        TelaVDU janelaVDU = new TelaVDU(this);
        janelaVDU.setVisible(true);
    }//GEN-LAST:event_VDUButtonActionPerformed

    private void ModuloComunicacaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModuloComunicacaoButtonActionPerformed
        TelaModuloComunicacao janelaModulo= new TelaModuloComunicacao(this);
        janelaModulo.setVisible(true);
    }//GEN-LAST:event_ModuloComunicacaoButtonActionPerformed

    private void ReversoraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReversoraButtonActionPerformed
        TelaReversoraFrente janelaReversora = new TelaReversoraFrente(this);
        janelaReversora.setVisible(true);
    }//GEN-LAST:event_ReversoraButtonActionPerformed

    private void SocoConsoleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SocoConsoleButtonActionPerformed
        TelaSocoConsole janelaConsole = new TelaSocoConsole(this);
        janelaConsole.setVisible(true);
    }//GEN-LAST:event_SocoConsoleButtonActionPerformed
     
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
    private javax.swing.JButton DDUButton;
    private javax.swing.JButton ModuloComunicacaoButton;
    private javax.swing.JButton ReversoraButton;
    private javax.swing.JButton SocoConsoleButton;
    private javax.swing.JButton VDUButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
