package Utilidades;

public class EstadoSom {
    public static boolean somDesligado = false;
    public static int volume = 10;

    public static void setSomDesligado(boolean desligado) {
        somDesligado = desligado;
        TocadorSom.setVolume(desligado ? 0 : volume);
    }

    public static void setVolume(int novoVolume) {
        volume = novoVolume;
        if (!somDesligado) {
            TocadorSom.setVolume(volume);
        }
    }

    public static int getVolume() {
        return volume;
    }

    public static boolean isSomDesligado() {
        return somDesligado;
    }
}
