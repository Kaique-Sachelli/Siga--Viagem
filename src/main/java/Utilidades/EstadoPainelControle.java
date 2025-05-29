
package Utilidades;




public class EstadoPainelControle {
    

    public enum Posicao {
        NORMAL,
        ISOL
    }

    private static Posicao posicaoAtual = Posicao.NORMAL;

    public static Posicao getPosicaoAtual() {
        return posicaoAtual;
    }

    public static void setPosicaoAtual(Posicao novaPosicao) {
        posicaoAtual = novaPosicao;
    }
}
