
package Utilidades;

public class AbandonouSimulacao {
    private static AbandonouSimulacao instance = new AbandonouSimulacao();
    private boolean abandonou = false;

    public static AbandonouSimulacao getInstance() {
        return instance;
    }

    public boolean isAbandonou() {
        return abandonou;
    }

    public void setAbandonou(boolean abandonou) {
        this.abandonou = abandonou;
    }
}