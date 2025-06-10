package Simulacao;

public class SituacaoCCO {
    private static SituacaoCCO instance = new SituacaoCCO();
    private boolean situacao = false;

    public static SituacaoCCO getInstance() {
        return instance;
    }
    
    public boolean isSituacaoCCO() {
        return situacao;
    }

    public void setSituacaoCCO(boolean situacao) {
        this.situacao = situacao;
    }   
}

