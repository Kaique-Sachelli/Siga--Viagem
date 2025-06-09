package MenuTelasAdmin;

import Modelo.Estatistica;
import Modelo.Usuario;
import Persistencia.DAO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaEstatisticaAdmin extends javax.swing.JFrame {
    private void obterUsuarios(){
    try{
            var dao = new DAO();
            var usuarios = dao.obterUsuarios();
            usuarioComboBox.setModel(
                new DefaultComboBoxModel<Usuario>(usuarios.toArray(new Usuario[]{}))
            );
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Lista de usuarios não disponivel");
            
        }
}
    private void obterEstatistica(Usuario u){
        try{
            var dao = new DAO();
            var estatisticas = dao.obterEstatistica(u.getId());
            estatisticaComboBox.setModel(
                new DefaultComboBoxModel<Estatistica>(estatisticas.toArray(new Estatistica[]{}))
            );
            
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lista de simulações não disponível");
        }
    }
    
    private int obterRanking(Usuario u, Estatistica est){
        int rank;
        try{
            var dao = new DAO();
            rank = dao.obterRanking(est.getNumeroSimulacao(), u.getId());
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ranking de usuários não disponível.");
            rank = 0;
        }
        
        return rank;
    }

    private JFrame frame;
    
    public TelaEstatisticaAdmin() {
        initComponents();
        setResizable(false);
        obterUsuarios();
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
        simulacaoLabel = new javax.swing.JLabel();
        acertosLabel = new javax.swing.JLabel();
        errosLabel = new javax.swing.JLabel();
        errosFataisLabel = new javax.swing.JLabel();
        tempoJogoLabel = new javax.swing.JLabel();
        jogadorLabel = new javax.swing.JLabel();
        rankingLabel = new javax.swing.JLabel();
        estatisticaComboBox = new javax.swing.JComboBox<>();
        usuarioComboBox = new javax.swing.JComboBox<>();
        rankingLabel2 = new javax.swing.JLabel();

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

        simulacaoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        simulacaoLabel.setText("Simulação:");
        getContentPane().add(simulacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, 40));
        simulacaoLabel.getAccessibleContext().setAccessibleName("");

        acertosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        acertosLabel.setText("Acertos:");
        getContentPane().add(acertosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        errosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosLabel.setText("Erros:");
        getContentPane().add(errosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        errosFataisLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosFataisLabel.setText("Erros Graves:");
        getContentPane().add(errosFataisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        tempoJogoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tempoJogoLabel.setText("Tempo de Jogo:");
        getContentPane().add(tempoJogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, -1, -1));

        jogadorLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jogadorLabel.setText("Jogador:");
        jogadorLabel.setToolTipText("");
        getContentPane().add(jogadorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 90, 50));

        rankingLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rankingLabel.setText("ranking");
        getContentPane().add(rankingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        estatisticaComboBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        estatisticaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estatisticaComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(estatisticaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 380, 40));

        usuarioComboBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        usuarioComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 380, 40));

        rankingLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rankingLabel2.setText("Ranking:");
        getContentPane().add(rankingLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

    private void estatisticaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estatisticaComboBoxActionPerformed
       var usuarioSelecionado = (Usuario) usuarioComboBox.getSelectedItem();
       var estatisticaSelecionada = (Estatistica) estatisticaComboBox.getSelectedItem();
       rankingLabel.setText(String.valueOf(obterRanking(usuarioSelecionado, estatisticaSelecionada)));
       
    }//GEN-LAST:event_estatisticaComboBoxActionPerformed

    private void usuarioComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioComboBoxActionPerformed
        var usuarioSelecionado = (Usuario) usuarioComboBox.getSelectedItem();
        obterEstatistica(usuarioSelecionado);
    }//GEN-LAST:event_usuarioComboBoxActionPerformed

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
    private javax.swing.JComboBox<Estatistica> estatisticaComboBox;
    private javax.swing.JLabel estatisticasLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jogadorLabel;
    private javax.swing.JLabel linhaAzulLabel;
    private javax.swing.JLabel rankingLabel;
    private javax.swing.JLabel rankingLabel2;
    private javax.swing.JLabel simulacaoLabel;
    private javax.swing.JLabel tempoJogoLabel;
    private javax.swing.JComboBox<Usuario> usuarioComboBox;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
