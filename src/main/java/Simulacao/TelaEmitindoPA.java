package Simulacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class TelaEmitindoPA extends javax.swing.JFrame { // Cria uma nova classe que herda da classe JFrame.
    private JFrame telaAnterior;
    
    public TelaEmitindoPA(JFrame telaAnterior) {
        this.telaAnterior = telaAnterior;

        initComponents();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Timer para fechar após 3 segundos
        Timer autoCloseTimer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha esta tela
                if (telaAnterior != null) {
                    telaAnterior.setVisible(true); // Reabre a anterior
                }
            }
        });
        autoCloseTimer.setRepeats(false);
        autoCloseTimer.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emitindoPALabel = new javax.swing.JLabel();

        setTitle("Tela Emitindo PA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emitindoPALabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Módulo de Comunicação - Microfone aberto PA ao vivo.jpg"))); // NOI18N
        getContentPane().add(emitindoPALabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emitindoPALabel;
    // End of variables declaration//GEN-END:variables
}
