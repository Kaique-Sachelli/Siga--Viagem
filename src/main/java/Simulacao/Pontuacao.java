package Simulacao;

import java.util.ArrayList;
import java.util.*;

public class Pontuacao {
    private static Map <String, Integer> gabarito = new LinkedHashMap<>();
    static {
        gabarito.put("PA", 2); // Dar PA -----
        gabarito.put("R", 1); // Reversora em Neutro
        gabarito.put("RM", 1); // Chave CBTC em RM
        gabarito.put("FBL", 1); // Fecha portas pela Boleira Lateral
        gabarito.put("CCO", 2); // Informa o CCO -----
        gabarito.put("PA", 1); // Dar PA -----
        gabarito.put("CACS", 3); // Pega cinturão, chave e adesivo *****
        gabarito.put("OS", 1); // Olhar soleira (verficar se há algo obstruindo a porta)
        gabarito.put("EM", 1); // Verficar se há Emergência dentro do carro
        gabarito.put("RAD", 2); // Informa o CCO pelo rádio -----
        gabarito.put("ISO", 3); // Ir no painel e isolar a porta com o cinturão
        gabarito.put("FEC", 2); // Puxar a porta para fechar, depois confirmar se travou *****
        gabarito.put("ADE", 2); // Colar o adesivo na porta *****
        gabarito.put("LPE", 2); // Conferir luz externas do carro
        gabarito.put("CCO", 2); // Informa o CCO -----
        gabarito.put("PA", 1); // Dar PA -----
        gabarito.put("ICS", 1); // Inserir Chave de Serviço -----
        gabarito.put("AM", 1); // Chave CBTC em AM
        gabarito.put("R", 1); // Reversora em Frente
        
        // FIM        
    }
    
    private static ArrayList <String> atividadesRealizadas = new ArrayList<>();
    
    public static void registrarAtividade(String atividadeRealizada){
        atividadesRealizadas.add(atividadeRealizada);
    }
    
    public static int calcularPontuacao(){
        int total = 0;
        for (String atividadeRealizada : atividadesRealizadas){
            total += gabarito.getOrDefault(atividadeRealizada, 0);
        }
        return total;
    }
}
