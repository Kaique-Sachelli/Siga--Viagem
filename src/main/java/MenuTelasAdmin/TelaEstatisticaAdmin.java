package MenuTelasAdmin;

import Modelo.Estatistica;
import Modelo.Usuario;
import Modelo.UsuarioLogado;
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
    
    private int obterRanking(Estatistica est, Usuario u){
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
        tentativaLabel1 = new javax.swing.JLabel();
        jogadorLabel = new javax.swing.JLabel();
        rankingLabel = new javax.swing.JLabel();
        estatisticaComboBox = new javax.swing.JComboBox<>();
        usuarioComboBox = new javax.swing.JComboBox<>();
        rankingLabel2 = new javax.swing.JLabel();
        acertosLabel1 = new javax.swing.JLabel();
        acertosLabel = new javax.swing.JLabel();
        errosLabel1 = new javax.swing.JLabel();
        errosLabel = new javax.swing.JLabel();
        tempoJogoLabel1 = new javax.swing.JLabel();
        dataSimulacaoLabel = new javax.swing.JLabel();
        errosFataisLabel1 = new javax.swing.JLabel();
        erroFatalLabel = new javax.swing.JLabel();
        abandonadaLabel2 = new javax.swing.JLabel();
        situacaoLabel = new javax.swing.JLabel();
        pontuaçãoLabel1 = new javax.swing.JLabel();
        pontuacaoLabel = new javax.swing.JLabel();

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

        tentativaLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tentativaLabel1.setText("Tentativa:");
        getContentPane().add(tentativaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, 40));
        tentativaLabel1.getAccessibleContext().setAccessibleName("");

        jogadorLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jogadorLabel.setText("Jogador:");
        jogadorLabel.setToolTipText("");
        getContentPane().add(jogadorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 90, 50));

        rankingLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rankingLabel.setText("ranking");
        getContentPane().add(rankingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

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
        getContentPane().add(rankingLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        acertosLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        acertosLabel1.setText("Acertos:");
        getContentPane().add(acertosLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 110, 30));

        acertosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        acertosLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        acertosLabel.setText("Acertos");
        getContentPane().add(acertosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        errosLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        errosLabel1.setText("Erros:");
        getContentPane().add(errosLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 70, -1));

        errosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        errosLabel.setText("Erros");
        getContentPane().add(errosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        tempoJogoLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tempoJogoLabel1.setText("Data da Simulação:");
        getContentPane().add(tempoJogoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        dataSimulacaoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dataSimulacaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dataSimulacaoLabel.setText("Data Simulação");
        getContentPane().add(dataSimulacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        errosFataisLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosFataisLabel1.setText("Erro Fatal:");
        getContentPane().add(errosFataisLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        erroFatalLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        erroFatalLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        erroFatalLabel.setText("Erro Fatal");
        getContentPane().add(erroFatalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        abandonadaLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        abandonadaLabel2.setText("Situação:");
        getContentPane().add(abandonadaLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        situacaoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        situacaoLabel.setText("Situação");
        getContentPane().add(situacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));

        pontuaçãoLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pontuaçãoLabel1.setText("Pontuação:");
        getContentPane().add(pontuaçãoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        pontuacaoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pontuacaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pontuacaoLabel.setText("Pontuação");
        getContentPane().add(pontuacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed

        var telaMenuInst = new TelaMenuAdmin();
        telaMenuInst.setVisible(true);
        this.dispose();
          
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

    private void estatisticaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estatisticaComboBoxActionPerformed
       var usuarioSelecionado = (Usuario) usuarioComboBox.getSelectedItem();
       var estatisticaSelecionada = (Estatistica) estatisticaComboBox.getSelectedItem();
       rankingLabel.setText(String.valueOf(obterRanking(estatisticaSelecionada,usuarioSelecionado)+ "º"));
       acertosLabel.setText(String.valueOf((estatisticaSelecionada.getAcertos())));
       errosLabel.setText(String.valueOf((estatisticaSelecionada.getErros()))); 
        if(estatisticaSelecionada.getErroFatal()){
            erroFatalLabel.setText("Erro fatal cometido.");
        }
        else{
            erroFatalLabel.setText("Não cometido.");
        }
        
        pontuacaoLabel.setText(String.valueOf(estatisticaSelecionada.getPontuacao()));
        
        dataSimulacaoLabel.setText(String.valueOf(estatisticaSelecionada.getDataSimulacaoFormatada()));
        
        if(estatisticaSelecionada.isAbandonada()){
            situacaoLabel.setText("Simulação abandonada.");
            
        }
        else{
            situacaoLabel.setText("Simulação concluída.");
        }
       
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
    private javax.swing.JLabel abandonadaLabel2;
    private javax.swing.JLabel acertosLabel;
    private javax.swing.JLabel acertosLabel1;
    private javax.swing.JLabel dataSimulacaoLabel;
    private javax.swing.JLabel erroFatalLabel;
    private javax.swing.JLabel errosFataisLabel1;
    private javax.swing.JLabel errosLabel;
    private javax.swing.JLabel errosLabel1;
    private javax.swing.JComboBox<Estatistica> estatisticaComboBox;
    private javax.swing.JLabel estatisticasLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jogadorLabel;
    private javax.swing.JLabel linhaAzulLabel;
    private javax.swing.JLabel pontuacaoLabel;
    private javax.swing.JLabel pontuaçãoLabel1;
    private javax.swing.JLabel rankingLabel;
    private javax.swing.JLabel rankingLabel2;
    private javax.swing.JLabel situacaoLabel;
    private javax.swing.JLabel tempoJogoLabel1;
    private javax.swing.JLabel tentativaLabel1;
    private javax.swing.JComboBox<Usuario> usuarioComboBox;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
