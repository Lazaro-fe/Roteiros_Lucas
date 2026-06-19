package Roteiro_07;
import java.util.Scanner;

public class Maior_valor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz_ceo = new int[4][3];

        for(int lu = 0; lu < 4; lu++){
            for(int zo = 0; zo < 3; zo++){
                System.out.print("Digite números para preencher a posição [ " + lu + " ] [ " + zo + " ]: ");
                matriz_ceo[lu][zo] = sc.nextInt();
            }
        }

        int maior_valor_da_matriz_ceo = matriz_ceo[0][0];

        for(int na = 0; na < 4; na++){
            for(int cho = 0; cho < 3; cho++){
                if (matriz_ceo[na][cho] > maior_valor_da_matriz_ceo) {
                    maior_valor_da_matriz_ceo = matriz_ceo[na][cho];
                }
            }
        }

        System.out.println("\n== RESULTADO ==");
        System.out.println("O maior número dessa matriz foi: " + maior_valor_da_matriz_ceo);

        sc.close();
    }
}
