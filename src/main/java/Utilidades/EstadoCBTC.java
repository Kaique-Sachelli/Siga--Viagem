package Utilidades;


public class EstadoCBTC {
    
    
    public enum Posicao { AM, RM }

    
    private static Posicao posicaoAtual = Posicao.AM;

    
    public static Posicao getPosicaoAtual() {
        return posicaoAtual;
    }

    
    public static void setPosicaoAtual(Posicao novaPosicao) {
        posicaoAtual = novaPosicao;
    }
}
