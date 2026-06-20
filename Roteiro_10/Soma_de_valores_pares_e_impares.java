package Roteiro_10;
import java.util.Scanner;

public class Soma_de_valores_pares_e_impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz_dos_numeros_pares_e_impares = new int[4][4];
        int linha = 0;
        int coluna;

        int soma_dos_valores_pares = 0;
        int quantidade_de_valores_impares = 0;

        System.out.println("\n=== PREENCHIMENTO DA MATRIZ ===");
        while (linha < 4) {
            coluna = 0;
            
            while (coluna < 4) {
                System.out.print("Digite o valor para a Linha " + linha + ", Coluna " + coluna + ": ");
                matriz_dos_numeros_pares_e_impares[linha][coluna] = sc.nextInt();

                if (matriz_dos_numeros_pares_e_impares[linha][coluna] % 2 == 0) {
                    soma_dos_valores_pares = soma_dos_valores_pares + matriz_dos_numeros_pares_e_impares[linha][coluna];
                } else {
                    quantidade_de_valores_impares = quantidade_de_valores_impares + 1;
                }

                coluna = coluna + 1;
            }
            linha = linha + 1;
        }

        System.out.println("\n=== RESULTADOS DA MATRIZ ===");
        System.out.println("A soma de todos os valores PARES é: " + soma_dos_valores_pares);
        System.out.println("A quantidade de valores ÍMPARES é: " + quantidade_de_valores_impares);

        sc.close();
    }
}
