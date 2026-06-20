package Roteiro_08;
import java.util.Random;

public class Organizacao_de_matriz_cinco_cinco {
    
    public static void main(String[] args) {
        Random gerando_numericos_para_matriz = new Random();
        
        int[][] matriz_com_valores_sortidos = new int[5][5];
        
        System.out.println("\n=== PREENCHENDO MATRIZ ===");
        for (int bom = 0; bom < 5; bom++) {
            for (int kru = 0; kru < 5; kru++) {
                matriz_com_valores_sortidos[bom][kru] = gerando_numericos_para_matriz.nextInt(100) + 1;
            }
        }
        
        System.out.println("\n== MOSTRANDO A MATRIZ ==");
        for (int lop = 0; lop < 5; lop++) {
            for (int vif = 0; vif < 5; vif++) {
                System.out.print("[ " + matriz_com_valores_sortidos[lop][vif] + " ] ");
            }
            System.out.println();
        }
        
        int[] ajudante_na_organizacao_da_matriz = new int[25];
        int contador_na_organizacao_da_matriz = 0;
        
        for (int miz = 0; miz < 5; miz++) {
            for (int tux = 0; tux < 5; tux++) {
                ajudante_na_organizacao_da_matriz[contador_na_organizacao_da_matriz] = matriz_com_valores_sortidos[miz][tux];
                contador_na_organizacao_da_matriz++;
            }
        }
        
        for (int puz = 0; puz < 25; puz++) {
            for (int dax = 0; dax < 24; dax++) {
                if (ajudante_na_organizacao_da_matriz[dax] > ajudante_na_organizacao_da_matriz[dax + 1]) {
                    int variavel_temporaria_para_trocar_posicao = ajudante_na_organizacao_da_matriz[dax];
                    ajudante_na_organizacao_da_matriz[dax] = ajudante_na_organizacao_da_matriz[dax + 1];
                    ajudante_na_organizacao_da_matriz[dax + 1] = variavel_temporaria_para_trocar_posicao;
                }
            }
        }
        
        contador_na_organizacao_da_matriz = 0;
        for (int nuy = 0; nuy < 5; nuy++) {
            for (int jor = 0; jor < 5; jor++) {
                matriz_com_valores_sortidos[nuy][jor] = ajudante_na_organizacao_da_matriz[contador_na_organizacao_da_matriz];
                contador_na_organizacao_da_matriz++;
            }
        }
        
        System.out.println("\n=== EXIBIÇÃO DA MATRIZ ORDENADA ===");
        for (int kal = 0; kal < 5; kal++) {
            for (int pex = 0; pex < 5; pex++) {
                System.out.print("[ " + matriz_com_valores_sortidos[kal][pex] + " ] ");
            }
            System.out.println();
        }
    }
}