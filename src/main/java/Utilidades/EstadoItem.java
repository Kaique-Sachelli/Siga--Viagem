package Utilidades;

public class EstadoItem {
    private static EstadoItem instance = new EstadoItem();
    private boolean fitaCinturao = false;
    private boolean chaveServico = false;
    private boolean chaveFitaCinturao = false;
    
    public static EstadoItem getInstance(){
        return instance;
    }
    
    public boolean isFitaCinturao() {
        return fitaCinturao;
    }

    public void setFitaCinturao(boolean fitaCinturao) {
        this.fitaCinturao = fitaCinturao;
    }

    public boolean isChaveServico() {
        return chaveServico;
    }

    public void setChaveServico(boolean chaveServico) {
        this.chaveServico = chaveServico;
    }

    public boolean isChaveFitaCinturao() {
        return chaveFitaCinturao;
    }

    public void setChaveFitaCinturao(boolean chaveFitaCinturao) {
        this.chaveFitaCinturao = chaveFitaCinturao;
    }
}