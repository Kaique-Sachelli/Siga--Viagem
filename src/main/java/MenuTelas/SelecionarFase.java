package MenuTelas;

import MenuTelasAdmin.TelaMenuAdmin;
import Simulacao.TelaCabine;
import Utilidades.EstadoCBTC;
import Utilidades.EstadoPainelControle;
import Utilidades.EstadoPorta;
import Utilidades.EstadoReversora;
import Utilidades.TocadorSom;
import javax.swing.*;

public class SelecionarFase extends javax.swing.JFrame {
    
    private JFrame frame;
    
    public SelecionarFase() {
        initComponents();
        setResizable(false);
    }
    
    public SelecionarFase(JFrame frame) {
        this.frame = frame;
        this.frame.setVisible(false);
        initComponents();
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloMenuLabel = new javax.swing.JLabel();
        voltarMenuButton = new javax.swing.JButton();
        fasePortasButton = new javax.swing.JButton();
        selecaoDeFasesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleção de Fases");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloMenuLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloMenuLabel.setForeground(new java.awt.Color(0, 20, 137));
        tituloMenuLabel.setText("SELEÇÃO DE FASES");
        tituloMenuLabel.setMaximumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setMinimumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setPreferredSize(new java.awt.Dimension(320, 75));
        getContentPane().add(tituloMenuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 430, 80));

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
        voltarMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                voltarMenuButtonMouseEntered(evt);
            }
        });
        voltarMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 130, 40));

        fasePortasButton.setContentAreaFilled(false);
        fasePortasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fasePortasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fasePortasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fasePortasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 100, 300, 220));

        selecaoDeFasesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImagens/SelecaoDeFases.png"))); // NOI18N
        getContentPane().add(selecaoDeFasesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

    private void voltarMenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMenuButtonMouseEntered
        
    }//GEN-LAST:event_voltarMenuButtonMouseEntered

    private void fasePortasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fasePortasButtonActionPerformed
        Utilidades.DetectarErroFatal.getInstance().setErroFatal(false);
        Utilidades.EstadoCBTC.setPosicaoAtual(EstadoCBTC.Posicao.AM);
        Utilidades.EstadoItem.getInstance().setChaveFitaCinturao(false);
        Utilidades.EstadoItem.getInstance().setFitaCinturao(false);
        Utilidades.EstadoItem.getInstance().setChaveServico(false);
        Utilidades.EstadoPainelControle.setPosicaoAtual(EstadoPainelControle.Posicao.NORMAL);
        Utilidades.EstadoPorta.setPosicaoAtual(EstadoPorta.Posicao.ABERTA);
        Utilidades.EstadoReversora.setPosicaoAtual(EstadoReversora.Posicao.FRENTE);
        Utilidades.Pontuacao.zerarAtividadesRealizadas();
        TelaCabine janelaCabine = new TelaCabine(this);
        janelaCabine.setVisible(true);
        TocadorSom.tocarSom("Sons/Gongo.wav");
        this.dispose();
    }//GEN-LAST:event_fasePortasButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SelecionarFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionarFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionarFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionarFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecionarFase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fasePortasButton;
    private javax.swing.JLabel selecaoDeFasesLabel;
    private javax.swing.JLabel tituloMenuLabel;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
