
package Utilidades;


public class EstadoReversora {
    
    

        public enum Posicao {
            FRENTE,
            NEUTRO
        }

        private static Posicao posicaoAtual = Posicao.FRENTE;

        public static Posicao getPosicaoAtual() {
            return posicaoAtual;
        }

        public static void setPosicaoAtual(Posicao novaPosicao) {
            posicaoAtual = novaPosicao;
        }
    }

    
    
