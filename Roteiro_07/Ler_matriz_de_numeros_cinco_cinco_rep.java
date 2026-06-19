package Roteiro_07;
import java.util.Scanner;

public class Ler_matriz_de_numeros_cinco_cinco_rep {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix_de_numeros = new int[4][3];
        int contador_de_numero_especificado = 0;

        for (int ru = 0; ru < 4; ru++){
            for (int ed = 0; ed < 3; ed++){
                System.out.print("Digite o valor para as posições [" + ru + " ] [ " + ed + "] : ");
                matrix_de_numeros[ru][ed] = sc.nextInt();

                if (matrix_de_numeros[ru][ed] == 55) {
                    contador_de_numero_especificado++;
                }
            }
        }

        System.out.println("O número 55 aparece: " + contador_de_numero_especificado + " vezes");

        sc.close();
    }
}
