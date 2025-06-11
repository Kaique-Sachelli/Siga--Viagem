package MenuTelas;

import Modelo.Estatistica;
import Modelo.UsuarioLogado;
import Persistencia.DAO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList; 

public class TelaEstatistica extends javax.swing.JFrame {
    private void obterEstatistica(){
        try{
            var dao = new DAO();
            var estatisticas = dao.obterEstatistica(UsuarioLogado.getUsuario().getId());
            simulacaoComboBox.setModel(
                new DefaultComboBoxModel<Estatistica>(estatisticas.toArray(new Estatistica[]{}))
            );     
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Lista de estatisticas não disponivel.");
        }
    }
    
    private JFrame frame;
    
    public TelaEstatistica() {
        initComponents();
        usuarioLabel.setText(UsuarioLogado.getUsuario().getNome());
        obterEstatistica();
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
        acertosLabel1 = new javax.swing.JLabel();
        errosLabel1 = new javax.swing.JLabel();
        errosFataisLabel1 = new javax.swing.JLabel();
        tempoJogoLabel1 = new javax.swing.JLabel();
        jogadorLabel = new javax.swing.JLabel();
        simulacaoComboBox = new javax.swing.JComboBox<>();
        acertosLabel = new javax.swing.JLabel();
        erroFatalLabel = new javax.swing.JLabel();
        errosLabel = new javax.swing.JLabel();
        dataSimulacaoLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        pontuaçãoLabel1 = new javax.swing.JLabel();
        pontuacaoLabel = new javax.swing.JLabel();
        situacaoLabel = new javax.swing.JLabel();
        abandonadaLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estatística");
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
        getContentPane().add(voltarMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 542, 220, 60));

        estatisticasLabel.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        estatisticasLabel.setForeground(new java.awt.Color(0, 20, 137));
        estatisticasLabel.setText("ESTATÍSTICAS DO JOGADOR");
        getContentPane().add(estatisticasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 2, 640, 80));

        linhaAzulLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImagens/linhaAzul.png"))); // NOI18N
        getContentPane().add(linhaAzulLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 2, 70, 640));

        rankingLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rankingLabel.setText("Simulação:");
        getContentPane().add(rankingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 160, -1, -1));

        acertosLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        acertosLabel1.setText("Acertos:");
        getContentPane().add(acertosLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 277, -1, -1));

        errosLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosLabel1.setText("Erros:");
        getContentPane().add(errosLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 327, -1, -1));

        errosFataisLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosFataisLabel1.setText("Erro Fatal:");
        getContentPane().add(errosFataisLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 427, -1, -1));

        tempoJogoLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tempoJogoLabel1.setText("Data da Simulação:");
        getContentPane().add(tempoJogoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 377, -1, -1));

        jogadorLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jogadorLabel.setText("Jogador:");
        getContentPane().add(jogadorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 105, -1, -1));

        simulacaoComboBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        simulacaoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulacaoComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(simulacaoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 155, 284, -1));

        acertosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        acertosLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        acertosLabel.setText("Acertos");
        getContentPane().add(acertosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 277, 212, -1));

        erroFatalLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        erroFatalLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        erroFatalLabel.setText("Erro Fatal");
        getContentPane().add(erroFatalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 427, 212, -1));

        errosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        errosLabel.setText("Erros");
        getContentPane().add(errosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 327, 212, -1));

        dataSimulacaoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dataSimulacaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dataSimulacaoLabel.setText("Data Simulação");
        getContentPane().add(dataSimulacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 377, 239, -1));

        usuarioLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        usuarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarioLabel.setText("Jogador");
        getContentPane().add(usuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 105, 212, -1));

        pontuaçãoLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pontuaçãoLabel1.setText("Pontuação:");
        getContentPane().add(pontuaçãoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 529, -1, -1));

        pontuacaoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pontuacaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pontuacaoLabel.setText("Pontuação");
        getContentPane().add(pontuacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 529, 239, -1));

        situacaoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        situacaoLabel.setText("Situação");
        getContentPane().add(situacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 477, -1, -1));

        abandonadaLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        abandonadaLabel2.setText("Situação:");
        getContentPane().add(abandonadaLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 477, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

    private void simulacaoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulacaoComboBoxActionPerformed
        var selecionado = (Estatistica) simulacaoComboBox.getSelectedItem();
        
        acertosLabel.setText(String.valueOf((selecionado.getAcertos())));
        
        errosLabel.setText(String.valueOf((selecionado.getErros())));
        
        if(selecionado.getErroFatal()){
            erroFatalLabel.setText("Erro fatal cometido.");
        }
        else{
            erroFatalLabel.setText("Não cometido.");
        }
        
        pontuacaoLabel.setText(String.valueOf(selecionado.getPontuacao()));
        
        dataSimulacaoLabel.setText(String.valueOf(selecionado.getDataSimulacaoFormatada()));
        
        if(selecionado.isAbandonada()){
            situacaoLabel.setText("Simulação abandonada.");
            
        }
        else{
            situacaoLabel.setText("Simulação concluída.");
        }
    }//GEN-LAST:event_simulacaoComboBoxActionPerformed

    
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
    private javax.swing.JLabel abandonadaLabel2;
    private javax.swing.JLabel acertosLabel;
    private javax.swing.JLabel acertosLabel1;
    private javax.swing.JLabel dataSimulacaoLabel;
    private javax.swing.JLabel erroFatalLabel;
    private javax.swing.JLabel errosFataisLabel1;
    private javax.swing.JLabel errosLabel;
    private javax.swing.JLabel errosLabel1;
    private javax.swing.JLabel estatisticasLabel;
    private javax.swing.JLabel jogadorLabel;
    private javax.swing.JLabel linhaAzulLabel;
    private javax.swing.JLabel pontuacaoLabel;
    private javax.swing.JLabel pontuaçãoLabel1;
    private javax.swing.JLabel rankingLabel;
    private javax.swing.JComboBox<Estatistica> simulacaoComboBox;
    private javax.swing.JLabel situacaoLabel;
    private javax.swing.JLabel tempoJogoLabel1;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
