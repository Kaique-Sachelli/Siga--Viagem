package Simulacao;

public class SituacaoPA {
    private static SituacaoPA instance = new SituacaoPA();
    private boolean situacao = false;

    public static SituacaoPA getInstance() {
        return instance;
    }
    
    public boolean isSituacaoPA() {
        return situacao;
    }

    public void setSituacaoPA(boolean situacao) {
        this.situacao = situacao;
    }   
}

