package MenuTelas;

import Modelo.Estatistica;
import Modelo.UsuarioLogado;
import Persistencia.DAO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaEstatistica extends javax.swing.JFrame {
    private void obterEstatistica(){
        try{
            var dao = new DAO();
            var estatisticas = dao.obterEstatistica(UsuarioLogado.getUsuario().getId());
            estatisticaComboBox.setModel(
                new DefaultComboBoxModel<Estatistica>(estatisticas.toArray(new Estatistica[]{}))
            );     
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Lista de estatisticas não disponivel.");
        }
    }
    
    private JFrame frame;
    private javax.swing.JComboBox<String> simulacaoComboBox; //OBS: Estava dando conflito então o adicionei.
    
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
        estatisticaComboBox = new javax.swing.JComboBox<>();
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

        getContentPane().add(rankingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 160, -1, -1));
        rankingLabel.setText("Tentativa:");

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

        estatisticaComboBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        estatisticaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estatisticaComboBoxActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jogadorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(abandonadaLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(situacaoLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rankingLabel)
                                .addGap(27, 27, 27)
                                .addComponent(estatisticaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tempoJogoLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(dataSimulacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(acertosLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(acertosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(errosLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(errosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(errosFataisLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(erroFatalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pontuaçãoLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(pontuacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(estatisticaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankingLabel))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acertosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acertosLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errosLabel1)
                    .addComponent(errosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempoJogoLabel1)
                    .addComponent(dataSimulacaoLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errosFataisLabel1)
                    .addComponent(erroFatalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abandonadaLabel2)
                    .addComponent(situacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pontuaçãoLabel1)
                    .addComponent(pontuacaoLabel))
                .addContainerGap(83, Short.MAX_VALUE))
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

    private void estatisticaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estatisticaComboBoxActionPerformed
        var selecionado = (Estatistica) estatisticaComboBox.getSelectedItem();
        
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
    }//GEN-LAST:event_estatisticaComboBoxActionPerformed

    
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
    private javax.swing.JComboBox<Estatistica> estatisticaComboBox;
    private javax.swing.JLabel estatisticasLabel;
    private javax.swing.JLabel jogadorLabel;
    private javax.swing.JLabel linhaAzulLabel;
    private javax.swing.JLabel pontuacaoLabel;
    private javax.swing.JLabel pontuaçãoLabel1;
    private javax.swing.JLabel rankingLabel;
    private javax.swing.JLabel situacaoLabel;
    private javax.swing.JLabel tempoJogoLabel1;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
