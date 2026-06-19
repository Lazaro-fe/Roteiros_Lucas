package Roteiro_07;
import java.util.Scanner;

public class Soma_entre_matrizes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] primeira_matriz = new int[3][3];
        int[][] segunda_matriz = new int[3][3];
        int[][] resultado_das_somas_das_matrizes = new int[3][3];

        System.out.println("\n== PRIMEIRA MATRIZ ==");
        for(int sio = 0; sio < 3; sio++){
            for(int si = 0; si < 3; si++){
                System.out.print("Digite número para as posições: [ " + sio + "] [ " + si + " ]: ");
                primeira_matriz[sio][si] = sc.nextInt();
            }
        }

        System.out.println("\n== SEGUNDA MATRIZ ==");
        for(int gio = 0; gio < 3; gio++){
            for(int vi = 0; vi < 3; vi++){
                System.out.print("Digite um número para as posições: [ " + gio + " ] [ " + vi + " ]: ");
                segunda_matriz[gio][vi] = sc.nextInt();
            }
        }

        System.out.println("\n=== RESULTADO DAS SOMAS DAS MATRIZES ===");
        for(int xio = 0; xio < 3; xio++){
            for(int aju = 0; aju < 3; aju++){
                resultado_das_somas_das_matrizes[xio][aju] = primeira_matriz[xio][aju] + segunda_matriz[xio][aju];
                System.out.print(resultado_das_somas_das_matrizes[xio][aju] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
