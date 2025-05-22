package MenuTelas;

import javax.swing.JFrame;

public class TelaEstatistica extends javax.swing.JFrame {
    
    private JFrame frame;
    
    public TelaEstatistica() {
        initComponents();
    }

    public TelaEstatistica(JFrame frame){
        this.frame = frame;
        this.frame.setVisible(false);
        initComponents();
        setResizable(false);
    }    
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarMenuButton = new javax.swing.JButton();
        estatisticasLabel = new javax.swing.JLabel();
        linhaAzulLabel = new javax.swing.JLabel();
        rankingLabel = new javax.swing.JLabel();
        acertosLabel = new javax.swing.JLabel();
        errosLabel = new javax.swing.JLabel();
        errosFataisLabel = new javax.swing.JLabel();
        tempoJogoLabel = new javax.swing.JLabel();
        jogadorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estatística");

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

        estatisticasLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        estatisticasLabel.setForeground(new java.awt.Color(0, 20, 137));
        estatisticasLabel.setText("ESTATÍSTICAS DO JOGADOR");

        linhaAzulLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/linhaAzul.png"))); // NOI18N

        rankingLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rankingLabel.setText("Ranking:");

        acertosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        acertosLabel.setText("Acertos:");

        errosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosLabel.setText("Erros:");

        errosFataisLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosFataisLabel.setText("Erros Graves:");

        tempoJogoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tempoJogoLabel.setText("Tempo de Jogo:");

        jogadorLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jogadorLabel.setText("Jogador:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(linhaAzulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(estatisticasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jogadorLabel)
                        .addComponent(rankingLabel)
                        .addComponent(acertosLabel)
                        .addComponent(errosLabel)
                        .addComponent(errosFataisLabel)
                        .addComponent(tempoJogoLabel)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(560, 560, 560)
                            .addComponent(voltarMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(linhaAzulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(estatisticasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jogadorLabel)
                            .addGap(18, 18, 18)
                            .addComponent(rankingLabel)
                            .addGap(68, 68, 68)
                            .addComponent(acertosLabel)
                            .addGap(8, 8, 8)
                            .addComponent(errosLabel)
                            .addGap(18, 18, 18)
                            .addComponent(errosFataisLabel)
                            .addGap(18, 18, 18)
                            .addComponent(tempoJogoLabel)
                            .addGap(118, 118, 118)
                            .addComponent(voltarMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaEstatistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstatistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstatistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstatistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstatistica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertosLabel;
    private javax.swing.JLabel errosFataisLabel;
    private javax.swing.JLabel errosLabel;
    private javax.swing.JLabel estatisticasLabel;
    private javax.swing.JLabel jogadorLabel;
    private javax.swing.JLabel linhaAzulLabel;
    private javax.swing.JLabel rankingLabel;
    private javax.swing.JLabel tempoJogoLabel;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
