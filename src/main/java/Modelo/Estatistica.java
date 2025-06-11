
package Modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Estatistica {
    private int tentativa;
    private LocalDateTime dataSimulacao;
    private int erros;
    private int acertos;
    private int pontuacao;
    private boolean erroFatal;
    private boolean abandonada;
    
    public Estatistica(int tentativa, LocalDateTime dataSimulacao, int erros, 
    int acertos, int pontuacao, boolean erroFatal, boolean abandonada){
        this.tentativa = tentativa;
        this.dataSimulacao = dataSimulacao;
        this.erros = erros;
        this.acertos = acertos;
        this.pontuacao = pontuacao;
        this.erroFatal = erroFatal;
        this.abandonada = abandonada;
        
        
    }
    
    // inserindo novo construtor para passar como parametro em salvarEstatistica de DAO
    public Estatistica(int erros, int acertos, int pontuacao, boolean erroFatal, boolean abandonada){
        this.erros = erros;
        this.acertos = acertos;
        this.pontuacao = pontuacao;
        this.erroFatal = erroFatal;
        this.abandonada = abandonada;
        
        
    }
    
    
    public String getDataSimulacaoFormatada(){
        if (this.dataSimulacao == null){
            return "";
        }
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return this.dataSimulacao.format(formatador);
    }
    
    public int getNumeroSimulacao() {
        return tentativa;
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

    public boolean getErroFatal() {
        return erroFatal;
    }

    public boolean isAbandonada() {
        return abandonada;
    }

    public int getTentativa() {
        return tentativa;
    }
    
    
    public String toString(){
        return String.format(
            "%s", tentativa
        );
    }
    
}


