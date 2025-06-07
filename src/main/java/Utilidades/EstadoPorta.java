package Utilidades;

public class EstadoPorta {
    
    public enum Posicao {
        ABERTA,
        CINTURAO,
        FITA,
        FECHADA
    }

    private static Posicao posicaoAtual = Posicao.ABERTA;

    public static Posicao getPosicaoAtual() {
        return posicaoAtual;
    }

    public static void setPosicaoAtual(Posicao novaPosicao) {
        posicaoAtual = novaPosicao;
    }
}
