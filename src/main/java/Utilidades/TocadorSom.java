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
        pararSom(); // para o som anterior
        try {
            File file = new File(caminhoSom);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            setVolume(10f); // começa no volume máximo

            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Erro ao tocar som: " + e.getMessage());
        }
    }
    
    public static void setVolume(int valor) {        
        float volume = valor / 10.0f;
        System.out.println("Volume ajustado para: " + volume);
    }
    
    public static void pararSom() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }

    public static void setVolume(float valorSlider) {
        if (volumeControl != null) {
            float min = volumeControl.getMinimum(); // geralmente -80.0
            float max = volumeControl.getMaximum(); // geralmente 6.0
            float volume = min + (valorSlider / 10.0f) * (max - min);
            volumeControl.setValue(volume);
            mudo = (valorSlider == 0);
        }
    }

    public static void alternarMute() {
        if (mudo) {
            setVolume(volumeAnterior);
        } else {
            volumeAnterior = getVolumeAtual();
            setVolume(0);
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

    public static boolean isMudo() {
        return mudo;
    }
}
