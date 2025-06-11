package Utilidades;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class TocadorSom {
    private static Clip clip;
    private static FloatControl volumeControl;
    private static float volumeAnterior = 10f;
    private static boolean mudo = false;

    public static void tocarSom(String caminhoSom) {
        pararSom();
        try {
            var url = TocadorSom.class.getClassLoader().getResource(caminhoSom);
            if (url == null) {
                System.err.println("Arquivo de som não encontrado: " + caminhoSom);
                return;
            }

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            setVolume(10f);

            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Erro ao tocar som: " + e.getMessage());
        }
    }
    
    public static void pararSom() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }

    public static void setVolume(float valorSlider) {
        if (volumeControl != null) {
            float min = volumeControl.getMinimum();
            float max = volumeControl.getMaximum();
            float volume = min + (valorSlider / 10.0f) * (max - min);
            volumeControl.setValue(volume);
            mudo = (valorSlider == 0);
        }
    }

    public static float getVolumeAtual() {
        if (volumeControl != null) {
            float min = volumeControl.getMinimum();
            float max = volumeControl.getMaximum();
            float ganho = volumeControl.getValue();
            return ((ganho - min) / (max - min)) * 10f;
        }
        return 10f;
    }
}
