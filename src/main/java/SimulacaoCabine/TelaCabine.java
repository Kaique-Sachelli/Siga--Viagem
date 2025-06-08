package SimulacaoCabine;

import Utilidades.EstadoCBTC;
import Utilidades.EstadoItem;
import javax.swing.JFrame;
import Utilidades.EstadoReversora;

public class TelaCabine extends javax.swing.JFrame {
   
   private JFrame frame;
   
    public TelaCabine() {
        initComponents();
        setResizable(false);
        Utilidades.DetectarTecla.getInstance().configurarTeclaESC(this);
    }

    public TelaCabine(JFrame frame) {
        this();
        frame.setVisible(false);
        this.frame = frame;
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        dduButton = new javax.swing.JButton();
        aduButton = new javax.swing.JButton();
        vduButton = new javax.swing.JButton();
        moduloComunicacaoButton = new javax.swing.JButton();
        reversoraButton = new javax.swing.JButton();
        socoConsoleButton = new javax.swing.JButton();
        chavesPainelButton = new javax.swing.JButton();
        limpadorParabrisaButton = new javax.swing.JButton();
        setaEsquerdaButton = new javax.swing.JButton();
        setaDireitaButton = new javax.swing.JButton();
        setaBaixoButton = new javax.swing.JButton();
        cabineLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cabine");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dduButton.setContentAreaFilled(false);
        dduButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dduButton.setMaximumSize(new java.awt.Dimension(170, 80));
        dduButton.setMinimumSize(new java.awt.Dimension(170, 80));
        dduButton.setPreferredSize(new java.awt.Dimension(170, 80));
        dduButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dduButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dduButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 170, 80));

        aduButton.setContentAreaFilled(false);
        aduButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aduButton.setMaximumSize(new java.awt.Dimension(200, 110));
        aduButton.setMinimumSize(new java.awt.Dimension(200, 110));
        aduButton.setPreferredSize(new java.awt.Dimension(200, 110));
        aduButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aduButtonActionPerformed(evt);
            }
        });
        getContentPane().add(aduButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 200, 110));

        vduButton.setContentAreaFilled(false);
        vduButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vduButton.setMaximumSize(new java.awt.Dimension(200, 100));
        vduButton.setMinimumSize(new java.awt.Dimension(200, 100));
        vduButton.setPreferredSize(new java.awt.Dimension(200, 100));
        vduButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vduButtonActionPerformed(evt);
            }
        });
        getContentPane().add(vduButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 200, 100));

        moduloComunicacaoButton.setContentAreaFilled(false);
        moduloComunicacaoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moduloComunicacaoButton.setMaximumSize(new java.awt.Dimension(100, 50));
        moduloComunicacaoButton.setMinimumSize(new java.awt.Dimension(100, 50));
        moduloComunicacaoButton.setPreferredSize(new java.awt.Dimension(100, 50));
        moduloComunicacaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloComunicacaoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(moduloComunicacaoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 100, 50));

        reversoraButton.setContentAreaFilled(false);
        reversoraButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reversoraButton.setMaximumSize(new java.awt.Dimension(72, 60));
        reversoraButton.setMinimumSize(new java.awt.Dimension(72, 60));
        reversoraButton.setPreferredSize(new java.awt.Dimension(72, 60));
        reversoraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reversoraButtonActionPerformed(evt);
            }
        });
        getContentPane().add(reversoraButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 72, 60));

        socoConsoleButton.setContentAreaFilled(false);
        socoConsoleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socoConsoleButton.setMaximumSize(new java.awt.Dimension(180, 60));
        socoConsoleButton.setMinimumSize(new java.awt.Dimension(180, 60));
        socoConsoleButton.setPreferredSize(new java.awt.Dimension(180, 60));
        socoConsoleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socoConsoleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(socoConsoleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 180, 60));

        chavesPainelButton.setContentAreaFilled(false);
        chavesPainelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chavesPainelButton.setMaximumSize(new java.awt.Dimension(120, 110));
        chavesPainelButton.setMinimumSize(new java.awt.Dimension(120, 110));
        chavesPainelButton.setPreferredSize(new java.awt.Dimension(120, 110));
        chavesPainelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chavesPainelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(chavesPainelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 230, 120, 110));

        limpadorParabrisaButton.setContentAreaFilled(false);
        limpadorParabrisaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpadorParabrisaButton.setMaximumSize(new java.awt.Dimension(150, 30));
        limpadorParabrisaButton.setMinimumSize(new java.awt.Dimension(150, 30));
        limpadorParabrisaButton.setPreferredSize(new java.awt.Dimension(150, 30));
        limpadorParabrisaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpadorParabrisaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(limpadorParabrisaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 357, 150, 30));

        setaEsquerdaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaEsquerda.png"))); // NOI18N
        setaEsquerdaButton.setContentAreaFilled(false);
        setaEsquerdaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setaEsquerdaButton.setPreferredSize(new java.awt.Dimension(100, 100));
        setaEsquerdaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaEsquerdaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(setaEsquerdaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        setaDireitaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/SetaDireita.png"))); // NOI18N
        setaDireitaButton.setContentAreaFilled(false);
        setaDireitaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setaDireitaButton.setPreferredSize(new java.awt.Dimension(100, 100));
        setaDireitaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaDireitaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(setaDireitaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, -1, -1));

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

        cabineLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Painel.jpg"))); // NOI18N
        getContentPane().add(cabineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aduButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aduButtonActionPerformed
        if (EstadoCBTC.getPosicaoAtual() == EstadoCBTC.Posicao.AM) {
            new TelaADU_AM(this).setVisible(true);
        } else {
            new TelaADU_RM(this).setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_aduButtonActionPerformed

    private void dduButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dduButtonActionPerformed
        TelaDDU janelaDDU = new TelaDDU(this);
        janelaDDU.setVisible(true);
    }//GEN-LAST:event_dduButtonActionPerformed

    private void vduButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vduButtonActionPerformed
        TelaVDU janelaVDU = new TelaVDU(this);
        janelaVDU.setVisible(true);
    }//GEN-LAST:event_vduButtonActionPerformed

    private void moduloComunicacaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloComunicacaoButtonActionPerformed
        TelaModuloComunicacao janelaModulo= new TelaModuloComunicacao();
        janelaModulo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_moduloComunicacaoButtonActionPerformed

    private void reversoraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reversoraButtonActionPerformed
        if (EstadoReversora.getPosicaoAtual() == EstadoReversora.Posicao.FRENTE) {
            new TelaReversoraFrente(this).setVisible(true);
        } else {
            new TelaReversoraNeutro(this).setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_reversoraButtonActionPerformed

    private void socoConsoleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socoConsoleButtonActionPerformed
        TelaSocoConsole janelaConsole = new TelaSocoConsole(this);
        janelaConsole.setVisible(true);
    }//GEN-LAST:event_socoConsoleButtonActionPerformed

    private void chavesPainelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chavesPainelButtonActionPerformed
        TelaChavesPainel janelaChavesPainel = new TelaChavesPainel(this);
        janelaChavesPainel.setVisible(true);
    }//GEN-LAST:event_chavesPainelButtonActionPerformed

    private void limpadorParabrisaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpadorParabrisaButtonActionPerformed
        TelaLimpadorParabrisa janelaLimpadorParabrisa = new TelaLimpadorParabrisa(this);
        janelaLimpadorParabrisa.setVisible(true);
    }//GEN-LAST:event_limpadorParabrisaButtonActionPerformed

    private void setaEsquerdaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaEsquerdaButtonActionPerformed
        TelaPortaEsquerda janelaPortaEsquerda = new TelaPortaEsquerda(this);
        janelaPortaEsquerda.setVisible(true);
    }//GEN-LAST:event_setaEsquerdaButtonActionPerformed

    private void setaDireitaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaDireitaButtonActionPerformed
        if(Utilidades.EstadoItem.getInstance().isChaveServico()){
            TelaColunaLateral janelaColunaLateral = new TelaColunaLateral(this);
            janelaColunaLateral.setVisible(true);
            this.dispose();
        } else{
            TelaColunaLateralChave janelaColunaLateralChave = new TelaColunaLateralChave(this);
            janelaColunaLateralChave.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_setaDireitaButtonActionPerformed

    private void setaBaixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaBaixoButtonActionPerformed
        if(EstadoItem.getInstance().isFitaCinturao()){
            TelaCabineTrasVazia janelaCabineTrasVazia = new TelaCabineTrasVazia(this);
            janelaCabineTrasVazia.setVisible(true);
        }else{
            TelaCabineTras janelaCabineTras = new TelaCabineTras(this);
            janelaCabineTras.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_setaBaixoButtonActionPerformed
     
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
            java.util.logging.Logger.getLogger(TelaCabine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCabine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCabine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCabine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCabine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aduButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel cabineLabel;
    private javax.swing.JButton chavesPainelButton;
    private javax.swing.JButton dduButton;
    private javax.swing.JButton limpadorParabrisaButton;
    private javax.swing.JButton moduloComunicacaoButton;
    private javax.swing.JButton reversoraButton;
    private javax.swing.JButton setaBaixoButton;
    private javax.swing.JButton setaDireitaButton;
    private javax.swing.JButton setaEsquerdaButton;
    private javax.swing.JButton socoConsoleButton;
    private javax.swing.JButton vduButton;
    // End of variables declaration//GEN-END:variables
}
;