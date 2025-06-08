
package Utilidades;

public class DetectarErroFatal {
    private static DetectarErroFatal instance = new DetectarErroFatal();
    private boolean erroFatal = false;

    public static DetectarErroFatal getInstance() {
        return instance;
    }
    
    public boolean isErroFatal() {
        return erroFatal;
    }

    public void setErroFatal(boolean erroFatal) {
        this.erroFatal = erroFatal;
    }   
}