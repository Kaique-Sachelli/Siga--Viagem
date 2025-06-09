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
        errosFataisLabel = new javax.swing.JLabel();
        errosLabel = new javax.swing.JLabel();
        dataSimulacaoLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        pontuaçãoLabel1 = new javax.swing.JLabel();
        pontuacaoLabel = new javax.swing.JLabel();

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

        linhaAzulLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImagens/linhaAzul.png"))); // NOI18N

        rankingLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rankingLabel.setText("Simulação:");

        acertosLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        acertosLabel1.setText("Acertos:");

        errosLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosLabel1.setText("Erros:");

        errosFataisLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosFataisLabel1.setText("Erros Graves:");

        tempoJogoLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tempoJogoLabel1.setText("Data da Simulação:");

        jogadorLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jogadorLabel.setText("Jogador:");

        simulacaoComboBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        simulacaoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulacaoComboBoxActionPerformed(evt);
            }
        });

        acertosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        acertosLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        acertosLabel.setText("Acertos");

        errosFataisLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosFataisLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        errosFataisLabel.setText("Erros Graves");

        errosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        errosLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        errosLabel.setText("Erros");

        dataSimulacaoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dataSimulacaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dataSimulacaoLabel.setText("Data Simulação");

        usuarioLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        usuarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarioLabel.setText("Jogador");

        pontuaçãoLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pontuaçãoLabel1.setText("Pontuação:");

        pontuacaoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pontuacaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pontuacaoLabel.setText("Pontuação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rankingLabel)
                                .addGap(27, 27, 27)
                                .addComponent(simulacaoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tempoJogoLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(dataSimulacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(errosFataisLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(errosFataisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(acertosLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(acertosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(errosLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(errosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pontuaçãoLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(pontuacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jogadorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(372, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(linhaAzulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(estatisticasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(570, 570, 570)
                            .addComponent(voltarMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jogadorLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simulacaoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankingLabel))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acertosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acertosLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errosLabel1)
                    .addComponent(errosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errosFataisLabel1)
                    .addComponent(errosFataisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pontuaçãoLabel1)
                    .addComponent(pontuacaoLabel))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempoJogoLabel1)
                    .addComponent(dataSimulacaoLabel))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(linhaAzulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(estatisticasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(460, 460, 460)
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

    private void simulacaoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulacaoComboBoxActionPerformed
        var selecionado = (Estatistica) simulacaoComboBox.getSelectedItem();
        
        acertosLabel.setText(String.valueOf((selecionado.getAcertos())));
        
        errosLabel.setText(String.valueOf((selecionado.getErros())));
        
        errosFataisLabel.setText(String.valueOf(selecionado.getErrosFatais()));
        
        pontuacaoLabel.setText(String.valueOf(selecionado.getPontuacao()));
        
        dataSimulacaoLabel.setText(String.valueOf(selecionado.getDataSimulacaoFormatada()));
        
        
        
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
    private javax.swing.JLabel acertosLabel;
    private javax.swing.JLabel acertosLabel1;
    private javax.swing.JLabel dataSimulacaoLabel;
    private javax.swing.JLabel errosFataisLabel;
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
    private javax.swing.JLabel tempoJogoLabel1;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
