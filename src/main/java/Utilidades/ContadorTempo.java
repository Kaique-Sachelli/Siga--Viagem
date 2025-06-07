package Utilidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class ContadorTempo extends JFrame{ // Cria uma classe que herda o JFrame.
    
    private JFrame telaAnterior; // Atributo para armazenar a tela anterior

    // Construtor que recebe a tela anterior
    public ContadorTempo(JFrame telaAnterior) {
        this.telaAnterior = telaAnterior;

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        // Timer para fechar após 3 segundos
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual
                telaAnterior.setVisible(true); // Reexibe a tela anterior
            }
        });

        timer.setRepeats(false); // Executa só uma vez.
        timer.start(); // Inicia o timer.
    }
}