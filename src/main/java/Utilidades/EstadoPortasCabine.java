
package Utilidades;

public class EstadoPortasCabine {
    private static EstadoPortasCabine instance = new EstadoPortasCabine();
    private boolean esquerdaAberta = true;

    public static EstadoPortasCabine getInstance() {
        return instance;
    }

    public boolean isEsquerdaAberta() {
        return esquerdaAberta;
    }

    public void setEsquerdaAberta(boolean esquerdaAberta) {
        this.esquerdaAberta = esquerdaAberta;
    }
}
