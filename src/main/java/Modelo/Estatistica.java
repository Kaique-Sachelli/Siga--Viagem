
package Modelo;

import java.time.LocalDateTime;

public class Estatistica {
    private int numeroSimulacao;
    private LocalDateTime dataSimulacao;
    private int erros;
    private int acertos;
    private int pontuacao;
    private int errosFatais;
    private boolean abandonada;
    
    public Estatistica(int numeroSimulacao, LocalDateTime dataSimulacao, int erros, 
    int acertos, int pontuacao, int errosFatais, boolean abandonada){
        this.numeroSimulacao = numeroSimulacao;
        this.dataSimulacao = dataSimulacao;
        this.erros = erros;
        this.acertos = acertos;
        this.pontuacao = pontuacao;
        this.errosFatais = errosFatais;
        this.abandonada = abandonada;
        
        
    }

    public int getNumeroSimulacao() {
        return numeroSimulacao;
    }

    public LocalDateTime getDataSimulacao() {
        return dataSimulacao;
    }

    public int getErros() {
        return erros;
    }

    public int getAcertos() {
        return acertos;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getErrosFatais() {
        return errosFatais;
    }

    public boolean isAbandonada() {
        return abandonada;
    }
    public String toString(){
        return String.format(
            "Simulação: %s", numeroSimulacao
        );
    }
    
}


