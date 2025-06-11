package Utilidades;

import Simulacao.TelaMenuJogo;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

public class DetectarTecla { // Define a classe.
    
    private static DetectarTecla instance = new DetectarTecla(); // Cria um objeto instance

    public static DetectarTecla getInstance() { // Getter, que serve para acessar os atributos da classe.
        return instance;
    }
    
    public void configurarTeclaESC(JFrame frame) { // Método.
     
        JRootPane rootPane = frame.getRootPane(); // Obtem o painel principal, que faz mapeamento das teclas e ações.

        Action acaoEsc = new AbstractAction() { // Cria uma ação para quando a tecla ESC for precionada.
            @Override
            public void actionPerformed(ActionEvent e) { // Método é chamado quando o ESC é precionado.
                frame.dispose();
                TelaMenuJogo janelaMenuJogo = new TelaMenuJogo(frame);
                janelaMenuJogo.setVisible(true);
            }
        };
        
        // Ligando a tecla ESC a essa ação
        KeyStroke teclaEsc = KeyStroke.getKeyStroke("ESCAPE"); // Cria um objeto KeyStroke que representa a tecla ESC.
        
        // Quando a janela estiver em foco e a tecla ESC for precionada, execute a ação associada a string acaoESC.
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(teclaEsc, "acaoEsc"); 
        
        rootPane.getActionMap().put("acaoEsc", acaoEsc); //  Associa o nome "acaoEsc" com a ação definida anteriormente.
    }
}