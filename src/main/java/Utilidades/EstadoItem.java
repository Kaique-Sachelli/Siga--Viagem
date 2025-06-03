package Utilidades;

public class EstadoItem {
    private static EstadoItem instance = new EstadoItem();
    private boolean itemColetado = false;

    public static EstadoItem getInstance(){
        return instance;
    }
    
    public boolean isItemColetado() {
        return itemColetado;
    }

    public void setItemColetado(boolean itemColetado) {
        this.itemColetado = itemColetado;
    }
}
