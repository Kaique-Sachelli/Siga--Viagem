package Simulacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Pontuacao {
    private static Map <String, Integer> gabarito = new LinkedHashMap<>();
    static {
        gabarito.put("R", 1);
        gabarito.put("RM", 1);
        gabarito.put("PA", 1);
    }
    private static List <String> atividadesRealizadas = new ArrayList<>();
    
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
