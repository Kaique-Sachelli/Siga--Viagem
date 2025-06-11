package MenuTelas;

import MenuTelasAdmin.TelaMenuAdmin;
import javax.swing.*;
import Utilidades.TocadorSom;
import Utilidades.EstadoSom;

public class TelaConfiguracoes extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaConfiguracoes() {
        initComponents();
        configurarSlider();
        desligarSomCheckBox.setSelected(EstadoSom.isSomDesligado());
        setResizable(false);
    }
    
    private static int valorDoSlider = 10;

    private void configurarSlider() {
        ajusteSomSlider.setMinimum(0);
        ajusteSomSlider.setMaximum(10);
        ajusteSomSlider.setMajorTickSpacing(1);
        ajusteSomSlider.setPaintTicks(true);
        ajusteSomSlider.setPaintLabels(true);

        ajusteSomSlider.setValue(Utilidades.EstadoSom.getVolume());

        ajusteSomSlider.addChangeListener(evt -> {
            int valor = ajusteSomSlider.getValue();
            valorDoSlider = valor;
            Utilidades.EstadoSom.setVolume(valor);
            TocadorSom.setVolume(EstadoSom.isSomDesligado() ? 0 : valor);
        });
    }

    
    public TelaConfiguracoes(JFrame frame){
        this.frame = frame;
        this.frame.setVisible(false);
        initComponents();
        configurarSlider();
        desligarSomCheckBox.setSelected(EstadoSom.somDesligado);
        setResizable(false);
        TocadorSom.setVolume(EstadoSom.isSomDesligado() ? 0 : EstadoSom.getVolume());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoMauaLabel = new javax.swing.JLabel();
        tituloMenuLabel = new javax.swing.JLabel();
        ajusteSomSlider = new javax.swing.JSlider();
        mapaMetroLabel = new javax.swing.JLabel();
        desligarSomCheckBox = new javax.swing.JCheckBox();
        ajustarSomLabel = new javax.swing.JLabel();
        voltarMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuração de Som");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(960, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoMauaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImagens/logoMaua.png"))); // NOI18N
        getContentPane().add(logoMauaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 230, 110));

        tituloMenuLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloMenuLabel.setForeground(new java.awt.Color(0, 20, 137));
        tituloMenuLabel.setText("CONFIGURAÇÕES DE SOM");
        tituloMenuLabel.setMaximumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setMinimumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setPreferredSize(new java.awt.Dimension(320, 75));
        getContentPane().add(tituloMenuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 580, 80));

        ajusteSomSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.W_RESIZE_CURSOR));
        ajusteSomSlider.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                ajusteSomSliderAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(ajusteSomSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 220, 20));

        mapaMetroLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImagens/mapaMetro.png"))); // NOI18N
        getContentPane().add(mapaMetroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 580, 450));

        desligarSomCheckBox.setText("Desligar som");
        desligarSomCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desligarSomCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(desligarSomCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, 20));

        ajustarSomLabel.setText("Ajustar volume");
        getContentPane().add(ajustarSomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, 20));

        voltarMenuButton.setBackground(new java.awt.Color(246, 246, 246));
        voltarMenuButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        voltarMenuButton.setForeground(new java.awt.Color(0, 20, 137));
        voltarMenuButton.setText("VOLTAR");
        voltarMenuButton.setBorder(null);
        voltarMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarMenuButton.setMaximumSize(new java.awt.Dimension(75, 25));
        voltarMenuButton.setMinimumSize(new java.awt.Dimension(75, 25));
        voltarMenuButton.setPreferredSize(new java.awt.Dimension(75, 25));
        voltarMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 220, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void desligarSomCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desligarSomCheckBoxActionPerformed
        EstadoSom.setSomDesligado(desligarSomCheckBox.isSelected());
        TocadorSom.setVolume(EstadoSom.isSomDesligado() ? 0 : valorDoSlider);
    }//GEN-LAST:event_desligarSomCheckBoxActionPerformed


    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

    private void ajusteSomSliderAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ajusteSomSliderAncestorMoved
        ajusteSomSlider.setValue(valorDoSlider);
    }//GEN-LAST:event_ajusteSomSliderAncestorMoved

   
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
            java.util.logging.Logger.getLogger(TelaConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfiguracoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ajustarSomLabel;
    private javax.swing.JSlider ajusteSomSlider;
    private javax.swing.JCheckBox desligarSomCheckBox;
    private javax.swing.JLabel logoMauaLabel;
    private javax.swing.JLabel mapaMetroLabel;
    private javax.swing.JLabel tituloMenuLabel;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
