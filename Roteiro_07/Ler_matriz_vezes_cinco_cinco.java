package Roteiro_07;
import java.util.Scanner;

public class Ler_matriz_vezes_cinco_cinco {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matriz_de_numeros_lendo_cinco = new int[4][3];

        for (int wi = 0; wi < 4; wi++){
            for(int io = 0; io < 3; io++){
                System.out.print("Digite numeros para adicionar a posição: [ " + wi + " ] [ " + io+  " ]: ");
                matriz_de_numeros_lendo_cinco[wi][io] = sc.nextInt();
            }
        }

        System.out.println("\n=== RESULTADO ===");
        for(int cio = 0; cio < 4; cio++){
            for(int vio = 0; vio < 3; vio++){
                if (matriz_de_numeros_lendo_cinco[cio][vio] == 55) {
                    System.out.println("O número 55 aparece na: [ " + cio + " ] [ " + vio + " ] ");
                }
            }
        }

        sc.close();
    }
}
