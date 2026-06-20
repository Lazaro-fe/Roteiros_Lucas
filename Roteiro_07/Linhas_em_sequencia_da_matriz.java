package Roteiro_07;
import java.util.Scanner;

public class Linhas_em_sequencia_da_matriz {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix_sequencial = new int[3][2];
        int[][] matriz_sequencial_dois = new int[3][2];

        for(int hu = 0; hu < 3; hu++){
            for(int ty = 0; ty < 2; ty++){
                System.out.print("Digite valores para preencher a matriz [ " + hu + " ] [ " + ty + " ]:");
                matrix_sequencial[hu][ty] = sc.nextInt();
            }
        }

        int adicionando_valor = 1;
        System.out.println("\n== SEGUNDA MATRIZ ==");
        for(int po = 0; po < 3; po++){
            for(int xi = 0; xi < 2; xi++){
                matriz_sequencial_dois[po][xi] = matrix_sequencial[po][xi] + adicionando_valor;
                adicionando_valor++;
                System.out.print(matriz_sequencial_dois[po][xi] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}