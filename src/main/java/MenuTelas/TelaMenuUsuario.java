package MenuTelas;

import SimulacaoCabine.TelaCabine;
import javax.swing.JFrame;

public class TelaMenuUsuario extends javax.swing.JFrame {
    
    private JFrame frame;
    
    public TelaMenuUsuario() {
        initComponents();
        setResizable(false);
    }
    
    public TelaMenuUsuario(JFrame frame){
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tituloMenuLabel = new javax.swing.JLabel();
        selecionarFaseButton = new javax.swing.JButton();
        configuracoesButton = new javax.swing.JButton();
        estatisticasButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        jogarButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Usuário");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(960, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImagens/logoMaua.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 230, 110));

        tituloMenuLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        tituloMenuLabel.setForeground(new java.awt.Color(0, 20, 137));
        tituloMenuLabel.setText("SIGA VIAGEM");
        tituloMenuLabel.setMaximumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setMinimumSize(new java.awt.Dimension(320, 75));
        tituloMenuLabel.setPreferredSize(new java.awt.Dimension(320, 75));
        getContentPane().add(tituloMenuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 80));

        selecionarFaseButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        selecionarFaseButton.setForeground(new java.awt.Color(0, 20, 137));
        selecionarFaseButton.setText("SELECIONAR FASE");
        selecionarFaseButton.setBorder(null);
        selecionarFaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecionarFaseButton.setMaximumSize(new java.awt.Dimension(75, 25));
        selecionarFaseButton.setMinimumSize(new java.awt.Dimension(75, 25));
        selecionarFaseButton.setPreferredSize(new java.awt.Dimension(75, 25));
        selecionarFaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarFaseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(selecionarFaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 220, 60));

        configuracoesButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        configuracoesButton.setForeground(new java.awt.Color(0, 20, 137));
        configuracoesButton.setText("CONFIGURAÇÕES");
        configuracoesButton.setBorder(null);
        configuracoesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configuracoesButton.setMaximumSize(new java.awt.Dimension(75, 25));
        configuracoesButton.setMinimumSize(new java.awt.Dimension(75, 25));
        configuracoesButton.setPreferredSize(new java.awt.Dimension(75, 25));
        configuracoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracoesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(configuracoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 220, 60));

        estatisticasButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        estatisticasButton.setForeground(new java.awt.Color(0, 20, 137));
        estatisticasButton.setText("ESTATÍSTICAS");
        estatisticasButton.setBorder(null);
        estatisticasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estatisticasButton.setMaximumSize(new java.awt.Dimension(75, 25));
        estatisticasButton.setMinimumSize(new java.awt.Dimension(75, 25));
        estatisticasButton.setPreferredSize(new java.awt.Dimension(75, 25));
        estatisticasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estatisticasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(estatisticasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 220, 60));

        sairButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        sairButton.setForeground(new java.awt.Color(0, 20, 137));
        sairButton.setText("SAIR");
        sairButton.setBorder(null);
        sairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairButton.setMaximumSize(new java.awt.Dimension(75, 25));
        sairButton.setMinimumSize(new java.awt.Dimension(75, 25));
        sairButton.setPreferredSize(new java.awt.Dimension(75, 25));
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sairButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 220, 60));

        jogarButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jogarButton.setForeground(new java.awt.Color(0, 20, 137));
        jogarButton.setText("JOGAR");
        jogarButton.setBorder(null);
        jogarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jogarButton.setMaximumSize(new java.awt.Dimension(75, 25));
        jogarButton.setMinimumSize(new java.awt.Dimension(75, 25));
        jogarButton.setPreferredSize(new java.awt.Dimension(75, 25));
        jogarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jogarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 220, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImagens/mapaMetro.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 580, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jogarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarButtonActionPerformed
        TelaCabine janelaCabine = new TelaCabine(this);
        janelaCabine.setVisible(true);
    }//GEN-LAST:event_jogarButtonActionPerformed

    private void selecionarFaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarFaseButtonActionPerformed
        SelecionarFase janelaSelecionar  = new SelecionarFase(this);
        janelaSelecionar.setVisible(true);
//      this.dispose(); Alteração bossini
    }//GEN-LAST:event_selecionarFaseButtonActionPerformed

    private void configuracoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracoesButtonActionPerformed
        TelaConfiguracoes janelaConfiguracoes = new TelaConfiguracoes(this);
        janelaConfiguracoes.setVisible(true);
        // Certo
    }//GEN-LAST:event_configuracoesButtonActionPerformed

    private void estatisticasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estatisticasButtonActionPerformed
        TelaEstatistica janelaEstatistica = new TelaEstatistica(this);
        janelaEstatistica.setVisible(true);
        // 
    }//GEN-LAST:event_estatisticasButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton configuracoesButton;
    private javax.swing.JButton estatisticasButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jogarButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton selecionarFaseButton;
    private javax.swing.JLabel tituloMenuLabel;
    // End of variables declaration//GEN-END:variables
}
