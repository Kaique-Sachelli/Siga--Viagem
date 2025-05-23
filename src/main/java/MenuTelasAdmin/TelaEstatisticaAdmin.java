package MenuTelasAdmin;

import javax.swing.JFrame;


public class TelaEstatisticaAdmin extends javax.swing.JFrame {

    private JFrame frame;
    
    public TelaEstatisticaAdmin() {
        initComponents();
        setResizable(false);
    }

    public TelaEstatisticaAdmin(JFrame frame){
        this.frame = frame;
        this.frame.setVisible(false);
        initComponents();
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        voltarMenuButton = new javax.swing.JButton();
        estatisticasLabel = new javax.swing.JLabel();
        linhaAzulLabel = new javax.swing.JLabel();
        rankingLabel = new javax.swing.JLabel();
        acertosLabel = new javax.swing.JLabel();
        errosLabel = new javax.swing.JLabel();
        errosFataisLabel = new javax.swing.JLabel();
        tempoJogoLabel = new javax.swing.JLabel();
        jogadorLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estatísticas");
        setMinimumSize(new java.awt.Dimension(960, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(voltarMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 220, 60));

        estatisticasLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        estatisticasLabel.setForeground(new java.awt.Color(0, 20, 137));
        estatisticasLabel.setText("ESTATÍSTICAS DO JOGADOR");
        getContentPane().add(estatisticasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 640, 80));

        linhaAzulLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImagens/linhaAzul.png"))); // NOI18N
        getContentPane().add(linhaAzulLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 640));

        rankingLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rankingLabel.setText("Ranking:");
        getContentPane().add(rankingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));
        rankingLabel.getAccessibleContext().setAccessibleName("");

        acertosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        acertosLabel.setText("Acertos:");
        getContentPane().add(acertosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        errosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosLabel.setText("Erros:");
        getContentPane().add(errosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        errosFataisLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosFataisLabel.setText("Erros Graves:");
        getContentPane().add(errosFataisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        tempoJogoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tempoJogoLabel.setText("Tempo de Jogo:");
        getContentPane().add(tempoJogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jogadorLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jogadorLabel.setText("Jogador:");
        getContentPane().add(jogadorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

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
            java.util.logging.Logger.getLogger(TelaEstatisticaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstatisticaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstatisticaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstatisticaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstatisticaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertosLabel;
    private javax.swing.JLabel errosFataisLabel;
    private javax.swing.JLabel errosLabel;
    private javax.swing.JLabel estatisticasLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jogadorLabel;
    private javax.swing.JLabel linhaAzulLabel;
    private javax.swing.JLabel rankingLabel;
    private javax.swing.JLabel tempoJogoLabel;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
