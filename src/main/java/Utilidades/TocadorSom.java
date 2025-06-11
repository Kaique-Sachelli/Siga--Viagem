package Utilidades;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class TocadorSom {

    public static void tocarSom(String caminhoRelativo) {
        try {
            URL somURL = TocadorSom.class.getClassLoader().getResource(caminhoRelativo);
            if (somURL == null) {
                System.err.println("Som não encontrado: " + caminhoRelativo);
                return;
            }

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(somURL);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Erro ao tocar o som: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
