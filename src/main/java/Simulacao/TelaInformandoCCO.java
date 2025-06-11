package Simulacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

public class TelaInformandoCCO extends javax.swing.JFrame { // Cria uma nova classe que herda da classe JFrame.

    private JFrame telaAnterior;

    public TelaInformandoCCO(JFrame telaAnterior) {
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

        informandoCCOLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informando CCO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informandoCCOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimulacaoImagens/Informando CCO.jpg"))); // NOI18N
        getContentPane().add(informandoCCOLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel informandoCCOLabel;
    // End of variables declaration//GEN-END:variables
}
