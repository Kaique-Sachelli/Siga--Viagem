package Utilidades;

public class EstadoSom {
    public static boolean somDesligado = false;
    public static int volume = 10;

    public static void setSomDesligado(boolean desligado) {
        somDesligado = desligado;
        if (TocadorSom.temSomTocando()) {
            TocadorSom.setVolume(desligado ? 0f : volume / 10f);
        }
    }

    public static void setVolume(int novoVolume) {
        volume = Math.max(0, Math.min(10, novoVolume)); // Clamp de 0 a 10
        if (!somDesligado) {
            TocadorSom.setVolume(volume / 10f);
        }
    }


    public static int getVolume() {
        return volume;
    }

    public static boolean isSomDesligado() {
        return somDesligado;
    }
}