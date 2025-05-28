
package Utilidades;


public class EstadoReversora {
    
    

        public enum Posicao {
            NEUTRO,
            FRENTE
        }

        private static Posicao posicaoAtual = Posicao.FRENTE;

        public static Posicao getPosicaoAtual() {
            return posicaoAtual;
        }

        public static void setPosicaoAtual(Posicao novaPosicao) {
            posicaoAtual = novaPosicao;
        }
    }

    
    
