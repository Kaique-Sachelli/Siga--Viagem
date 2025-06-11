package Simulacao;

import MenuTelas.TelaConfiguracoes;
import MenuTelas.TelaMenuUsuario;
import javax.swing.JFrame;

public class TelaMenuJogo extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaMenuJogo() {
        initComponents();
        setResizable(false);
    }

    public TelaMenuJogo(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sairButton = new javax.swing.JButton();
        somButton = new javax.swing.JButton();
        continuarButton = new javax.swing.JButton();
        guiaDeComoJogarButton1 = new javax.swing.JButton();
        metroConceitoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Menu Jogo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 20, 137));
        jLabel1.setText("Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        sairButton.setBackground(new java.awt.Color(0, 20, 137));
        sairButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        sairButton.setForeground(new java.awt.Color(255, 255, 255));
        sairButton.setText("SAIR");
        sairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sairButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 340, 100));

        somButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        somButton.setForeground(new java.awt.Color(0, 20, 137));
        somButton.setText("SOM");
        somButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        somButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somButtonActionPerformed(evt);
            }
        });
        getContentPane().add(somButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 340, 100));

        continuarButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        continuarButton.setForeground(new java.awt.Color(0, 20, 137));
        continuarButton.setText("CONTINUAR");
        continuarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarButtonActionPerformed1(evt);
            }
        });
        getContentPane().add(continuarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 340, 100));

        guiaDeComoJogarButton1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        guiaDeComoJogarButton1.setForeground(new java.awt.Color(0, 20, 137));
        guiaDeComoJogarButton1.setText("GUIA DE COMO JOGAR");
        guiaDeComoJogarButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guiaDeComoJogarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiaDeComoJogarButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(guiaDeComoJogarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 340, 100));

        metroConceitoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Metro Conceito.png"))); // NOI18N
        getContentPane().add(metroConceitoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        TelaMenuUsuario janelaMenuUsuario = new TelaMenuUsuario(this);
        janelaMenuUsuario.setVisible(true);
    }//GEN-LAST:event_sairButtonActionPerformed

    private void somButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somButtonActionPerformed
       TelaConfiguracoes janelaConfiguracoes = new TelaConfiguracoes(this);
       janelaConfiguracoes.setVisible(true);
    }//GEN-LAST:event_somButtonActionPerformed

    private void continuarButtonActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarButtonActionPerformed1
        this.dispose();
    }//GEN-LAST:event_continuarButtonActionPerformed1

    private void guiaDeComoJogarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiaDeComoJogarButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guiaDeComoJogarButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(TelaMenuJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuarButton;
    private javax.swing.JButton guiaDeComoJogarButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel metroConceitoLabel;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton somButton;
    // End of variables declaration//GEN-END:variables

}
