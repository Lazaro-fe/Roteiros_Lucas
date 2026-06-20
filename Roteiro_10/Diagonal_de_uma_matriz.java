package Roteiro_10;
import java.util.Scanner;

public class Diagonal_de_uma_matriz {
    
    public static int somarDiagonalPrincipal(int[][] matriz_para_analisar) {
        int soma_da_diagonal_principal = 0;
        int linha_da_matriz = 0;
        int coluna_da_matriz;

        while (linha_da_matriz < 3) {
            coluna_da_matriz = 0;
            
            while (coluna_da_matriz < 3) {
                if (linha_da_matriz == coluna_da_matriz) {
                    soma_da_diagonal_principal = soma_da_diagonal_principal + matriz_para_analisar[linha_da_matriz][coluna_da_matriz];
                }
                coluna_da_matriz = coluna_da_matriz + 1;
            }
            linha_da_matriz = linha_da_matriz + 1;
        }

        return soma_da_diagonal_principal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz_de_numeros = new int[3][3];
        int linha_da_matriz = 0;
        int coluna_da_matriz;

        System.out.println("=== PREENCHIMENTO DA MATRIZ 3x3 ===");
        while (linha_da_matriz < 3) {
            coluna_da_matriz = 0;
            
            while (coluna_da_matriz < 3) {
                System.out.print("Digite o valor para a Linha " + linha_da_matriz + ", Coluna " + coluna_da_matriz + ": ");
                matriz_de_numeros[linha_da_matriz][coluna_da_matriz] = sc.nextInt();
                coluna_da_matriz = coluna_da_matriz + 1;
            }
            linha_da_matriz = linha_da_matriz + 1;
        }

        int resultado_da_soma = somarDiagonalPrincipal(matriz_de_numeros);

        System.out.println("\n=== ANÁLISE DA DIAGONAL ===");
        System.out.println("O valor da soma da diagonal principal é: " + resultado_da_soma);

        if (resultado_da_soma > 100) {
            System.out.println("Diagonal forte");
        } else {
            System.out.println("Diagonal fraca");
        }

        sc.close();
    }
}
