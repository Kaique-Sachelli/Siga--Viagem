package Simulacao;

public class SituacaoPontuacao {
    private static SituacaoPontuacao instance = new SituacaoPontuacao();
    private boolean situacaoPA = false;
    private boolean situacaoCCO = false;
    private boolean situacaoLuz = false;
    private boolean situacaoSoleira = false;
    private boolean situacaoEmergencia = false;

    public static SituacaoPontuacao getInstance() {
        return instance;
    }
    
    //=====PA=====//
    public boolean isSituacaoPA() {
        return situacaoPA;
    }

    public void setSituacaoPA(boolean situacao) {
        this.situacaoPA = situacaoPA;
    }   
    
    //=====CCO=====//
    public boolean isSituacaoCCO() {
        return situacaoCCO;
    }

    public void setSituacaoCCO(boolean situacao) {
        this.situacaoCCO = situacao;
    }
    
    //=====Luz=====//
    public boolean isSituacaoLuz() {
        return situacaoLuz;
    }

    public void setSituacaoLuz(boolean situacaoLuz) {
        this.situacaoLuz = situacaoLuz;
    }
    
    //=====Soleira=====//
    public boolean isSituacaoSoleira() {
        return situacaoSoleira;
    }

    public void setSituacaoSoleira(boolean situacaoSoleira) {
        this.situacaoSoleira = situacaoSoleira;
    }
    
    //=====Emergencia=====//
    public boolean isSituacaoEmergencia() {
        return situacaoEmergencia;
    }

    public void setSituacaoEmergencia(boolean situacaoEmergencia) {
        this.situacaoEmergencia = situacaoEmergencia;
    }
}