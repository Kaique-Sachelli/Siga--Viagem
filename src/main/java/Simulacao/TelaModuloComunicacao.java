package Simulacao;

import Utilidades.Pontuacao;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaModuloComunicacao extends javax.swing.JFrame {
    
    private JFrame frame;
    private Timer timer;
    private long pressStartTime;
    private final int DELAY_MS = 1500; // 3 segundos em milissegundos

    // 1. DECLARE A INSTÂNCIA ÚNICA DA TELAEMITINDOPA AQUI
    private TelaEmitindoPA telaEmitindoPAUnica;

    // 2. CONSTRUTOR PRINCIPAL (APENAS UM!)
    public TelaModuloComunicacao() {
        initComponents();
        setResizable(false);
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);

        // 3. INICIALIZE A TELAEMITINDOPA UMA ÚNICA VEZ AQUI
        telaEmitindoPAUnica = new TelaEmitindoPA(this);

        // Inicialização do timer para o botão de 3 segundos
        timer = new Timer(DELAY_MS, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("TelaModuloComunicacao: Timer do botão disparado - Botão ainda pressionado (erro ou teste)");
            }
        });
        timer.setRepeats(false);
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setaBaixoButton = new javax.swing.JButton();
        listaPASButton = new javax.swing.JButton();
        informandoCCOButton = new javax.swing.JButton();
        moduloComunicacaoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Modulo Comunicacao");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setaBaixoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaBaixo.png"))); // NOI18N
        setaBaixoButton.setContentAreaFilled(false);
        setaBaixoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setaBaixoButton.setPreferredSize(new java.awt.Dimension(100, 100));
        setaBaixoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaBaixoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(setaBaixoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, -1, -1));

        listaPASButton.setContentAreaFilled(false);
        listaPASButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaPASButton.setMaximumSize(new java.awt.Dimension(60, 50));
        listaPASButton.setMinimumSize(new java.awt.Dimension(60, 50));
        listaPASButton.setPreferredSize(new java.awt.Dimension(60, 50));
        listaPASButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaPASButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listaPASButtonMouseReleased(evt);
            }
        });
        listaPASButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPASButtonActionPerformed(evt);
            }
        });
        getContentPane().add(listaPASButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 60, 50));

        informandoCCOButton.setContentAreaFilled(false);
        informandoCCOButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        informandoCCOButton.setMaximumSize(new java.awt.Dimension(60, 60));
        informandoCCOButton.setMinimumSize(new java.awt.Dimension(60, 60));
        informandoCCOButton.setPreferredSize(new java.awt.Dimension(60, 60));
        informandoCCOButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                informandoCCOButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                informandoCCOButtonMouseReleased(evt);
            }
        });
        informandoCCOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informandoCCOButtonActionPerformed(evt);
            }
        });
        getContentPane().add(informandoCCOButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 60, 60));

        moduloComunicacaoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/telaModuloComunicacao.jpg"))); // NOI18N
        getContentPane().add(moduloComunicacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        TelaCabine janelaCabine = new TelaCabine(this);
        janelaCabine.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setaBaixoButtonActionPerformed

    private void listaPASButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPASButtonActionPerformed
     //TelaListaPAS janelaListaPAS = new TelaListaPAS(this);
     //janelaListaPAS.setVisible(true);
     
    }//GEN-LAST:event_listaPASButtonActionPerformed

    private void listaPASButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPASButtonMousePressed
        pressStartTime = System.currentTimeMillis(); // Registra o exato momento em que o botão foi precionado.
        timer.start(); // Inicia o timer.
    }//GEN-LAST:event_listaPASButtonMousePressed

    private void listaPASButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPASButtonMouseReleased
        timer.stop(); // Para o temporizador.
        
        long pressDuration = System.currentTimeMillis() - pressStartTime;
        // Subtrai o tempo inicial(botão precionado), com o tempo final.
        
        if (pressDuration >= DELAY_MS) { // Verifica se o botão foi precionado pelo tempo necessario.
            this.setVisible(false); // Esconde a tela atual
            // Cria e exibe TelaEmitindoPA, passando a tela atual como referência
            TelaEmitindoPA janelaEmitindoPA = new TelaEmitindoPA(this);
            janelaEmitindoPA.setVisible(true);
            if(Utilidades.SituacaoPontuacao.getInstance().isSituacaoPA() == false){
                Pontuacao.registrarAtividade("PA");
                Utilidades.SituacaoPontuacao.getInstance().setSituacaoPA(true);
            } else {
                Pontuacao.registrarErro("PA");
            }
        } else {
            TelaListaPAS janelaListaPAS = new TelaListaPAS(this);
            janelaListaPAS.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_listaPASButtonMouseReleased

    private void informandoCCOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informandoCCOButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_informandoCCOButtonActionPerformed

    private void informandoCCOButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informandoCCOButtonMousePressed
        pressStartTime = System.currentTimeMillis(); // Registra o exato momento em que o botão foi precionado.
        timer.start(); // Inicia o timer.
    }//GEN-LAST:event_informandoCCOButtonMousePressed

    private void informandoCCOButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informandoCCOButtonMouseReleased
        timer.stop(); // Para o temporizador.
        long pressDuration = System.currentTimeMillis() - pressStartTime;
        // Subtrai o tempo inicial(botão precionado), com o tempo final.
        
        if (pressDuration >= DELAY_MS) { // Verifica se o botão foi precionado pelo tempo necessario.
            this.setVisible(false); // Esconde a tela atual

            // Cria e exibe TelaEmitindoPA, passando a tela atual como referência
            TelaInformandoCCO janelaInformandoCCO = new TelaInformandoCCO(this);
            janelaInformandoCCO.setVisible(true);
            if(Utilidades.SituacaoPontuacao.getInstance().isSituacaoCCO() == false){
                Pontuacao.registrarAtividade("CCO");
                Utilidades.SituacaoPontuacao.getInstance().setSituacaoCCO(true);
            } else {
                Pontuacao.registrarErro("CCO");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Para informar CCO precione o botão por 2 segundos.", "Informar CCO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_informandoCCOButtonMouseReleased

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
            java.util.logging.Logger.getLogger(TelaModuloComunicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaModuloComunicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaModuloComunicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaModuloComunicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaModuloComunicacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton informandoCCOButton;
    private javax.swing.JButton listaPASButton;
    private javax.swing.JLabel moduloComunicacaoLabel;
    private javax.swing.JButton setaBaixoButton;
    // End of variables declaration//GEN-END:variables
}
