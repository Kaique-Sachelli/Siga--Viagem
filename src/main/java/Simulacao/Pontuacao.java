package Simulacao;

import java.util.*;

public class Pontuacao {
    private static Map <String, Integer> gabarito = new LinkedHashMap<>();
    static {
        gabarito.put("R", 1); // Reversora em Neutro -----
        gabarito.put("RM", 1); // Chave CBTC em RM -----
        gabarito.put("PA", 1); // Dar PA -----
        gabarito.put("FBL", 1); // Fecha portas pela Boleira Lateral -----
        gabarito.put("CCO", 2); // Informa o CCO -----
        gabarito.put("PA", 1); // Dar PA -----
        gabarito.put("CACS", 3); // Pega cinturão, chave e adesivo
        gabarito.put("OS", 1); // Olhar soleira (verficar se há algo obstruindo a porta) -----
        gabarito.put("EM", 1); // Verficar se há Emergência dentro do carro -----
        gabarito.put("CCO", 2); // Informa o CCO pelo rádio -----
        gabarito.put("ISO", 3); // Ir no painel e isolar a porta com o cinturão
        gabarito.put("FEC", 2); // Puxar a porta para fechar, depois confirmar se travou
        gabarito.put("ADE", 2); // Colar o adesivo na porta
        gabarito.put("LPE", 2); // Conferir luz externas do carro -----
        gabarito.put("CCO", 2); // Informa o CCO -----
        gabarito.put("PA", 1); // Dar PA -----
        gabarito.put("ICS", 1); // Inserir Chave de Serviço
        gabarito.put("AM", 1); // Chave CBTC em AM -----
        gabarito.put("R", 1); // Reversora em Frente -----

        // FIM 19 passos
    }
    private static Map <String, Integer> erros = new LinkedHashMap<>();
    static {
        // ANTES DA RESOLUÇÃO DO PROBLEMA DO LADO DE FORA
        erros.put("R", -1); // Reversora em Frente -----
        erros.put("RM", -1); // Chave CBTC em AM -----
        erros.put("PA", 0); // Dar PA -----
        erros.put("FBL", -1); // Abrir portas pela Boleira Lateral -----
        erros.put("CCO", 0); // Informa o CCO -----
        erros.put("PA", 0); // Dar PA -----
        erros.put("OS", 0); // Olhar soleira (verficar se há algo obstruindo a porta) -----
        erros.put("EM", 0); // Verficar se há Emergência dentro do carro -----
        erros.put("CCO", 0); // Informa o CCO pelo rádio -----
        
        // APÓS A RESOLUÇÃO DO PROBLEMA DO LADO DE FORA
        erros.put("LPE", 0); // Conferir luz externas do carro -----
        erros.put("CCO", 0); // Informa o CCO -----
        erros.put("PA", 0); // Dar PA -----
        erros.put("AM", -1); // Chave CBTC em RM -----
        erros.put("R", -1); // Reversora em Neutro -----
    }
    private static ArrayList <String> atividadesRealizadas = new ArrayList<>();
    
    public static void zerarAtividadesRealizadas(){
        atividadesRealizadas.clear();
    }
    
    public static int contarAtividadesRealizadas(){
        return atividadesRealizadas.size();
    }

    public static void registrarAtividade(String atividadeRealizada){
        atividadesRealizadas.add(atividadeRealizada);
    }
    
    public static int calcularAcertos(){
        int total = 0;
        for (String atividadeRealizada : atividadesRealizadas){
            if(gabarito.getOrDefault(atividadeRealizada, 0) > 0){
                total += 1;
            }
        }
        return total;
    }
    public static int calcularPontuacao(){
        int total = 0;
        if(atividadesRealizadas.get(0).equals("PA")){
            total += 2;
        }
        for (String atividadeRealizada : atividadesRealizadas){
            total += gabarito.getOrDefault(atividadeRealizada, 0);
        }
        return total;
    }
}