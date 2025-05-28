
package SimulacaoCabine;

public class Inventario {
    private static Inventario instance = new Inventario();
    private boolean itemColetado = false;

    public static Inventario getInstance(){
        return instance;
    }
    
    public boolean isItemColetado() {
        return itemColetado;
    }

    public void setItemColetado(boolean itemColetado) {
        this.itemColetado = itemColetado;
    }
}
